package arreglos;

public class UtilidadesArreglos {

    public static void imprimir(int[] numeros) {

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println();
    }

    public static void imprimir(long[] numeros) {

        for (long numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println();
    }
}