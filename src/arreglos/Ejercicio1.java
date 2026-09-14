package arreglos;

public class Ejercicio1 {

    public static void main(String[] args) {

        int[] numerosPrimos = generarNumerosPrimos();

        System.out.println("Primeros 10 números primos:");
        UtilidadesArreglos.imprimir(numerosPrimos);
    }

    public static int[] generarNumerosPrimos() {

        return new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
    }
}