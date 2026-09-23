package edu.unilibre.pq1;

import java.time.LocalDateTime;

public class Parqueadero {

    private String nombre;
    private int capacidad;
    private Espacio[] espacios;
    private Moto[] motos;
    private Registro[] registros;

    public Parqueadero(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        espacios = new Espacio[capacidad];
        motos = new Moto[capacidad];
        registros = new Registro[capacidad];

        for (int i = 0; i < capacidad; i++) {
            espacios[i] = new Espacio(i + 1, true);
        }
    }

    public Espacio buscarEspacioDisponible() {
        for (int i = 0; i < capacidad; i++) {
            if (espacios[i].consultarDisponibilidad()) {
                return espacios[i];
            }
        }
        return null;
    }

    public void consultarEspacios() {
        for (int i = 0; i < capacidad; i++) {
            if (espacios[i].consultarDisponibilidad()) {
                System.out.println("Espacio " + (i + 1) + ": Disponible");
            } else {
                System.out.println("Espacio " + (i + 1) + ": Ocupado");
            }
        }
    }

    public void consultarMotocicleta(Moto moto) {
        moto.consultarMoto();
    }

    public boolean registrarIngreso(Moto moto) {
        if (!moto.estaRegistrada()) {
            System.out.println("La moto no esta registrada");
            return false;
        }

        for (int i = 0; i < capacidad; i++) {
            if (motos[i] != null) {
                if (motos[i].getPlaca().equals(moto.getPlaca())) {
                    System.out.println("La moto ya esta registrada en el parqueadero");
                    return false;
                }
            }
        }

        Espacio espacio = buscarEspacioDisponible();

        if (espacio != null) {
            espacio.ocupar();

            for (int i = 0; i < capacidad; i++) {
                if (motos[i] == null) {
                    motos[i] = moto;
                    registros[i] = new Registro(LocalDateTime.now());
                    System.out.println("Moto ingresada correctamente");
                    return true;
                }
            }
        }

        System.out.println("No hay espacios disponibles");
        return false;
    }

    public boolean registrarSalida(Moto moto) {
        for (int i = 0; i < capacidad; i++) {
            if (motos[i] != null) {
                if (motos[i].getPlaca().equals(moto.getPlaca())) {
                    registros[i].registrarSalida();
                    motos[i] = null;
                    espacios[i].liberar();
                    System.out.println("Moto retirada correctamente");
                    return true;
                }
            }
        }

        System.out.println("La moto no se encuentra en el parqueadero");
        return false;
    }
}