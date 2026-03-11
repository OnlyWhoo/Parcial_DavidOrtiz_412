package com.biblioteca;
public class Novela extends Libro {

    private TipoNovela tipo;

    public Novela() {
        super();
        this.tipo = TipoNovela.HISTORICA;
    }

    // Constructor
    public Novela(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados, TipoNovela tipo) {
        super(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados);
        this.tipo = tipo;
    }
    public TipoNovela getTipo() {
        return tipo;
    }
    public void setTipo(TipoNovela tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Novela{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", numeroEjemplares=" + getNumeroEjemplares() +
                ", numeroEjemplaresPrestados=" + getNumeroEjemplaresPrestados() +
                ", tipo=" + tipo +
                '}';
    }
}