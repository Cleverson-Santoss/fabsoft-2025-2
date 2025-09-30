package br.vesto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.vesto.fabsoft_backend.entity.Empresa;

@Repository
public interface EmpresaRepository 
    extends JpaRepository<Empresa, Long>{
        // Busca por nome
        List<Empresa> findByNomeContainingIgnoreCase(String nome);

}
