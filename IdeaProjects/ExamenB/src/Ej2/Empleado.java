package Ej2;

public class Empleado {

    private Rol rol;
    private String nombre;
    private double salarioBase;
    private static double BONO_BASE;

    public Empleado(Rol rol, String nombre, double salarioBase) {
        this.rol = rol;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public double calcularSalarioTotal() {

        double salarioTotal = 0;

        switch (rol) {
            case Rol.ADMIN:
                salarioTotal = 1000 + salarioBase + BONO_BASE;
                break;
            case Rol.GERENTE:
                salarioTotal = 800 + salarioBase + BONO_BASE;
                break;
            case Rol.EMPLEADO:
                salarioTotal = 300 + salarioBase + BONO_BASE;
                break;

        }
        return salarioTotal;



    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getBONO_BASE() {
        return BONO_BASE;
    }

    public static void setBONO_BASE(double BONO_BASE) {
        Empleado.BONO_BASE = BONO_BASE;
    }



    @Override
    public String toString() {
        return "Ej2.Empleado{" +
                "rol=" + rol +
                ", nombre='" + nombre + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
