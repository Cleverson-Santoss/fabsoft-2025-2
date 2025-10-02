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

    @Override
    public Categoria update(long id, Categoria categoria) throws Exception {
    
    var categoriaAntiga = repository.getById(id);
    if (categoriaAntiga == null) {
        throw new Exception("Categoria inexistente");
    }

    categoriaAntiga.setNome(categoria.getNome());
    categoriaAntiga.setDescricao(categoria.getDescricao());
    
    repository.save(categoriaAntiga);

    return categoriaAntiga;

    }

}
