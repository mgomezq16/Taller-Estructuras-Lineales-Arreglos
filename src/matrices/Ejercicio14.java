package matrices;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int filas = entrada.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        int columnas = entrada.nextInt();

        Matriz matriz = new Matriz(filas, columnas);

        System.out.println("\nIngrese los valores de la matriz:");

        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {

                System.out.print(
                        "Valor [" + fila + "][" + columna + "]: "
                );

                int valor = entrada.nextInt();

                matriz.establecerElemento(fila, columna, valor);
            }
        }

        System.out.println("\nMatriz original:");
        matriz.imprimir();

        Matriz transpuesta = matriz.transpuesta();

        System.out.println("\nMatriz transpuesta:");
        transpuesta.imprimir();

        entrada.close();
    }
}
