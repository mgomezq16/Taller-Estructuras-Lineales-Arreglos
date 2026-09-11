package arreglos;

import java.util.Random;

public class Ejercicio5InvertirNumeros {

    public static void main(String[] args) {

        int[] numeros = generarNumeros();
        int[] numerosInvertidos = invertirNumeros(numeros);

        System.out.println("Arreglo original:");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println("\nArreglo con números invertidos:");

        for (int numero : numerosInvertidos) {
            System.out.print(numero + " ");
        }
    }

    public static int[] generarNumeros() {

        Random aleatorio = new Random();
        int[] numeros = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(1000);
        }

        return numeros;
    }

    public static int[] invertirNumeros(int[] numeros) {

        int[] invertidos = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            invertidos[i] = invertirNumero(numeros[i]);
        }

        return invertidos;
    }

    public static int invertirNumero(int numero) {

        int invertido = 0;

        while (numero > 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero = numero / 10;
        }

        return invertido;
    }
}