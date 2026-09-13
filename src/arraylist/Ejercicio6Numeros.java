package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio6Numeros {

    public static void main(String[] args) {

        Random aleatorio = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();

        while (numeros.size() < 10) {
            int numero = aleatorio.nextInt(21) - 10;
            numeros.add(numero);
        }

        int suma = calcularSuma(numeros);
        double promedio = (double) suma / numeros.size();

        System.out.println("Valores generados:");
        System.out.println(numeros);

        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }

    public static int calcularSuma(ArrayList<Integer> numeros) {

        int suma = 0;

        for (int numero : numeros) {
            suma += numero;
        }

        return suma;
    }
}