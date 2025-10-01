package br.vesto.fabsoft_backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.vesto.fabsoft_backend.entity.Empresa;
import br.vesto.fabsoft_backend.repository.EmpresaRepository;
import br.vesto.fabsoft_backend.service.EmpresaService;

@Service
public class EmpresaServiceImpl 
    implements EmpresaService{

    @Autowired    
    private EmpresaRepository repository;

    @Override
    public List<Empresa> getAll() {
       return repository.findAll(); 
    }

}
