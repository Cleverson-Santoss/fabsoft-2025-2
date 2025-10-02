package br.vesto.fabsoft_backend.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.vesto.fabsoft_backend.entity.Empresa;
import br.vesto.fabsoft_backend.service.EmpresaService;

@RestController
@RequestMapping("/api/v1/empresas")
public class EmpresaController {

    @Autowired
    private EmpresaService service;

    @GetMapping
    public ResponseEntity<List<Empresa>> getEmpresa(){

        var listaEmpresa = service.getAll();

        return new ResponseEntity<List<Empresa>>(listaEmpresa,
        HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Empresa> save(@RequestBody Empresa empresa){
        if(empresa == null){
            return ResponseEntity.badRequest().build();
        }
        if(empresa.getId() == 0){
            empresa = service.save(empresa);
            return new ResponseEntity<Empresa>(empresa, HttpStatus.OK);
        }
        return ResponseEntity.badRequest().build();

    }

    @PutMapping("/{id}")
    public ResponseEntity<Empresa> 
        update(@RequestBody Empresa empresa,
            @PathVariable long id){
            if(id <= 0 || empresa == null){
                return ResponseEntity.badRequest().build();
            }

            try {
                empresa = service.update(id, empresa);
                return new ResponseEntity<Empresa>(empresa,
                    HttpStatus.OK);
            } catch (Exception e) {
                return ResponseEntity.notFound().build();
            }

        }  
}
