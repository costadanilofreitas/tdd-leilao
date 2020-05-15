package com.leilao.leilao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.management.InvalidAttributeValueException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeilaoTests {

    @Test
    public void testarValidacaoDeLance(){
        Usuario usuario = new Usuario(1, "Vinicius");
        Lance lance = new Lance(usuario, 100.00);
        Leilao leilao = new Leilao();
        List<Lance> lances = new ArrayList();
        leilao.setLances(lances);

        Assertions.assertTrue(leilao.validarLance(lance));
    }

    @Test
    public void testarValidacaoDeLanceInvalido(){
        Usuario usuario = new Usuario(1, "Vinicius");
        Lance lance = new Lance(usuario, 0);
        Leilao leilao = new Leilao();
        List<Lance> lances = new ArrayList();
        leilao.setLances(lances);

        Assertions.assertFalse(leilao.validarLance(lance));
    }

    @Test
    public void testarValidacaoDeLanceMenorLance(){
        Usuario usuario = new Usuario(1, "Vinicius");
        Lance lance = new Lance(usuario, 100);
        Leilao leilao = new Leilao();
        List<Lance> lances = new ArrayList(Arrays.asList(new Lance(usuario, 1000)));
        leilao.setLances(lances);

        Assertions.assertFalse(leilao.validarLance(lance));
    }

    @Test
    public void testarAdicionarLance() throws InvalidAttributeValueException {
        Usuario usuario = new Usuario(1, "Vinicius");
        Lance lance = new Lance(usuario, 100.00);

        Leilao leilao = new Leilao(new ArrayList());

        Assertions.assertEquals(leilao.adicionarLance(lance), lance);
    }

    @Test
    public void testarAdicionarLanceInvalido(){
        Usuario usuario = new Usuario(1, "Vinicius");
        Lance lance = new Lance(usuario, 0);

        Leilao leilao = new Leilao(new ArrayList());

        Assertions.assertThrows(InvalidAttributeValueException.class, ()-> {leilao.adicionarLance(lance);});
    }

}
