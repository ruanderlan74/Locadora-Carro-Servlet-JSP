package br.com.ada.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Carro implements Entidade {
    private String placa;

    private String nome;
    private LocalDateTime dataAlugel;
    private String tipo;

    public Carro(String placa, String nome, String tipo) {
        this.placa = placa;
        this.nome=nome;
        this.tipo = tipo;
    }

    @Override
    public String getId() {
        return placa;
    }

    public String getPlaca() {
        return placa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataAlugel() {
        return dataAlugel;
    }

    public void setDataAlugel(LocalDateTime dataAlugel) {
        this.dataAlugel = dataAlugel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    private String aluguelToString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return dataAlugel!=null?" alugado em "+ dataAlugel.format(formatter)+".":"disponivel";
    }
    @Override
    public String toString() {
        return "Carro:"+placa+", Nome: "+nome+ ", Tipo: "+ tipo +""+aluguelToString() ;
    }
}