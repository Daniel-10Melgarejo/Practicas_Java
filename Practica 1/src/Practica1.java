import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {


        Scanner sc1 = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = sc1.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = sc2.nextInt();

        System.out.println("Hola " +nombre+ ", tienes " +edad + " años!");

    }
}
