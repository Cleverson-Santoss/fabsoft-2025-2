package br.vesto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.vesto.fabsoft_backend.entity.Material;

@Repository
public interface MaterialRepository
    extends JpaRepository<Material,Long> {
        // Busca todos os materiais de uma empresa
        List<Material> findByEmpresaId(Long empresaId);
        //Busca todos os materiais de uma categoria
        List<Material> findByCategoriaId(Long categoriaId);
    
}
