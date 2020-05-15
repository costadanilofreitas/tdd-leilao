package com.leilao.leilao;

import javax.management.InvalidAttributeValueException;
import java.util.List;

public class Leilao {

    private List<Lance> lances;

    public Leilao() {
    }

    public Leilao(List<Lance> lances) {
        this.lances = lances;
    }

    public List<Lance> getLances() {
        return lances;
    }

    public void setLances(List<Lance> lances) {
        this.lances = lances;
    }

    public boolean validarLance(Lance lance){
        if(lance.getValorDoLance() <= 0 ){
            return false;
        }
        for(Lance l: this.lances){
            if(lance.getValorDoLance() <= l.getValorDoLance()){
                return false;
            }
        }

        return true;
    }

    public Lance adicionarLance(Lance lance) throws InvalidAttributeValueException {
        if(validarLance(lance)){
            this.lances.add(lance);
            return lance;
        }
        throw new InvalidAttributeValueException("O valor do lance não pode ser 0 ou menor a um lance anterior");
    }
}
