public class Test {
    public static void main(String[] args) {
        // Crear algunos productos
        Producto laptop = new Producto("Laptop", 1200.0, CategoriaProducto.ELECTRONICA);
        Producto camiseta = new Producto("Camiseta", 20.0, CategoriaProducto.ROPA);
        Producto manzanas = new Producto("Manzanas", 2.5, CategoriaProducto.ALIMENTACION);

        // Crear un carrito con capacidad para 5 productos
        Carrito carrito = new Carrito(5);

        // Agregar los productos al carrito
        carrito.agregarProducto(laptop);
        carrito.agregarProducto(camiseta);
        carrito.agregarProducto(manzanas);

        // Mostrar los detalles del carrito y el total final
        carrito.mostrarDetalles();
    }
}
