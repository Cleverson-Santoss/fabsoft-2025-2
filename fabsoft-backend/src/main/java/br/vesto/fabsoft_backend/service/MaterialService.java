package br.vesto.fabsoft_backend.service;

import java.util.List;

import br.vesto.fabsoft_backend.entity.Material;

public interface MaterialService {
    List<Material> getAll();
    Material save(Material material);
}
