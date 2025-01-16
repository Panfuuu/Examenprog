package Ej1;

public class Producto {

    private String nombre;
    private double precio;
    private int cantidadEnStock;
    private double descuentoFijo;
    private static double DESCUENTO_GLOBAL;

    public Producto(String nombre, double precio, int cantidadEnStock, double descuentoFijo) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
        this.descuentoFijo = descuentoFijo;
    }

    public double calcularPrecioFinal() {
        // Aplica el descuento fijo al precio
        double precioConDescuentoFijo = precio * (1 - descuentoFijo);

        // Aplica el descuento global sobre el precio con descuento fijo
        double precioFinal = precioConDescuentoFijo * (1 - DESCUENTO_GLOBAL);

        return precioFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    public double getDescuentoFijo() {
        return descuentoFijo;
    }

    public void setDescuentoFijo(double descuentoFijo) {
        this.descuentoFijo = descuentoFijo;
    }

    public static double getDescuentoGlobal() {
        return DESCUENTO_GLOBAL;
    }

    public static void setDescuentoGlobal(double descuentoGlobal) {
        DESCUENTO_GLOBAL = descuentoGlobal;
    }

    @Override
    public String toString() {
        return "Ej1.Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidadEnStock=" + cantidadEnStock +
                ", descuentoFijo=" + descuentoFijo +
                '}';
    }
}

