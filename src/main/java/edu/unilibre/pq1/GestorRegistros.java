package edu.unilibre.pq1;

public class GestorRegistros {

    private Registro[] registros;
    private int cantidad;

    public GestorRegistros() {
        registros = new Registro[23];
        cantidad = 0;
    }

    public void agregarRegistro(Registro registro) {
        if (cantidad < 23) {
            registros[cantidad] = registro;
            cantidad++;
        }
    }

    public void eliminarRegistro(int posicion) {
        if (posicion < cantidad) {
            registros[posicion] = null;
            cantidad--;
        }
    }

    public Registro buscarRegistro(int posicion) {
        if (posicion < cantidad) {
            return registros[posicion];
        }
        return null;
    }

    public void listarRegistros() {
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Registro " + (i + 1));
            System.out.println(registros[i]);
        }
    }

    public void consultarHistorial() {
        listarRegistros();
    }
}