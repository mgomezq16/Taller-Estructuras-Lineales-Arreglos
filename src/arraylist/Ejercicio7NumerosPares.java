package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7NumerosPares {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> numerosPares = new ArrayList<>();

        // Crear los primeros 20 números pares
        for (int i = 1; i <= 20; i++) {
            numerosPares.add(i * 2);
        }

        System.out.println("ArrayList inicial:");
        System.out.println(numerosPares);

        // Pedir número para insertar
        System.out.print("\nIngrese un número par para insertar: ");
        int numeroInsertar = teclado.nextInt();

        insertarOrdenado(numerosPares, numeroInsertar);

        System.out.println("ArrayList después de insertar:");
        System.out.println(numerosPares);

        // Pedir número para eliminar
        System.out.print("\nIngrese un número para eliminar: ");
        int numeroEliminar = teclado.nextInt();

        if (numerosPares.remove(Integer.valueOf(numeroEliminar))) {
            System.out.println("Número eliminado correctamente.");
        } else {
            System.out.println("El número no se encuentra en el ArrayList.");
        }

        System.out.println("ArrayList después de eliminar:");
        System.out.println(numerosPares);

        teclado.close();
    }

    public static void insertarOrdenado(ArrayList<Integer> numeros, int numero) {

        int posicion = 0;

        while (posicion < numeros.size() && numeros.get(posicion) < numero) {
            posicion++;
        }

        numeros.add(posicion, numero);
    }
}