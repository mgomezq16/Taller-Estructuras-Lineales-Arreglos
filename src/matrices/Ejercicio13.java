package matrices;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la matriz: ");
        int n = entrada.nextInt();

        Matriz matriz = new Matriz(n, n);

        matriz.llenarAleatoriamente();

        System.out.println("\nMatriz generada:");
        matriz.imprimir();

        if (matriz.esSimetrica()) {
            System.out.println("\nLa matriz es simétrica.");
        } else {
            System.out.println("\nLa matriz no es simétrica.");
        }

        System.out.println("\nNúmeros de las esquinas:");

        System.out.println("Esquina superior izquierda: "
                + matriz.obtenerElemento(0, 0));

        System.out.println("Esquina superior derecha: "
                + matriz.obtenerElemento(0, n - 1));

        System.out.println("Esquina inferior izquierda: "
                + matriz.obtenerElemento(n - 1, 0));

        System.out.println("Esquina inferior derecha: "
                + matriz.obtenerElemento(n - 1, n - 1));

        entrada.close();
    }
}