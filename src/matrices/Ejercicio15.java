package matrices;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int filas = entrada.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        int columnas = entrada.nextInt();

        if (filas < 2 || columnas <= 0) {
            System.out.println("La matriz debe tener al menos 2 filas y 1 columna.");
            entrada.close();
            return;
        }

        Matriz matriz = new Matriz(filas, columnas);
        matriz.llenarAleatoriamente();

        System.out.println("\nMatriz original:");
        matriz.imprimir();

        matriz.intercambiarPrimeraYSegundaFila();

        System.out.println("\nMatriz después de intercambiar la primera y segunda fila:");
        matriz.imprimir();

        entrada.close();
    }
}