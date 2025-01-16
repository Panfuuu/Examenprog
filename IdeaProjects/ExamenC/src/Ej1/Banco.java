package Ej1;

public class Banco {

    private final String lugar;

    public Banco(String lugar) {
        this.lugar = lugar;
    }

    public static double calcularTotal(CuentaBancaria[] cuentas) {
        double total = 0;

        for (int i = 0; i < cuentas.length; i++) {
            total += cuentas[i].getSaldo(); // Sumamos el saldo de cada cuenta
        }

        return total;
    }



}
