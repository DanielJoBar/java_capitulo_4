import java.util.Scanner;
public class Ejercicio4_20{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1,n2,n3,n4,n5;
       if(n>=10&&n<100){
        if(n%11==0){
            System.out.print(n+" es un numero capicúo");
        }
        else{System.out.print(n+" no es un numero capicúo");}
       }
       if(n>=100&&n<1000){
        n1 = n/100;
        if((n-n1)%100==0||n%111==0){System.out.print(n+" es un número capicúo");}
        else{System.out.print(n+" no es un numero capicúo");}
       }
       if(n>=1000&&n<10000){
       n1=n/1000;
       n2=(n/100)-(n1*10);
       n3=n/10-(n1*100+n2*10);
       n4=n-(n1*1000+n2*100+n3*10);
       if(n3==n2&&n4==n1){
        System.out.print(n+" es un número capicúo");
       }
      else{System.out.print(n+" no es un numero capicúo");
       }}
       if(n>=10000&&n<100000){
        n1=n/10000;
        n2=(n/1000)-(n1*10);
        n3=n/100-(n1*100+n2*10);
        n4=n/10-(n1*1000+n2*100+n3*10);
        n5=n-(n1*10000+n2*1000+n3*100);
        if(n4==n2&&n5==n1){
         System.out.print(n+" es un número capicúo");
        }
       else{System.out.print(n+" no es un numero capicúo");
        }
       }
       if(n<10||n>=100000){
        System.out.print("Usted ha introducido un valor no valido");
       }
        sc.close();
    
}}