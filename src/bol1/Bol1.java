package bol1;

import java.util.Scanner;

public class Bol1 {

    public static void main(String[] args) {
        /* System.out.println("");

        //1-CALCULA O ÁREA DUN TRIÁNGULO DE BASE 4 E ALTURA 3
            int base=4,altura=3,area;
            area=(base*altura)/3;
            System.out.println("A área do triángulo é: "+area); */

        /* System.out.println("");
        //2-CALCULA LONXITUDE CIRCUNFERENCIA
            /* float radio=2.5f, lonxitude;
            lonxitude=2*3.14f*radio;
            System.out.println("A lonxitude da circunferencia é: "+lonxitude); */
            /* float radio=2.5f;
            System.out.println("A lonxitude da circunferencia é: "+(2*3.14f*radio)); */
            /* float radio=2.5f;
            float lonxitude=2*3.14f*radio;
            System.out.println("A lonxitude da circunferencia é: "+lonxitude); */
        //Utilizando a constante PI. A palabra clave "final" utilízase para declarar unha constante.
            /* float radio=2.5f;
            final float PI=3.14f;
            System.out.println("A lonxitude da circunferencia é: "+(2*PI*radio)); */
        //Utilizando clase Math
            /* float radio=2.5f;
            float lonxitude=(float)(2*Math.PI*radio);
            System.out.println("A lonxitude da circunferencia é: "+lonxitude); */
        //Pedir datos por teclado
            /* Scanner sc=new Scanner(System.in);
                System.out.println("Introduce el radio:");
                float radio=sc.nextFloat();
                sc.close();
            System.out.println("A lonxitude da circunferencia é: "+(2*Math.PI*radio)); */
        
        /* System.out.println("");
        //3-PASAR DE EUROS A DÓLARES
            Scanner cambio=new Scanner(System.in);
                System.out.println("Introduce una cantidad en euros:");
                float euro=cambio.nextFloat();
                cambio.close();
            float dolar=euro*1.09f;
            System.out.println("El cambio en dólares es: "+dolar+"$"); */

        /* System.out.println("");
        //4-SUMA,RESTA,PRODUTO E COCIENTE
            Scanner cifras=new Scanner(System.in);
                System.out.println("Introduce un número:");
                int n1=cifras.nextInt();
                System.out.println("Introduce otro número:");
                int n2=cifras.nextInt();
                cifras.close();
            int s=(n1+n2);
                System.out.println("O resultado da suma é: "+s);
                System.out.println("");
            int r=(n1-n2);
                System.out.println("O resultado da resta é: "+r);
                System.out.println("");
            int p=(n1*n2);
                System.out.println("O resultado do producto é: "+p);
                System.out.println("");
            int c=(n1/n2);
                System.out.println("O resultado do cociente é: "+c); */

        System.out.println("");
        //5-PASAR DE MILLAS A METROS
            Scanner distancia=new Scanner(System.in);
                System.out.println("Introduce una distancia en millas:");
                float milla=distancia.nextFloat();
                distancia.close();
            float metro=milla*1852f;
            System.out.println("La distancia en metros es: "+metro+" m");
    }
}
