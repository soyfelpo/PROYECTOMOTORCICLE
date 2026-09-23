package edu.unilibre.pq1;

public class Usuario {

    private String nombre;
    private String documento;

    public Usuario(String nombre, String documento) {
        this.nombre = nombre;
        this.documento = documento;
    }

    public void solicitarServicio() {
        System.out.println("Servicio solicitado");
    }

    public void realizarPago() {
        System.out.println("Pago realizado");
    }

}