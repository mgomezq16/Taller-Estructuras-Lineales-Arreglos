package arreglos;

import java.util.Random;

public class Ejercicio4MayorMenor {

    public static void main(String[] args) {
        int[] numeros = generarNumeros(25);

        int menor = encontrarMenor(numeros);
        int mayor = encontrarMayor(numeros);

        System.out.println("Números generados:");
        UtilidadesArreglos.imprimir(numeros);

        System.out.println("\nNúmero menor: " + menor);
        System.out.println("Número mayor: " + mayor);
    }

    public static int[] generarNumeros(int cantidad) {
        Random aleatorio = new Random();
        int[] numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            numeros[i] = aleatorio.nextInt(101) - 50;
        }

        return numeros;
    }

    public static int encontrarMenor(int[] numeros) {
        int menor = numeros[0];

        for (int numero : numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }

        return menor;
    }

    public static int encontrarMayor(int[] numeros) {
        int mayor = numeros[0];

        for (int numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            }
        }

        return mayor;
    }
}