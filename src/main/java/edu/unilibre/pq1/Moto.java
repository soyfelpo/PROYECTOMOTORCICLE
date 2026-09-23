package edu.unilibre.pq1;

public class Moto {

    private String placa;
    private String marca;
    private String modelo;
    private boolean registrada;

    public Moto(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        registrada = false;
    }

    public void registrarMoto() {
        registrada = true;
        System.out.println("Moto registrada: " + placa);
    }

    public void consultarMoto() {
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean estaRegistrada() {
        return registrada;
    }
}