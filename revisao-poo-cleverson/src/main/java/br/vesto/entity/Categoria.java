package br.vesto.entity;

import java.util.ArrayList;

public class Categoria {
    String nome;
    String descricao;
    private ArrayList<Material> listaMaterial = 
            new ArrayList<Material>();


    public ArrayList<Material> getListaMaterial() {
        return listaMaterial;
    }


    public void setListaMaterial(ArrayList<Material> listaMaterial) {
        this.listaMaterial = listaMaterial;
    }


    public Categoria(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}


