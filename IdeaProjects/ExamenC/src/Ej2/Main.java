package Ej2;

public class Main {
    public static void main(String[] args) {
        // Crear libros
        Libro libro1 = new Libro("El Principito", 15.99, CategoriaLibro.FICCION);
        Libro libro2 = new Libro("Breve Historia del Tiempo", 20.50, CategoriaLibro.CIENCIA);
        Libro libro3 = new Libro("Historia de Roma", 25.00, CategoriaLibro.HISTORIA);

        // Marcar uno de los libros como prestado
        libro3.marcarPrestado(true);

        // Crear el array de libros y la biblioteca
        Libro[] libros = {libro1, libro2, libro3};
        Biblioteca biblioteca = new Biblioteca(libros);

        // Imprimir información de los libros
        for (Libro libro : libros) {
            System.out.println(libro);
        }

        // Calcular y mostrar el valor total de los libros disponibles
        double valorTotal = biblioteca.calcularValorTotal();
        System.out.println("Valor total de los libros disponibles: " + valorTotal + "€");
    }
}
