import java.util.Scanner;

public class pratica3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero de alumnos de la clase: ");
        int numclase = sc.nextInt();
        int contMayores = 0;
        int contMenores = 0;
        double suma = 0;
        for (int i = 1; i<=numclase; i++){
            System.out.println("Introduce la altura del alumno " + i);
            double altura = sc.nextDouble();
            suma = suma + altura;
            if (altura >= 1.8){
                contMayores ++;
            }
            else {
                contMenores++;
            }
        }
        double promedio =  suma/numclase;
        System.out.println("Numero de alumnos con altura mayor a 1.80: " + contMayores);
        System.out.println("Numero de alumnos con altura menor a 1.80: " + contMenores);
        System.out.println("El promedio es: " + promedio);
    }
}
