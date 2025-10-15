import { Component } from '@angular/core';
import { Empresa } from '../model/empresa';
import { EmpresaService } from '../service/empresa.service';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';



@Component({
  selector: 'app-empresa',
  imports: [HttpClientModule, CommonModule],
  templateUrl: './empresa.html',
  styleUrl: './empresa.css',
  providers: [EmpresaService]
})
export class EmpresaComponent {

  listaEmpresa: Empresa[] = []

  constructor(private empresaService: EmpresaService){}

  ngOnInit() {
    console.log('Carregando empresas...')
    this.empresaService.getEmpresas().subscribe( empresas => {
      this.listaEmpresa = empresas
    })
  }

}
