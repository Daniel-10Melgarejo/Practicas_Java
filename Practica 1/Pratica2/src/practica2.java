import java.util.Scanner;

public class practica2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca los euros a convertir: ");
        double euros = sc.nextDouble();

        double dolares = euros * 1.21;

        System.out.println(euros + " euros = " + dolares + " dolares");
    }

}
