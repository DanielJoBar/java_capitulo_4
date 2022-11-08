import java .util.Scanner;
public class Ejercicio4_21 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca la nota del primer examen: ");
    Float nota1=sc.nextFloat();
    System.out.print("Introduzca la nota del segundo examen");
    Float nota2=sc.nextFloat();
    float media = (nota1+nota2)/2;
    String recuperacion;
    if(media>=5){
        System.out.print("Usted esta aprobado con "+media);
    }
    else{
        System.out.print("Cual ha sido la nota de la recuperación(apto/no apto)");
        recuperacion=System.console().readLine();
        if(recuperacion.equals("apto")){
            System.out.print("Su nota de Programación es un 5");
        }
        else{
            System.out.print("Su nota es  "+media);
        }
    }
    sc.close();
}}
