public class Carrito {
    private Producto[] productos;
    private int capacidad;
    private int contador;

    // Constructor
    public Carrito(int capacidad) {
        this.capacidad = capacidad;
        this.productos = new Producto[capacidad];
        this.contador = 0;
    }

    // Método para agregar un producto al carrito
    public boolean agregarProducto(Producto producto) {
        if (contador < capacidad) {
            productos[contador] = producto;
            contador++;
            return true;
        } else {
            System.out.println("El carrito está lleno. No se puede agregar el producto: " + producto.getNombre());
            return false;
        }
    }

    // Método para calcular el total con el descuento aplicado
    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < contador; i++) {
            total += productos[i].aplicarDescuento();
        }
        return total;
    }

    // Método para mostrar los detalles de los productos en el carrito
    public void mostrarDetalles() {
        System.out.println("Productos en el carrito:");
        for (int i = 0; i < contador; i++) {
            System.out.println(productos[i]);
        }
        System.out.println("Total a pagar: " + calcularTotal());
    }
}
