import java.util.Scanner;
public class Ejercicio4_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero del dia de la semana que desea saber : ");
        int diaSemana = sc.nextInt();
        String nomDia;
        switch(diaSemana){
            case 1:
            nomDia="Lunes";
            break;
            case 4:
            nomDia="Jueves";
            break;
            case 2:
            nomDia="Martes";
            break;
            case 3:
            nomDia="Miércoles";
            break;
            case 5:
            nomDia="Viernes"; 
            break;
            case 6:
            nomDia="Sábado"; 
            break;case 7:
            nomDia="Domingo"; 
            break;
            default:
            nomDia="Sólo puede elegir entre el 1 y el 7";
        } 
        System.out.println("El dia  "+diaSemana+"  es  :"+nomDia);
        sc.close();
}}