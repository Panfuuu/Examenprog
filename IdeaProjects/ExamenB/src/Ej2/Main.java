package Ej2;

public class Main {
    public static void main(String[] args) {

        // Establecer el bono base para todos los empleados
        Empleado.setBONO_BASE(500); // Cambiar el bono base de todos los empleados

        // Crear empleados
        Empleado juan = new Empleado(Rol.ADMIN, "Juan", 2500);
        Empleado ana = new Empleado(Rol.GERENTE, "Ana", 2000);
        Empleado carlos = new Empleado(Rol.EMPLEADO, "Carlos", 1500);
        Empleado lucia = new Empleado(Rol.EMPLEADO, "Lucía", 1600);

        // Crear un array con los empleados
        Empleado[] empleados = {juan, ana, carlos, lucia};

        // Crear empresa y calcular salarios
        Empresa empresa = new Empresa(empleados);
        empresa.salarioTodos();
    }
}
