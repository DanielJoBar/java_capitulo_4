import java.util.Scanner;
public class Ejercicio4_16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);    
        System.out.println("Responda a las siguientes preguntas para saber si su pareja le esta siendo infiel(respuestas de si o no): ");
        int contV=0;
        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        String respuesta =System.console().readLine();
        if(respuesta.equals("si")){contV+=3;}
        System.out.println("2. Ha aumentado sus gastos de vestuario");
        respuesta =System.console().readLine();
        if(respuesta.equals("si")){contV+=3;}
        System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
        respuesta =System.console().readLine();
        if(respuesta.equals("si")){contV+=3;}
        System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
        respuesta =System.console().readLine();
        if(respuesta.equals("si")){contV+=3;}
        System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
        respuesta =System.console().readLine();
        if(respuesta.equals("si")){contV+=3;}
        System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
        respuesta =System.console().readLine();
        if(respuesta.equals("si")){contV+=3;}
        System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
        respuesta =System.console().readLine();
        if(respuesta.equals("si")){contV+=3;}
        System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
        respuesta =System.console().readLine();
        if(respuesta.equals("si")){contV+=3;}
        System.out.println("9. Has notado que últimamente se perfuma más");
        respuesta =System.console().readLine();
        if(respuesta.equals("si")){contV+=3;}
        System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
        respuesta =System.console().readLine();
        if(respuesta.equals("si")){contV+=3;}
        if(contV>=0&&contV<=10){System.out.print("¡Enhorabuena! tu pareja parece ser totalmente fiel");}
        if(contV>10&&contV<=22){System.out.print("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");}
        if(contV>22&&contV<=30){System.out.print("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");}        
        sc.close();
    }
}
