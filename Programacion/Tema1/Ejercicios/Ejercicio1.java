package Ejercicios;

public class Ejercicio1 {

    public static void main(String[] args) {

        /** 1. Si A = 6, B = 2, C = 3, indicar el resultado final de las siguientes expresiones aritméticas  **/
       
        int a = 6;
        int b = 2;
        int c = 3;

        System.out.println("a. " + ((a*c)%c));
        System.out.println("b. " + (a*b/c));
        System.out.println("c. " + (c%b+c*b));
        System.out.println("d. " + (a%(a*b*c/(b+c))));
        System.out.println("e. " + (b*b+c-b*(a%b)));

    }

}
