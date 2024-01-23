import java.util.Collections;
import java.util.Scanner;
public class HolaMundo {
    public static void main(String[] args){
//      Se muestra un mensaje en consola
//        System.out.println("Hola mundo Lenguaje Java");
//
//        int numero = 6;
//        int numero2;
//        int num3 =5, num4=-23;
//        double real = 5.55;
//        char caracter = 't';
//        boolean valor = true;
//
//        int resultado =  num3 + numero;
//        System.out.println(resultado);

        int n1 = 6;
        double d1 = -5.5;
        String c1 = "hola";
        System.out.println("EStos es un mensaje que se muestra por consola");
        System.out.println("El contenido de la variable n1 es: " + n1 + ", el contenido de la " + "variable d1 es: "+d1+ " y el valor de la variable c1: " + c1);
        System.out.println(n1);

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entero ");
        int numero = sc.nextInt();
//        int numero = sc.nextLine(); para ingresar un mensaje
//        int numero = sc.nextBoolean(); para ingresar datos de tipo booleanos
        System.out.println("El numero entero ingresado es: " + numero);


    }
}
