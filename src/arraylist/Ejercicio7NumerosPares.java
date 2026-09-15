package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio7NumerosPares {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<Integer> numeros = generarNumerosPares();

        System.out.println("ArrayList inicial:");
        System.out.println(numeros);

        System.out.print("\nIngrese un número para insertar: ");
        int numeroInsertar = entrada.nextInt();

        insertarOrdenado(numeros, numeroInsertar);

        System.out.println("\nArrayList después de insertar " + numeroInsertar + ":");
        System.out.println(numeros);

        System.out.print("\nIngrese el número que desea eliminar: ");
        int numeroEliminar = entrada.nextInt();

        eliminarNumero(numeros, numeroEliminar);

        System.out.println("\nArrayList después de eliminar " + numeroEliminar + ":");
        System.out.println(numeros);

        entrada.close();
    }

    //Genera un ArrayList con los primeros 20 números pares en orden ascendente.
    public static ArrayList<Integer> generarNumerosPares() {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            numeros.add(i * 2);
        }

        return numeros;
    }

    // Inserta un número en la posición correcta para mantener el ArrayList ordenado de menor a mayor.
    public static void insertarOrdenado(ArrayList<Integer> numeros, int numero) {
        int posicion = 0;

        while (posicion < numeros.size() && numeros.get(posicion) < numero) {
            posicion++;
        }

        numeros.add(posicion, numero);
    }
    //Elimina la primera aparición del número indicado.
    public static void eliminarNumero(ArrayList<Integer> numeros, int numero) {
        if (numeros.contains(numero)) {
            numeros.remove(Integer.valueOf(numero));
            System.out.println("El número fue eliminado correctamente.");
        } else {
            System.out.println("El número no se encuentra en el ArrayList.");
        }
    }
}