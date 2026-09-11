package arreglos;

import java.util.Random;

public class Ejercicio4MayorMenor {

    public static void main(String[] args) {

        int[] numeros = generarNumeros();

        int menor = encontrarMenor(numeros);
        int mayor = encontrarMayor(numeros);

        System.out.println("Números del arreglo:");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println("\n\nNúmero menor: " + menor);
        System.out.println("Número mayor: " + mayor);
    }

    public static int[] generarNumeros() {

        Random aleatorio = new Random();
        int[] numeros = new int[25];

        for (int i = 0; i < numeros.length; i++) {
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