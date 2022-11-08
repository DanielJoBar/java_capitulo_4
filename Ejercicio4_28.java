import java.util.Scanner;
public class Ejercicio4_28{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Jugador uno introduzca su jugada(piedra,papel,tijera): ");
        String jugador1 = System.console().readLine();
        System.out.println("Jugador dos introduzca su jugada(piedra,papel,tijera): ");
        String jugador2 = System.console().readLine();
        if(jugador1.equals("piedra")||jugador1.equals("papel")||jugador1.equals("tijeras")){
            if(jugador2.equals("piedra")||jugador2.equals("papel")||jugador2.equals("tijeras")){
            if(jugador1==jugador2){
                System.out.print("Empate");
            }
            else if(jugador1.equals("tijeras")&&jugador2.equals("papel")){
                System.out.print("El jugador uno gana");
            }
            else if(jugador1.equals("tijeras")&&jugador2.equals("piedra")){
                System.out.print("El jugador dos gana");
            }
            else if(jugador1.equals("piedra")&&jugador2.equals("papel")){
                System.out.print("El jugador dos gana");
            }
            else if(jugador1.equals("piedra")&&jugador2.equals("tijeras")){
                System.out.print("El jugador uno gana");
            }
            else if(jugador1.equals("papel")&&jugador2.equals("tijeras")){
                System.out.print("El jugador dos gana");
            }
            else if(jugador1.equals("papel")&&jugador2.equals("piedra")){
                System.out.print("El jugador uno gana");
            }
            }
            else{
                System.out.print("El jugador uno o dos ha introducido un valor no valido");
            }
        }
        else{
            System.out.print("El jugador uno o dos ha introducido un valor no valido");
        }
        sc.close();
    }}