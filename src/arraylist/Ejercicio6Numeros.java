package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio6Numeros {

public static void main(String[] args) {
    ArrayList<Integer> numeros = generarNumeros();

    System.out.println("Números generados:");
    System.out.println(numeros);

    int suma = calcularSuma(numeros);
    double media = (double) suma / numeros.size();

    System.out.println("Suma: " + suma);
    System.out.println("Media: " + media);
}

public static ArrayList<Integer> generarNumeros() {
    ArrayList<Integer> numeros = new ArrayList<>();
    Random random = new Random();

    int numero;

    do {
        numero = random.nextInt(21) - 10;
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
