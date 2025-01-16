package Ej1;

public class CuentaBancaria {

    private final String titular;
    private double saldo;
    private TipoCuenta tipoCuenta;

    public CuentaBancaria(String titular, double saldo, TipoCuenta tipoCuenta) {
        this.titular = titular;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public void realizarTransaccion(double cantidad, String tipoTransaccion) {

        if (tipoTransaccion.equals("deposito")) {
            this.saldo += cantidad;
        } else if (tipoTransaccion.equals("retiro")) {
            this.saldo -= cantidad;
        }

    }

    public String calcularInteres() {

        double interes = 0;

        switch (tipoCuenta) {
            case TipoCuenta.AHORRO:
                interes = 100;
                break;
            case TipoCuenta.CORRIENTE:
                interes = 30;
                break;
            case TipoCuenta.EMPRESARIAL:
                interes = 500;
                break;
        }

        return  interes + "€";

    }

    public String getTitular() {
        return titular;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return
                titular + " - " +
                        "Saldo:" + saldo +
                        " - Intereses: " + calcularInteres();
    }
}
