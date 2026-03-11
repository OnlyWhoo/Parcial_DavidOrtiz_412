package com.example;

public class Libro {

    private String titulo;
    private String autor;
    private int numeroEjemplares;
    private int numeroEjemplaresPrestados;

    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.numeroEjemplares = 0;
        this.numeroEjemplaresPrestados = 0;
    }

    // Constructor
    public Libro(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    // Get y set
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }
    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }
    public int getNumeroEjemplaresPrestados() {
        return numeroEjemplaresPrestados;
    }
    public void setNumeroEjemplaresPrestados(int numeroEjemplaresPrestados) {
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    // préstamo
    public boolean prestamo() {
        if (numeroEjemplaresPrestados < numeroEjemplares) {
            numeroEjemplaresPrestados++;
            return true;
        } else {
            return false;
        }
    }

    // devolución
    public boolean devolucion() {
        if (numeroEjemplaresPrestados > 0) {
            numeroEjemplaresPrestados--;
            return true;
        } else {
            return false;
        }
    }

    // información del libro
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroEjemplares=" + numeroEjemplares +
                ", numeroEjemplaresPrestados=" + numeroEjemplaresPrestados +
                '}';
    }
}