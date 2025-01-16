package Ej2;

public class Biblioteca {
    private Libro[] libros;

    // Constructor
    public Biblioteca(Libro[] libros) {
        this.libros = libros;
    }


    public double calcularValorTotal() {
        double total = 0;
        for (Libro libro : libros) {
            if (!libro.isPrestado()) { // Solo se suman los libros no prestados
                total += libro.getPrecio();
            }
        }
        return total;
    }
}