import java.util.Scanner;
public class Ejercicio4_18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    int n;
    int entero=0;
    System.out.print("Por favor, introduzca un número entero (de 5 cifras como máximo): ");
    n = sc.nextInt();
    if ( n < 10 ) {
    entero = n;
    }
    if (( n >= 10 ) && ( n < 100 )) {
    entero = n / 10;
    }
    if (( n >= 100 ) && ( n < 1000 )) {
    entero = n / 100;
    }
    if (( n >= 1000 ) && ( n < 10000 )) {
    entero = n / 1000;
    }
    if ( n >= 10000 ) {
    entero = n / 10000;
    }
    System.out.println("El primer numero es " + entero);
    sc.close();
    }
    }