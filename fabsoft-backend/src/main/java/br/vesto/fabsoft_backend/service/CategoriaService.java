package br.vesto.fabsoft_backend.service;

import java.util.List;

import br.vesto.fabsoft_backend.entity.Categoria;

public interface CategoriaService {
    List<Categoria> getAll();
    Categoria save(Categoria categoria);
    Categoria update(long id, Categoria categoria) throws Exception;
    Categoria delete(long id) throws Exception;

}
