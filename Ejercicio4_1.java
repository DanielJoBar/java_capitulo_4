import java.util.Scanner;
public class Ejercicio4_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero del dia de la semana que desea saber la primera asignatura del dia(1-5)");
        int diaSemana = sc.nextInt();
        String asignatura;
        switch(diaSemana){
            case 1:
            asignatura="Programación";
            break;
            case 4:
            case 2:
            asignatura="Sistemas Informáticos";
            break;
            case 3:
            asignatura="Entorno de Desarrollo";
            break;
            case 5:
            asignatura="FOL"; 
            break;
            default:
            asignatura="Sólo puede elegir entre el 1 y el 5";
        } 
        System.out.println("El dia  "+diaSemana+"  toca:"+asignatura);
        sc.close();
}}