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
        Random random = new Random();

        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                datos[fila][columna] = random.nextInt(101);
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
}
