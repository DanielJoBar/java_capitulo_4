import java.util.Scanner;
public class Ejercicio4_2 {
    public static void main(){
    Scanner sc = new Scanner(System.in);
    int hora = sc.nextInt();
    if(hora>24){
        System.out.print("Usted ha escrito un número no válido");
    }
    if((hora<=24&&hora>=21)||hora<6){
        System.out.print("Buenas noches");
    }
    if(hora<21&&hora>=13){System.out.print("Buenas tardes");}
    if(hora<13&&hora>=6){System.out.print("Buenos dias");}
    sc.close();
    }
}
