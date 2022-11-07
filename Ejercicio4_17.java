import java.util.Scanner;
public class Ejercicio4_17 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Escriba un numero entero: ");
    int n=sc.nextInt();
    int entero=n%10;
    System.out.print("Entero ultimo numero : "+entero);
    sc.close();
}
}
