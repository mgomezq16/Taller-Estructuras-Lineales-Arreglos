package matrices;

import java.util.Random;

public class Matriz {

    private int[][] datos;
    private int filas;
    private int columnas;

    public Matriz(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.datos = new int[filas][columnas];
    }

    public void llenarAleatoriamente() {
        llenarAleatoriamente(0, 100);
    }
    public void llenarAleatoriamente(int minimo, int maximo) {
        Random random = new Random();

        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                datos[fila][columna] =
                        random.nextInt(maximo - minimo + 1) + minimo;
            }
        }
    }

    public void imprimir() {
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                System.out.print(datos[fila][columna] + "\t");
            }

            System.out.println();
        }
    }

    public int[] buscarPrimeraOcurrencia(int numeroBuscado) {

        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {

                if (datos[fila][columna] == numeroBuscado) {
                    return new int[]{fila, columna};
                }
            }
        }

        return null;
    }

    public int sumarDiagonalSecundaria() {

        int suma = 0;

        for (int fila = 0; fila < filas; fila++) {
            int columna = columnas - 1 - fila;
            suma += datos[fila][columna];
        }

        return suma;
    }

    public boolean esSimetrica() {

        if (filas != columnas) {
            return false;
        }

        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {

                if (datos[fila][columna] != datos[columna][fila]) {
                    return false;
                }
            }
        }

        return true;
    }
    public int obtenerElemento(int fila, int columna) {
        return datos[fila][columna];
    }

    public int[][] obtenerDatos() {
        return datos;
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }
public Matriz transpuesta() {

    Matriz resultado = new Matriz(columnas, filas);

    for (int fila = 0; fila < filas; fila++) {
        for (int columna = 0; columna < columnas; columna++) {
            resultado.datos[columna][fila] = datos[fila][columna];
        }
    }

    return resultado;
}
public void establecerElemento(int fila, int columna, int valor) {
    datos[fila][columna] = valor;
}
 public void intercambiarPrimeraYSegundaFila() {

    if (filas < 2) {
        return;
    }

    for (int columna = 0; columna < columnas; columna++) {

        int temporal = datos[0][columna];
        datos[0][columna] = datos[1][columna];
        datos[1][columna] = temporal;
    }
    }
}
