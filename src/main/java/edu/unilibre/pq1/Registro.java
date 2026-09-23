package edu.unilibre.pq1;

import java.time.Duration;
import java.time.LocalDateTime;

public class Registro {

    private LocalDateTime fechaIngreso;
    private LocalDateTime fechaSalida;

    public Registro(LocalDateTime fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = null;
    }

    public void registrarIngreso() {
        fechaIngreso = LocalDateTime.now();
    }

    public void registrarSalida() {
        fechaSalida = LocalDateTime.now();
    }

    public void registrarSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public long calcularTiempo() {
        if (fechaSalida != null) {
            Duration duracion = Duration.between(fechaIngreso, fechaSalida);
            return duracion.getSeconds() / 3600;
        }

        return 0;
    }
}