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

}
