import java.util.Scanner;
public class Ejercicio4_24{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cual es su cargo ?(1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto): ");
        String cargo = System.console().readLine();
        System.out.print("¿Cuantos dias ha estadio de viaje visitando clietes durante el mes?: ");
        int dias = sc.nextInt();
        System.out.print("¿Cual es su estado civil actual?(soltero o casado): ");
        String estado = System.console().readLine();
        int sueldo;
        double IRPF,sueldoNeto;
        if(cargo.equals("Prog. junior")){
        sueldo = 950;
        }
        else if(cargo.equals("Prog. senior")){
            sueldo=1200;
        }
        else{
            sueldo=1600;
        }
        sueldo=sueldo+30*dias;
        if(estado.equals("casado")){
        IRPF=0.2*(double)sueldo;}
        else{
        IRPF=0.25*(double)sueldo;}
        sueldoNeto=sueldo-IRPF;
        System.out.println("------------------------------------");
        System.out.println("| Sueldo base                  "+(sueldo-30*dias)+" |");
        System.out.println("| Dietas( "+dias+" viajes)             "+30*dias+" |");
        System.out.println("------------------------------------");
        System.out.println("| Sueldo bruto                "+sueldo+" |");
        System.out.println("| Restricción IRPF("+(int)((IRPF/sueldo)*100)+" %)       "+IRPF+" |");
        System.out.println("------------------------------------");
        System.out.println("| Sueldo neto                "+sueldoNeto+" |");
        System.out.println("------------------------------------");
        sc.close();
    }
}