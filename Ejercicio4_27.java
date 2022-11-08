import java.util.Scanner;
public class Ejercicio4_27{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿De qué sabor quiere la tarta(manzana,fresa o chocolate)? ");
        String sabor = System.console().readLine();
        float precioPastel=0,precioTotal=0,precioNata=0,precioNombre=0;
        switch(sabor){
            case "manzana":
            precioPastel+=18;
            break;
            case "fresa":
            precioPastel+=16;
            break;
            case "chocolate":
            System.out.println("¿De qué tipo,blanco o negro?");
            String tipo = System.console().readLine();
            if(tipo.equals("blanco")){
            precioPastel+=14;}
            else{precioPastel+=15;}
            break;
            default:
            System.out.print("Ha introducido un valor no válido");
        }
        System.out.println("¿Quiere añadirle nata a la tarta?(si o no)");
        String nata = System.console().readLine();
        System.out.println("¿Y querria usted que le añadamos el nombre?");
        String nombre = System.console().readLine();
        if(nata.equals("Si")||nata.equals("si")){
            precioNata+=2.50;
            System.out.print("Precio nata: "+precioNata);
        }
        if(nombre.equals("Si")||nombre.equals("si")){
        precioNombre+=2.75;
        System.out.print("Precio de personalización: "+precioNombre);
        }
        precioTotal=precioPastel+precioNata+precioNombre;
        System.out.print("Total: "+precioTotal);
        sc.close();
    }
}