import java.util.Scanner;
public class Ejercicio4_22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un dia de la semana");
    String diaSemana=System.console().readLine();
    System.out.println("Escribe la hora actual(solo la hora)");
    double hora=sc.nextInt();
    System.out.println("Escribe los minutos actuales(solo los minutos)");
    double minuto=sc.nextInt();
    double tiempo;
    if(hora<0||hora>24||minuto<0||minuto>60){System.out.print("Usted ha introducido un valor no válido");}
        else{
    switch(diaSemana){
        case "Lunes":
        hora=24*3+15+hora;
        minuto=(minuto*0.01)+(24-hora);
        tiempo = minuto*60;
        System.out.println("Le queda para el finde: "+minuto);
        break;
        case "Martes":
        hora=24*2+15+hora;
        minuto=(minuto*0.01)+(24-hora);
        tiempo = minuto*60;
        System.out.println("Le queda para el finde: "+minuto);
        case "Miércoles":
        hora=24+15+hora;
        minuto=(minuto*0.01)+(24-hora);
        tiempo = minuto*60;
        System.out.println("Le queda para el finde: "+minuto);
        break;
        case "Jueves":
        hora=15+(24-hora);
        minuto=(minuto*0.01)+hora;
        tiempo = minuto*60;
        System.out.println("Le queda para el finde: "+minuto);
        break;
        case "Viernes":
        hora=15-hora;
        minuto=(minuto*0.01)+hora;
        tiempo = minuto*60;
        System.out.println("Le queda para el finde: "+minuto);
        if(hora<0){System.out.println("Ya es finde semana");}
        break;
    }
    }sc.close();
}
}