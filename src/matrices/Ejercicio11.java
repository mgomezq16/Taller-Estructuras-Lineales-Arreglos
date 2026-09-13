package matrices;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int filas = entrada.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        int columnas = entrada.nextInt();

        Matriz matriz = new Matriz(filas, columnas);

        matriz.llenarAleatoriamente();

        System.out.println("\nMatriz generada:");
        matriz.imprimir();

        System.out.print("\nIngrese el número que desea buscar: ");
        int numeroBuscado = entrada.nextInt();

        int[] posicion = matriz.buscarPrimeraOcurrencia(numeroBuscado);

        if (posicion != null) {

            System.out.println(
                    "\nEl número " + numeroBuscado
                    + " se encuentra en la posición ["
                    + posicion[0] + "][" + posicion[1] + "]"
            );

        } else {

            System.out.println(
                    "\nEl número " + numeroBuscado
                    + " no se encuentra en la matriz."
            );
        }

        entrada.close();
    }
}

