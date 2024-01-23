import java.util.Scanner;

public class practica4 {

    public static void main(String[] args){

        Scanner sc =  new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();
        int contPares = 0;
        int conImpares = 0;

        while (numero != 0){
            if (numero %2 == 0){
                contPares ++;
            }
            else {
                conImpares++;
            }
            System.out.println("Introduce un numero: ");
            numero = sc.nextInt();
        }

        System.out.println("Cantidad de numeros pares introducidos: " + contPares);
        System.out.println("Cantidad de numeros impares introducidos: " + conImpares);
    }
}
