## Diagrama de clases (Mermaid)

```mermaid
classDiagram

class Libro {
    -String titulo
    -String autor
    -int numeroEjemplares
    -int numeroEjemplaresPrestados
    +Libro()
    +Libro(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados)
    +String getTitulo()
    +void setTitulo(String titulo)
    +String getAutor()
    +void setAutor(String autor)
    +int getNumeroEjemplares()
    +void setNumeroEjemplares(int numeroEjemplares)
    +int getNumeroEjemplaresPrestados()
    +void setNumeroEjemplaresPrestados(int numeroEjemplaresPrestados)
    +boolean prestamo()
    +boolean devolucion()
    +String toString()
}

class LibroTexto {
    -String curso
    +LibroTexto()
    +LibroTexto(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados, String curso)
    +String getCurso()
    +void setCurso(String curso)
    +String toString()
}

class LibroTextoUNIAJC {
    -String facultad
    +LibroTextoUNIAJC()
    +LibroTextoUNIAJC(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados, String curso, String facultad)
    +String getFacultad()
    +void setFacultad(String facultad)
    +String toString()
}

class Novela {
    -TipoNovela tipo
    +Novela()
    +Novela(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados, TipoNovela tipo)
    +TipoNovela getTipo()
    +void setTipo(TipoNovela tipo)
    +String toString()
}

class TipoNovela {
    <<enumeration>>
    HISTORICA
    ROMANTICA
    POLICIACA
    REALISTA
    CIENCIA_FICCION
    AVENTURAS
}

Libro <|-- LibroTexto
LibroTexto <|-- LibroTextoUNIAJC
Libro <|-- Novela
Novela --> TipoNovela
```




Caso 1:
No se puede aplicar herencia entre Libro y Autor, porque un autor no es un tipo de libro. En este caso la relación sería de asociación, ya que un autor puede escribir uno o varios libros.

Caso 2:
No se puede aplicar herencia entre Libro y Préstamo, porque un préstamo no es una clase derivada de libro sino una acción que se realiza sobre él.


Nuevos atributos y método propuestos

Atributo: añoPublicacion

Este atributo permitiría almacenar el año en que fue publicado el libro. Es útil para clasificar libros por antigüedad, realizar búsquedas o mostrar información adicional al usuario.

int anioPublicacion

Atributo: editorial

Este atributo permitiría guardar el nombre de la editorial que publicó el libro. Esto es común en sistemas de bibliotecas y ayuda a identificar la procedencia del libro.

String editorial