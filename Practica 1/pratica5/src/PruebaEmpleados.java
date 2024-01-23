public class PruebaEmpleados {
    public static void main(String[] args){

        //instanciamos la clase empleado para acceder a sus atributos
        empleado empleado1 = new empleado();

        empleado empleado2 =  new empleado("123","oscar", 1500);

        empleado2.incrementarSalario(500);

        empleado2.setDni("321");
        System.out.println(empleado1.imprimirDatos());
        System.out.println(empleado2.imprimirDatos());

        empleado.getNumero();
        System.out.println(empleado.getNumero());

    }
}
