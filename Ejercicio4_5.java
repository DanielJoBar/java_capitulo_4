import java.util.Scanner;
public class Ejercicio4_5 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("La operación realizada es : ax+b=0");
        System.out.print("Introduzca el numero que acompañará a la x:");
        long a = sc.nextLong();
        System.out.print("Introduzca el numero que opera a x");
        long b =sc.nextLong();
        long operacion = -b/a;
        System.out.print("Su x valdrá: "+operacion);
        sc.close();
    }
}
