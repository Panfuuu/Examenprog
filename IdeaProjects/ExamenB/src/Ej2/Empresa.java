package Ej2;

public class Empresa {

    private Empleado[] empleados;

    public Empresa(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public void salarioTodos() {
        double salarioTotalEmpresa = 0;

        // Iterar sobre los empleados y mostrar el salario de cada uno
        for (Empleado empleado : empleados) {
            double salarioEmpleado = empleado.calcularSalarioTotal();
            salarioTotalEmpresa += salarioEmpleado;
            // Imprimir el nombre del empleado y su salario total con el formato adecuado
            System.out.println(empleado.getNombre() + ": " + salarioEmpleado + "€");
        }

        // Imprimir el total de salarios de todos los empleados
        System.out.println("Total de salarios: " + salarioTotalEmpresa + "€");
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Ej2.Empresa{" +
                "empleados=" + empleados +
                '}';
    }
}

