package arreglos;

public class Ejercicio2Pares {

    public static void main(String[] args) {

        int[] numerosPares = generarNumerosPares(100);

        imprimirEnUnaLinea(numerosPares);
        imprimirEnDiezLineas(numerosPares);
    }

    public static int[] generarNumerosPares(int cantidad) {

        int[] numerosPares = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            numerosPares[i] = (i + 1) * 2;
        }

        return numerosPares;
    }

    public static void imprimirEnUnaLinea(int[] numerosPares) {

        System.out.println("Números pares en una línea:");

        for (int numero : numerosPares) {
            System.out.print(numero + " ");
        }

        System.out.println();
    }

    public static void imprimirEnDiezLineas(int[] numerosPares) {

        System.out.println("\nNúmeros pares en 10 líneas:");

        for (int i = 0; i < numerosPares.length; i++) {

            if (i % 10 == 0) {
                System.out.println();
                System.out.print("Línea " + ((i / 10) + 1) + ": ");
            }

            System.out.print(numerosPares[i] + " ");
        }
    }
}