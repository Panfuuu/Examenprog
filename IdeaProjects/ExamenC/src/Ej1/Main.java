package Ej1;

public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco("Barcelona");

        CuentaBancaria[] cuentas = new CuentaBancaria[3];
        cuentas[0] = new CuentaBancaria("Juan", 5000, TipoCuenta.AHORRO);
        cuentas[1] = new CuentaBancaria("Ana", 3000, TipoCuenta.CORRIENTE);
        cuentas[2] = new CuentaBancaria("Carlos", 10000, TipoCuenta.EMPRESARIAL); // 0

        System.out.println(cuentas[0].toString());
        System.out.println(cuentas[1].toString());
        System.out.println(cuentas[2].toString());

        double total = banco.calcularTotal(cuentas);

        System.out.println("Total: " + total + "€");

    }
}