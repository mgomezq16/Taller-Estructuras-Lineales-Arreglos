package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio9NumAle {

    public static ArrayList<Integer> generarNumeros() {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int numero = random.nextInt(100) + 1;
            numeros.add(numero);
        }

        return numeros;
    }

    public static ArrayList<Integer> ordenarAscendente(ArrayList<Integer> numeros) {
        ArrayList<Integer> numerosAscendentes = new ArrayList<>(numeros);
        Collections.sort(numerosAscendentes);

        return numerosAscendentes;
    }

    public static ArrayList<Integer> ordenarDescendente(ArrayList<Integer> numeros) {
        ArrayList<Integer> numerosDescendentes = new ArrayList<>(numeros);
        Collections.sort(numerosDescendentes, Collections.reverseOrder());

        return numerosDescendentes;
    }

    public static ArrayList<Integer> obtenerPares(ArrayList<Integer> numeros) {
        ArrayList<Integer> numerosPares = new ArrayList<>();

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                numerosPares.add(numero);
            }
        }

        return numerosPares;
    }

    public static ArrayList<Integer> obtenerImpares(ArrayList<Integer> numeros) {
        ArrayList<Integer> numerosImpares = new ArrayList<>();

        for (int numero : numeros) {
            if (numero % 2 != 0) {
                numerosImpares.add(numero);
            }
        }

        return numerosImpares;
    }

    public static void imprimirResultados(
            ArrayList<Integer> numeros,
            ArrayList<Integer> numerosAscendentes,
            ArrayList<Integer> numerosDescendentes,
            ArrayList<Integer> numerosPares,
            ArrayList<Integer> numerosImpares) {

        System.out.println("Lista original:");
        System.out.println(numeros);

        System.out.println("\nLista de menor a mayor:");
        System.out.println(numerosAscendentes);

        System.out.println("\nLista de mayor a menor:");
        System.out.println(numerosDescendentes);

        System.out.println("\nNúmeros pares:");
        System.out.println(numerosPares);

        System.out.println("\nNúmeros impares:");
        System.out.println(numerosImpares);
    }

    public static void main(String[] args) {

        ArrayList<Integer> numeros = generarNumeros();

        ArrayList<Integer> numerosAscendentes = ordenarAscendente(numeros);

        ArrayList<Integer> numerosDescendentes = ordenarDescendente(numeros);

        ArrayList<Integer> numerosPares = obtenerPares(numeros);

        ArrayList<Integer> numerosImpares = obtenerImpares(numeros);

        imprimirResultados(
                numeros,
                numerosAscendentes,
                numerosDescendentes,
                numerosPares,
                numerosImpares
        );
    }
}