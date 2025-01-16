package Ej1;

import java.util.Arrays;

public class Inventario {

    private Producto[] productos;

    public Inventario(Producto[] productos) {
        this.productos = productos;
    }


    public double precioTotal() {
        double precioTotal = 0;
        for (int i = 0; i < productos.length; i++) {
            // Calcula el precio final por unidad y lo multiplica por la cantidad en stock
            precioTotal += productos[i].calcularPrecioFinal() * productos[i].getCantidadEnStock();
        }
        return precioTotal;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Ej1.Inventario{" +
                "productos=" + Arrays.toString(productos) +
                '}';
    }
}
