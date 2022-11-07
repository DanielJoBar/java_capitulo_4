import java.util.Scanner;
public class Ejercicio4_11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba la hora que es ahora mismo(sin los minutos): ");
        long h=  sc.nextLong();
        System.out.print("Escriba los minutos: ");
        long m=sc.nextLong();
        if(m>=60||h>24){
            System.out.print("Usted ha escrito mas minutos u horas de lo que se  puede vuelva a escribir las horas y min");
            h=sc.nextLong();
            m=sc.nextLong();
        }
        h=h*3600;
        m=m*60;
        long MediaNoche=24*3600;
        long operacion=MediaNoche-(h+m);
        System.out.print("Quedan: "+operacion+" segundos");
        sc.close();
    }
}