\# Taller de Arreglos, ArrayList y Matrices



\## Información del estudiante



Nombre: María de los Ángeles Gómez



\## Descripción



Este proyecto contiene el desarrollo del taller de arreglos unidimensionales, bidimensionales y ArrayList realizado en Java.



El taller está compuesto por 15 ejercicios en los que se trabajan diferentes operaciones con arreglos, ArrayList y matrices, incluyendo generación de datos aleatorios, búsqueda, ordenamiento, factoriales, operaciones con diagonales, transposición, simetría y manipulación de listas.



Durante el desarrollo se aplicaron conceptos de Programación Orientada a Objetos y principios de Clean Code, buscando mantener un código organizado, reutilizable y fácil de comprender.



\## Tecnologías utilizadas



\* Java

\* Visual Studio Code

\* Git y GitHub

\* Ejecución desde consola



\## Estructura del proyecto



```text

Taller-Arrays/

│

├── src/

│   ├── arreglos/

│   │   ├── Ejercicio1.java

│   │   ├── Ejercicio2Pares.java

│   │   ├── Ejercicio3Factorial.java

│   │   ├── Ejercicio4MayorMenor.java

│   │   └── Ejercicio5InvertirNumeros.java

│   │

│   ├── arraylist/

│   │   ├── Ejercicio6Numeros.java

│   │   ├── Ejercicio7NumerosPares.java

│   │   ├── Ejercicio8Aleatorios.java

│   │   ├── Ejercicio9NumAle.java

│   │   └── PartidosLiga/

│   │       ├── Main.java

│   │       ├── PartidoFutbol.java

│   │       └── PartidoLiga.txt

│   │

│   └── matrices/

│       ├── Ejercicio11.java

│       ├── Ejercicio12.java

│       ├── Ejercicio13.java

│       ├── Ejercicio14.java

│       ├── Ejercicio15.java

│       └── Matriz.java

│

└── README.md

```



\## Instrucciones para ejecutar



1\. Tener instalado Java JDK.

2\. Abrir la carpeta `Taller-Arrays`.

3\. Abrir una terminal dentro de la carpeta del proyecto.

4\. Compilar el ejercicio que se desea ejecutar.

5\. Ejecutar el programa desde la consola.



Los ejercicios están organizados de la siguiente manera:



\* \*\*Arreglos:\*\* ejercicios 1 al 5.

\* \*\*ArrayList:\*\* ejercicios 6 al 10(PartidosLiga).

\* \*\*Matrices:\*\* ejercicios 11 al 15.



\### Ejemplo de ejecución



Para ejecutar un ejercicio de matrices:



javac -d .\\bin .\\src\\matrices\\Matriz.java .\\src\\matrices\\Ejercicio15.java

java -cp .\\bin matrices.Ejercicio15





Para los demás ejercicios, se debe indicar la ruta correspondiente del archivo `.java` y el nombre completo de la clase.



\## Ejercicios desarrollados



\### Arreglos



\* Ejercicio 1: Primeros 10 números primos.

\* Ejercicio 2: Primeros 100 números pares.

\* Ejercicio 3: Números aleatorios y factoriales.

\* Ejercicio 4: Número menor y mayor de un arreglo.

\* Ejercicio 5: Inversión de números.



\### ArrayList



\* Ejercicio 6: Números aleatorios, suma y media.

\* Ejercicio 7: Inserción y eliminación manteniendo el orden.

\* Ejercicio 8: Frecuencia de números aleatorios.

\* Ejercicio 9: Ordenamiento y separación de números pares e impares.

\* Ejercicio 10: Funcionalidades adicionales para partidos de fútbol.



\### Matrices



\* Ejercicio 11: Búsqueda de un número y primera ocurrencia.

\* Ejercicio 12: Suma de la diagonal secundaria.

\* Ejercicio 13: Comprobación de matriz simétrica y esquinas.

\* Ejercicio 14: Matriz transpuesta.

\* Ejercicio 15: Intercambio de la primera y segunda fila.



\## Programación Orientada a Objetos y Clean Code



En el desarrollo se utilizaron principios de organización y reutilización de código. En los ejercicios de matrices se creó la clase `Matriz`, que permite reutilizar operaciones comunes como llenar, imprimir, buscar, obtener elementos y realizar diferentes operaciones sobre las matrices.



También se utilizaron nombres descriptivos para variables y métodos, separación de responsabilidades y validaciones cuando son necesarias.



\## Autor



\*\*María de los Ángeles Gómez\*\*



