package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio6Numeros {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = generarNumeros();

        int suma = calcularSuma(numeros);
        double promedio = (double) suma / numeros.size();

        System.out.println("Valores generados:");
        System.out.println(numeros);

        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }

    public static ArrayList<Integer> generarNumeros() {

        Random aleatorio = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();

        int numero;

        do {
            numero = aleatorio.nextInt(21) - 10;
            numeros.add(numero);
        } while (numero != 10);

        return numeros;
    }

    public static int calcularSuma(ArrayList<Integer> numeros) {

        int suma = 0;

        for (int numero : numeros) {
            suma += numero;
        }

        return suma;
    }
}