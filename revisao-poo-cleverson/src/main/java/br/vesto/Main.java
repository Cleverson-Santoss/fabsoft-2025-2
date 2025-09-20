package br.vesto;

import br.vesto.entity.Categoria;
import br.vesto.entity.Material;

public class Main {
    public static void main(String[] args) {
        
        var material = new Material();

         material.setNome("Vaso Pequeno");
         material.setDescricao("Vaso pequeno de plantas");
         material.setCodigo(001);

         Categoria categoria = new Categoria("Vasos","Todos os tipos de vasos para as plantas" );

         material.setCategoria(categoria);
    }
}