public class Producto {
    private String nombre;
    private double precio;
    private CategoriaProducto categoria;

    // Constructor
    public Producto(String nombre, double precio, CategoriaProducto categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    // Método para calcular el precio con un descuento global del 10%
    public double aplicarDescuento() {
        return precio * 0.9;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return nombre + " - Precio final: " + aplicarDescuento();
    }
}
