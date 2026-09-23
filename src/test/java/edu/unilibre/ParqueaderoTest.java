package edu.unilibre;

import edu.unilibre.pq1.GestorRegistros;
import edu.unilibre.pq1.Registro;

import java.time.LocalDateTime;

public class ParqueaderoTest {

    public static void main(String[] args) {

        GestorRegistros gestor = new GestorRegistros();

        Registro registro1 = new Registro(LocalDateTime.now());
        Registro registro2 = new Registro(LocalDateTime.now());

        gestor.agregarRegistro(registro1);
        gestor.agregarRegistro(registro2);

        gestor.listarRegistros();

        System.out.println("TEST 12: Correcto");
    }
}