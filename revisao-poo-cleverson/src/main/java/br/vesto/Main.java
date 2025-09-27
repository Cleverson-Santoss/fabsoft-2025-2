package br.vesto;

import br.vesto.entity.Categoria;
import br.vesto.entity.Material;

public class Main {
    public static void main(String[] args) {
        
        var material1 = new Material();

         material1.setNome("Vaso Pequeno");
         material1.setDescricao("Vaso pequeno de plantas");
         material1.setCodigo(001);

        var material2 = new Material();
         material2.setNome("Vaso Médio");
         material2.setDescricao("Vaso médio de planta");
         material2.setCodigo(002);
         
         var material3 = new Material();
         material2.setNome("Vaso Grande");
         material2.setDescricao("Vaso grande de planta");
         material2.setCodigo(003);

         Categoria categoria = new Categoria("Vasos","Todos os tipos de vasos para as plantas" );

         material1.setCategoria(categoria);

         categoria.getListaMaterial().add(material1);
         categoria.getListaMaterial().add(material2);
         categoria.getListaMaterial().add(material3);

         System.out.println();
    }
}