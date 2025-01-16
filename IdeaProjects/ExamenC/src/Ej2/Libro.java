package Ej2;

public class Libro {
    private String titulo;
    private double precio;
    private CategoriaLibro categoria;
    private boolean prestado;

    // Constructor
    public Libro(String titulo, double precio, CategoriaLibro categoria) {
        this.titulo = titulo;
        this.precio = precio;
        this.categoria = categoria;
        this.prestado = false; // Por defecto, los libros no están prestados
    }

    // Método para marcar un libro como prestado o no
    public void marcarPrestado(boolean estado) {
        this.prestado = estado;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public CategoriaLibro getCategoria() {
        return categoria;
    }

    public boolean isPrestado() {
        return prestado;
    }

    @Override
    public String toString() {
        return titulo + " - Precio: " + precio + "€ - Categoría: " + categoria + " - Prestado: " + prestado;
    }
}

