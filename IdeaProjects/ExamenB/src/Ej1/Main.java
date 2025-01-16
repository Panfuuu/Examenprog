package Ej1;

public class Main {

    public static void main(String[] args) {
        // Establecer el descuento global para todos los productos
        Producto.setDescuentoGlobal(0.10); // 10% de descuento global

        // Crear productos
        Producto laptop = new Producto("Laptop", 1500.00, 10, 0.20);  // 20% descuento fijo
        Producto camiseta = new Producto("Camiseta", 25.00, 50, 0.10);  // 10% descuento fijo
        Producto manzanas = new Producto("Manzanas", 3.00, 200, 0.05);  // 5% descuento fijo

        // Crear inventario
        Producto[] productos = {laptop, camiseta, manzanas};
        Inventario inventario = new Inventario(productos);

        // Imprimir detalles de cada producto y el precio total del inventario
        for (Producto producto : productos) {
            System.out.println("Ej1.Producto: " + producto.getNombre() +
                    " - Precio final por unidad: " + String.format("%.2f", producto.calcularPrecioFinal()) +
                    "€ - Stock: " + producto.getCantidadEnStock());
        }

        // Imprimir el total del inventario
        System.out.println("Total del inventario: " + String.format("%.2f", inventario.precioTotal()) + "€");
    }
}
