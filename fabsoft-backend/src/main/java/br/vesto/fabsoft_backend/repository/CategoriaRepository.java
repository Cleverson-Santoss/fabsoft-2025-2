package br.vesto.fabsoft_backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.vesto.fabsoft_backend.entity.Categoria;

@Repository
public interface CategoriaRepository 
    extends JpaRepository<Categoria, Long>{
        //Busca todas as categorias de uma empresa
        List<Categoria> findByEmpresaId(Long empresaId);
}
