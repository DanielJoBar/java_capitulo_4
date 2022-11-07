import java.util.Scanner;
public class Ejercicio4_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("La operacion utilizada es t =√((2h)/g), sinedo g=9.81 m/s^2");
        System.out.print("Escriba el valor de h: ");
        double h = sc.nextDouble();
        double g = 9.81 ;
        double operacion = Math.sqrt((2*h)/g);
        System.out.print("El tiempo que tarda en caer el objeto desde la altura "+h+" es de: "+operacion);
        sc.close();
    }
}
