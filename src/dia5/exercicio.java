package dia5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        exercicioV();
    }

    public static void exercicio1() {
        Scanner in = new Scanner(System.in);
        int base;
        int potencia;
        int resultado = 1;

        System.out.println("Digite a Base");
        base = in.nextInt();
        System.out.println("Digite a Potencia");
        potencia = in.nextInt();

        for (int i = 1; i <= potencia; i++) {
            resultado = resultado * base;
        }
        System.out.println(resultado);


    }

    public static void exercicio2() {
        int i = 4;
        while (i > 0) {
            System.out.println("**********");
            i--;
        }
        System.out.println("");
    }

    public static void exercicio2II() {
        int linhas = 10;
        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void exercicio2III() {
        int linhas = 10;
        for (int i = 1; i <= linhas; i++) {
            int k = linhas - i;
            while (k > 0) {
                System.out.print("  ");
                k--;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }

    public static void exercicio2IV() {
        int linhas = 10;
        for (int i = 1; i <= linhas; i++) {
            int espacos = linhas - i;
            while (espacos > 0) {
                System.out.print("  ");
                    espacos--;
            }
            int k = 0;
            while (k != 2 * i - 1) {
                System.out.print("* ");
                    k++;
            }
            System.out.print("\n");
        }
    }

    public static void exercicio2VI(){
        int linhas = 5;
        for (int i = 1; i <= linhas; i++) {
            int espacos = linhas - i;
            while (espacos > 0) {
                System.out.print("  ");
                espacos--;
            }
            int k = 0;
            int l = i;
            boolean estaDecrementando = true;
            while (k != 2 * i - 1) {
                System.out.printf("%d ", l);
                k++;
                if (l > 1 && estaDecrementando) {
                    l--;
                } else {
                    estaDecrementando = false;
                    l++;
                }
            }
            System.out.print("\n");
        }
    }
    public static void exercicioV(){
        int linhas = 5;
        for (int i = 1; i <= linhas; i++) {
            int espacos = linhas - i;
            while (espacos > 0) {
                System.out.print("  ");
                espacos--;
            }
            int k = 0;
            while (k != 2 * i - 1) {
                System.out.printf("%d ", i);
                k++;
            }
            System.out.print("\n");
        }
    }
}
