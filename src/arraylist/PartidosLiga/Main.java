package arraylist.PartidosLiga;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void mostrarGanadoresVisitantes(ArrayList<PartidoFutbol> partidos) {

        System.out.println("\nPARTIDOS DONDE GANO EL VISITANTE:");

        for (PartidoFutbol partido : partidos) {
            if (partido.ganoVisitante()) {
                System.out.println(partido);
            }
        }
    }

    public static int contarVictoriasBarcelona(ArrayList<PartidoFutbol> partidos) {

        int victoriasBarcelona = 0;

        for (PartidoFutbol partido : partidos) {
            if (partido.ganoBarcelona()) {
                victoriasBarcelona++;
            }
        }

        return victoriasBarcelona;
    }

    public static void eliminarNoEmpates(ArrayList<PartidoFutbol> partidos) {

        for (int i = partidos.size() - 1; i >= 0; i--) {

            PartidoFutbol partido = partidos.get(i);

            if (!partido.esEmpate()) {
                partidos.remove(i);
            }
        }
    }

    public static int contarVictoriasLocal(ArrayList<PartidoFutbol> partidos) {

        int victoriasLocal = 0;

        for (PartidoFutbol partido : partidos) {
            if (partido.ganoLocal()) {
                victoriasLocal++;
            }
        }

        return victoriasLocal;
    }

    public static void main(String[] args) {

        ArrayList<PartidoFutbol> partidos = new ArrayList<>();

        try {

            File archivo = new File("src/arraylist/PartidosLiga/PartidoLiga.txt");
            Scanner lector = new Scanner(archivo);

            while (lector.hasNextLine()) {

                String linea = lector.nextLine();
                String[] datos = linea.split("::");

                String equipoLocal = datos[0];
                String equipoVisitante = datos[1];
                int golesLocal = Integer.parseInt(datos[2]);
                int golesVisitante = Integer.parseInt(datos[3]);

                PartidoFutbol partido = new PartidoFutbol(
                        equipoLocal,
                        equipoVisitante,
                        golesLocal,
                        golesVisitante
                );

                partidos.add(partido);
            }

            lector.close();

            mostrarGanadoresVisitantes(partidos);

            int victoriasBarcelona = contarVictoriasBarcelona(partidos);

            System.out.println("\nVICTORIAS DEL BARCELONA:");
            System.out.println(victoriasBarcelona);

            int victoriasLocal = contarVictoriasLocal(partidos);

            System.out.println("\nVICTORIAS DEL EQUIPO LOCAL:");
            System.out.println(victoriasLocal);

            eliminarNoEmpates(partidos);

            System.out.println("\nPARTIDOS EMPATADOS:");

            for (PartidoFutbol partido : partidos) {
                System.out.println(partido);
            }

        } catch (FileNotFoundException e) {

            System.out.println("No se encontró el archivo.");

        } catch (Exception e) {

            System.out.println("Ocurrió un error al procesar los datos.");
        }
    }
}