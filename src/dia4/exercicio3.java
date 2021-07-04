package dia4;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        exercicio2();

    }

    public static void exercicio1() {
        Scanner in = new Scanner(System.in);
        int numero;
        int m1 = Integer.MAX_VALUE;
        int m2 = Integer.MIN_VALUE;
        int valorTotal = 0;
        for (int i = 0; i < 10; i++) {
            System.out.printf("digite o %d número\n", i+1) ;
            numero = in.nextInt();
            if (m2 < numero) {
                m2 = numero;
            }
            if (m1 > numero) {
                m1 = numero;
            }
            valorTotal += numero;

        }
        System.out.println("O maior numero é:" + m2);
        System.out.println("O menor numero é:" + m1);
        System.out.println("E a media é:" + valorTotal / 10.0);
        in.close();
    }
    public static void exercicio2(){
        Scanner in = new Scanner(System.in);
        System.out.println("digite um numero para saber o seu fatorial");

        int numero = in.nextInt();

        int resultado = 1;

        for(int i = numero;i > 1; i--){
            resultado = resultado * i;

        }
        System.out.println(resultado);
        in.close();
    }
}
