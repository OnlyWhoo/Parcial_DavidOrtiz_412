package com.biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Libro 1
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 10, 2);

        // Libro 2 creado
        System.out.println("Ingrese el título del libro 2:");
        String titulo = entrada.nextLine();

        System.out.println("Ingrese el autor del libro 2:");
        String autor = entrada.nextLine();

        System.out.println("Ingrese el número de ejemplares del libro 2:");
        int numeroEjemplares = entrada.nextInt();

        System.out.println("Ingrese el número de ejemplares prestados del libro 2:");
        int numeroEjemplaresPrestados = entrada.nextInt();

        Libro libro2 = new Libro(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados);

        // libro 3 de texto UNI
        LibroTextoUNIAJC libroTexto1 = new LibroTextoUNIAJC(
                "Programación en Java",
                "Luis Pérez",
                5,
                1,
                "Programación II",
                "Ingeniería"
        );

        // Libro 4 novela
        Novela novela1 = new Novela(
                "Juego de tronos",
                "El señor de los anillos",
                7,
                3,
                TipoNovela.CIENCIA_FICCION
        );

        // información
        System.out.println("\n--- INFORMACIÓN DE LOS OBJETOS ---");
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libroTexto1);
        System.out.println(novela1);

        // préstamo y devolución
        System.out.println("\n--- PRUEBA DE PRÉSTAMO Y DEVOLUCIÓN CON libro1 ---");
        if (libro1.prestamo()) {
            System.out.println("Préstamo realizado correctamente.");
        } else {
            System.out.println("No se pudo realizar el préstamo.");
        }
        if (libro1.devolucion()) {
            System.out.println("Devolución realizada correctamente.");
        } else {
            System.out.println("No se pudo realizar la devolución.");
        }
        System.out.println("\nEstado final de libro1:");
        System.out.println(libro1);
        entrada.close();
    }
}