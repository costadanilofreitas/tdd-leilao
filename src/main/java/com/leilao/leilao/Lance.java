package com.leilao.leilao;

public class Lance {

    private Usuario usuario;
    private double valorDoLance;

    public Lance(Usuario usuario, double valorDoLance) {
        this.usuario = usuario;
        this.valorDoLance = valorDoLance;
    }

    public Usuario getUsuario() {

        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public double getValorDoLance() {
        return valorDoLance;
    }

    public void setValorDoLance(double valorDoLance) {
        this.valorDoLance = valorDoLance;
    }
}
