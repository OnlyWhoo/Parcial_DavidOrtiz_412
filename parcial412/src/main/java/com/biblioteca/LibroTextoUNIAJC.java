package com.biblioteca;
public class LibroTextoUNIAJC extends LibroTexto {

    private String facultad;

    public LibroTextoUNIAJC() {
        super();
        this.facultad = "";
    }

    // Constructor
    public LibroTextoUNIAJC(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados, String curso, String facultad) {
        super(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados, curso);
        this.facultad = facultad;
    }
    public String getFacultad() {
        return facultad;
    }
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return "LibroTextoUNIAJC{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", numeroEjemplares=" + getNumeroEjemplares() +
                ", numeroEjemplaresPrestados=" + getNumeroEjemplaresPrestados() +
                ", curso='" + getCurso() + '\'' +
                ", facultad='" + facultad + '\'' +
                '}';
    }
}