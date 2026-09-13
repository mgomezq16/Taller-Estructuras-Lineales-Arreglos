package matrices;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la matriz: ");
        int n = entrada.nextInt();

        Matriz matriz = new Matriz(n, n);

        matriz.llenarAleatoriamente(-50, 50);

        System.out.println("\nMatriz generada:");
        matriz.imprimir();

        int suma = matriz.sumarDiagonalSecundaria();

        System.out.println("\nLa suma de la diagonal secundaria es: " + suma);

        entrada.close();
    }
}
