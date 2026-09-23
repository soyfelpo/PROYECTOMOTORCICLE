package edu.unilibre.pq1;

import java.time.LocalDateTime;

public class Pago {

    private double valor;
    private String metodoPago;
    private LocalDateTime fechaPago;

    public Pago(double valor, String metodoPago, LocalDateTime fechaPago) {
        this.valor = valor;
        this.metodoPago = metodoPago;
        this.fechaPago = fechaPago;
    }

    public double calcularValor(long horas) {
        valor = horas * 40;
        return valor;
    }

    public void registrarPago() {
        fechaPago = LocalDateTime.now();
        System.out.println("Pago realizado por " + metodoPago);
    }
}