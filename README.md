# Taller de Arreglos, ArrayList y Matrices

Nombre: María de los Ángeles Gómez

## Descripción

Este proyecto contiene el desarrollo del taller de arreglos unidimensionales, bidimensionales y ArrayList realizado en Java.

El taller está compuesto por 15 ejercicios en los que se trabajan diferentes operaciones con arreglos, ArrayList y matrices, incluyendo generación de datos aleatorios, búsqueda, ordenamiento, factoriales, operaciones con diagonales, transposición, simetría y manipulación de listas.

Durante el desarrollo se aplicaron conceptos de Programación Orientada a Objetos y principios de Clean Code, buscando mantener un código organizado, reutilizable y fácil de comprender.

## Tecnologías utilizadas

* Java
* Visual Studio Code
* Git y GitHub

## Estructura del proyecto

Taller-Estructuras-Lineales/

│
├── src/
│   ├── arreglos/
│   │   ├── Ejercicio1.java
│   │   ├── Ejercicio2Pares.java
│   │   ├── Ejercicio3Factorial.java
│   │   ├── Ejercicio4MayorMenor.java
│   │   ├── Ejercicio5InvertirNumeros.java
│   │   └── UtilidadesArreglos.java
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

## Instrucciones para ejecutar

Tener instalado Java JDK.

Abrir la carpeta Taller-Estructuras-Lineales.

Abrir una terminal dentro de la carpeta del proyecto.

Compilar el ejercicio que se desea ejecutar.

Ejecutar el programa desde la consola.

Los ejercicios están organizados de la siguiente manera:

Arreglos: ejercicios 1 al 5.

ArrayList: ejercicios 6 al 10.

Matrices: ejercicios 11 al 15.

## Ejemplo de ejecución

Para ejecutar un ejercicio de matrices, por ejemplo el ejercicio 15:

javac -d .\bin .\src\matrices\Matriz.java .\src\matrices\Ejercicio15.java

java -cp .\bin matrices.Ejercicio15

Para los demás ejercicios, se debe indicar la ruta correspondiente del archivo .java y el nombre completo de la clase.

## Programación Orientada a Objetos y Clean Code

Durante el desarrollo se aplicaron principios de organización, reutilización y separación de responsabilidades.

En los ejercicios de matrices se creó la clase Matriz, que permite reutilizar operaciones comunes como llenar, imprimir, buscar, obtener elementos, transponer matrices y realizar diferentes operaciones sobre ellas.

También se utilizaron nombres descriptivos para variables y métodos, métodos con responsabilidades específicas y validaciones cuando son necesarias.

Se tuvieron en cuenta principios de Clean Code como DRY (evitar la repetición de código), KISS (mantener soluciones sencillas) y la reutilización de métodos para facilitar el mantenimiento y comprensión del programa.

## Autor

María de los Ángeles Gómez