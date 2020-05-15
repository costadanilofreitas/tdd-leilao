package com.leilao.leilao;

import java.util.List;

public class Leiloeiro {

    private String nome;
    private Leilao leilao;

    public Leiloeiro(String nome, Leilao leilao) {
        this.nome = nome;
        this.leilao = leilao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Leilao getLeilao() {
        return leilao;
    }

    public void setLeilao(Leilao leilao) {
        this.leilao = leilao;
    }

    public Lance retornarMaiorLance(){
        List<Lance> lances = this.leilao.getLances();
        Lance lance = lances.get(0);

        for (Lance l: lances){
            if(l.getValorDoLance() > lance.getValorDoLance()){
                lance = l;
            }
        }
        return lance;
    }
}
