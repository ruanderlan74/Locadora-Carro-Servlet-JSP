package br.com.ada.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente  implements Entidade{
    private String nome;

    private String documento;

    public Cliente(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    public String getId() {
        return documento;
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "Nome: "+nome+", Documento: "+ documento;
    }
}