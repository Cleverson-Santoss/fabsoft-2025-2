package br.vesto.fabsoft_backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.vesto.fabsoft_backend.entity.Categoria;
import br.vesto.fabsoft_backend.repository.CategoriaRepository;
import br.vesto.fabsoft_backend.service.CategoriaService;

@Service
public class CategoriaServiceImpl 
    implements CategoriaService{

    @Autowired    
    private CategoriaRepository repository;

    @Override
    public List<Categoria> getAll() {
        return repository.findAll();
    }

    @Override
    public Categoria save(Categoria categoria) {
        return repository.save(categoria);
    }

}
