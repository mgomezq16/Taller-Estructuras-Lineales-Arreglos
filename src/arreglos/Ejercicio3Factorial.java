package arreglos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3Factorial {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos números desea generar?: ");
        int cantidad = teclado.nextInt();

        int[] numeros = generarNumeros(cantidad);
        long[] factoriales = calcularFactoriales(numeros);

        System.out.println("\nNúmeros generados:");
        UtilidadesArreglos.imprimir(numeros);

        System.out.println("\nFactoriales:");
        UtilidadesArreglos.imprimir(factoriales);

        teclado.close();
    }

    public static int[] generarNumeros(int cantidad) {

        Random aleatorio = new Random();
        int[] numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            numeros[i] = aleatorio.nextInt(10) + 1;
        }

        return numeros;
    }

    public static long[] calcularFactoriales(int[] numeros) {

        long[] factoriales = new long[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            factoriales[i] = calcularFactorial(numeros[i]);
        }

        return factoriales;
    }

    public static long calcularFactorial(int numero) {

        long factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        return factorial;
    }
}