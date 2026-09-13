package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio8Aleatorios {

    public static ArrayList<Integer> generarNumeros() {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int numero = random.nextInt(20) + 1;
            numeros.add(numero);
        }
        return numeros;
    }
    public static int[] calcularFrecuencias(ArrayList<Integer> numeros) {
        int[] frecuencias = new int[21];

        for (int numero : numeros) {
            frecuencias[numero]++;
        }
        return frecuencias;
    }

    public static int encontrarNumeroMasFrecuente(int[] frecuencias) {
        int numeroMasFrecuente = 1;

        for (int numero = 2; numero <= 20; numero++) {
            if (frecuencias[numero] > frecuencias[numeroMasFrecuente]) {
                numeroMasFrecuente = numero;
            }
        }
        return numeroMasFrecuente;
    }

    public static void imprimirResultados(
            ArrayList<Integer> numeros, int[] frecuencias, int numeroMasFrecuente) {

        System.out.println("Números generados:");
        System.out.println(numeros);

        System.out.println("\nTabla de frecuencias:");
        System.out.println("Número\tFrecuencia");

        for (int numero = 1; numero <= 20; numero++) {
            System.out.println(numero + "\t" + frecuencias[numero]);
        }
        System.out.println("\nNúmero que más se repite: " + numeroMasFrecuente);
        System.out.println("Cantidad de veces: " + frecuencias[numeroMasFrecuente]);
    }
    public static void main(String[] args) {

        ArrayList<Integer> numeros = generarNumeros();

        int[] frecuencias = calcularFrecuencias(numeros);

        int numeroMasFrecuente = encontrarNumeroMasFrecuente(frecuencias);

        imprimirResultados(numeros, frecuencias, numeroMasFrecuente);
    }
}