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

import br.vesto.fabsoft_backend.entity.Material;
import br.vesto.fabsoft_backend.service.MaterialService;

@RestController
@RequestMapping("/api/v1/materiais")
public class MaterialController {

    @Autowired
    private MaterialService service;

    @GetMapping
    public ResponseEntity<List<Material>> getMaterial(){

        var listaMaterial = service.getAll();

        return new ResponseEntity<List<Material>>(listaMaterial,
        HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Material> save(@RequestBody Material material){
        if(material == null){
            return ResponseEntity.badRequest().build();
        }
        if(material.getId() == 0){
            material = service.save(material);
            return new ResponseEntity<Material>(material, HttpStatus.OK);
        }
        return ResponseEntity.badRequest().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Material> 
    update(@RequestBody Material material,
        @PathVariable long id){
        
    if(id <= 0 || material == null){
        return ResponseEntity.badRequest().build();
    }

    try {
        material = service.update(id, material);
        return new ResponseEntity<Material>(material,
            HttpStatus.OK);
    } catch (Exception e) {
        return ResponseEntity.notFound().build();
    }

}

}
