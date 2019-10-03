package bol1;

import java.util.Scanner;

public class Bol1 {

    public static void main(String[] args) {
        System.out.println("");

        //CALCULA O ÁREA DUN TRIÁNGULO DE BASE 4 E ALTURA 3
            int base=4,altura=3,area;
            area=(base*altura)/3;
            System.out.println("A área do triángulo é: "+area);

        System.out.println("");
        //CALCULA LONXITUDE CIRCUNFERENCIA
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
            Scanner sc=new Scanner(System.in);
                System.out.println("Introduce el radio:");
                float radio=sc.nextFloat();
                sc.close();
            System.out.println("A lonxitude da circunferencia é: "+(2*Math.PI*radio));
        
        System.out.println("");
        //PASAR DE EUROS A DÓLARES
            Scanner cambio=new Scanner(System.in);
                System.out.printIn("Introduce una cantidad en euros:");
                float euro=cambio.nextFloat();
                cambio.close();
            float dolar=euro*1.09f;
            System.out.println("El cambio en dólares es: "+dolar+"$");
    }
}