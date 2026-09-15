package matrices;

public class Ejercicio14 {

    private static final int FILAS = 2;
    private static final int COLUMNAS = 3;

    public static void main(String[] args) {
        Matriz matriz = crearMatrizPredeterminada();

        System.out.println("Matriz original:");
        matriz.imprimir();

        Matriz transpuesta = matriz.transpuesta();

        System.out.println("\nMatriz transpuesta:");
        transpuesta.imprimir();
    }

    private static Matriz crearMatrizPredeterminada() {
        int[][] valores = {
            {1, 2, 3},
            {4, 5, 6}
        };

        Matriz matriz = new Matriz(FILAS, COLUMNAS);

        for (int fila = 0; fila < FILAS; fila++) {
            for (int columna = 0; columna < COLUMNAS; columna++) {
                matriz.establecerElemento(fila, columna, valores[fila][columna]);
            }
        }

        return matriz;
    }
}