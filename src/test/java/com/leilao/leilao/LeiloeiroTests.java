package com.leilao.leilao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LeiloeiroTests {

    @Test
    public void testarRetornarMaiorLance(){
        Usuario usuario = new Usuario(1, "Vinicius");
        Lance maiorLance = new Lance(usuario, 1000);
        List<Lance> lances = new ArrayList<>();
        lances.add(new Lance(usuario, 100));
        lances.add(maiorLance);
        lances.add(new Lance(usuario, 200));
        Leilao leilao = new Leilao(lances);

        Leiloeiro leiloeiro = new Leiloeiro("Cezar", leilao);

        Assertions.assertEquals(leiloeiro.retornarMaiorLance(), maiorLance);
    }

}
