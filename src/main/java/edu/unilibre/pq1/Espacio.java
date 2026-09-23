package edu.unilibre.pq1;

public class Espacio {

    private int numero;
    private boolean disponible;

    public Espacio(int numero, boolean disponible) {
        this.numero = numero;
        this.disponible = disponible;
    }

    public void ocupar() {
        disponible = false;
    }

    public void liberar() {
        disponible = true;
    }

    public boolean consultarDisponibilidad() {
        return disponible;
    }

}