package arreglos;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio3Factorial {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.print("¿Cuántos números desea generar?: ");
        int cantidad = teclado.nextInt();

        int[] numeros = new int[cantidad];
        long[] factoriales = new long[cantidad];

        for (int i = 0; i < cantidad; i++) {
            numeros[i] = aleatorio.nextInt(10) + 1;
            factoriales[i] = calcularFactorial(numeros[i]);
        }

        System.out.println("\nNúmeros generados:");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println("\n\nFactoriales:");

        for (long factorial : factoriales) {
            System.out.print(factorial + " ");
        }

        teclado.close();
    }

    public static long calcularFactorial(int numero) {

        long factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }
}