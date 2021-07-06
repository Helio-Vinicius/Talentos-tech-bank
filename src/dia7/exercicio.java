package dia7;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
            exercicio1();
    }
    public static void exercicio1(){
        int vetor[] = new int[5];


        Scanner in = new Scanner(System.in);
        for (int i = 0;i <= 4;i++){
            System.out.println("Digite um numero:");
            vetor[i] = in.nextInt();

        }
        System.out.println(Arrays.toString(vetor));
        in.close();
    }

        }



