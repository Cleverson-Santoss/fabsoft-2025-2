package br.vesto.fabsoft_backend.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.vesto.fabsoft_backend.entity.Categoria;
import br.vesto.fabsoft_backend.service.CategoriaService;


@RestController
@RequestMapping("/api/v1/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService service;

    @GetMapping
    public ResponseEntity<List<Categoria>> getCategoria(){
        var listaCategoria = service.getAll();

        return new ResponseEntity<List<Categoria>>(listaCategoria,
        HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Categoria> save(@RequestBody Categoria categoria){
        if(categoria == null){
            return ResponseEntity.badRequest().build();
        }
        if(categoria.getId() == 0){
            categoria = service.save(categoria);
            return new ResponseEntity<Categoria>(categoria, HttpStatus.OK);
        }
        return ResponseEntity.badRequest().build();
    }
}
