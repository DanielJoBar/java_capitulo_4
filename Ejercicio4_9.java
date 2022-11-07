import java.util.Scanner;
public class Ejercicio4_9 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("La operación realizada es : ax^2+bx+c=0");
        System.out.print("Introduzca el valor de a: ");
        long a = sc.nextLong();
        System.out.print("Introduzca el valor de b: ");
        long b =sc.nextLong();
        System.out.print("Introduzca el valor de c: ");
        long c =sc.nextLong();
        double operacion = ((-b+Math.sqrt(b*b-4*a*c))/2*a);
        double operacion2=((-b-Math.sqrt(b*b-4*a*c))/2*a);
        System.out.printf("Su x valdrá:%.3f \n ",operacion,"si se suma");
        System.out.printf("Su x valdrá:%.3f \n ",operacion2,"si se resta");
        sc.close();
    }
}
