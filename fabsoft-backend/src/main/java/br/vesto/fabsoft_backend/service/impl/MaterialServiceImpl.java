package br.vesto.fabsoft_backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.vesto.fabsoft_backend.entity.Material;
import br.vesto.fabsoft_backend.repository.MaterialRepository;
import br.vesto.fabsoft_backend.service.MaterialService;

@Service
public class MaterialServiceImpl 
    implements MaterialService{

    @Autowired    
    private MaterialRepository repository;

    @Override
    public List<Material> getAll(){
        return repository.findAll();
    }

    @Override
    public Material save(Material material) {
        return repository.save(material);
    }

    @Override
    public Material update(long id, Material material) throws Exception {
    
        var materialAntigo = repository.getById(id);
        if (materialAntigo == null) {
            throw new Exception("Material inexistente");
        }

        materialAntigo.setNome(material.getNome());
        materialAntigo.setQuantidade(material.getQuantidade());
        materialAntigo.setDescricao(material.getDescricao());
        materialAntigo.setCategoria(material.getCategoria());

        repository.save(materialAntigo);

        return materialAntigo;
    }

    @Override
    public Material delete(long id) throws Exception {

        var materialAntigo = repository.getById(id);
        if (materialAntigo == null) {
            throw new Exception("Material inexistente");
        }

        repository.delete(materialAntigo);
        return materialAntigo;
    }



}
