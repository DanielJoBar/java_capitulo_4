import java.util.Scanner;
public class Ejercicio4_8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba 3 notas:  ");
        double notas = sc.nextDouble();
        double media=notas;
        for(int cont=1;cont<=2;cont++){
        notas=sc.nextDouble();
        media+=notas;
        }
        media=media/3;
        if (media<5){
            System.out.print("Media: Insuficiente ");
        }
        if(media>=5&&media<6){
            System.out.print("Media: Suficiente");
        }
        if(media>=6&&media<7){
            System.out.print("Media: Bien");
        }
        if(media>=7&&media<9){
            System.out.print("Media: Notable");
        }
        if(media>=9&&media<=10){
            System.out.print("Media: Sobresaliente");
        }
        
        sc.close();
    }
}
