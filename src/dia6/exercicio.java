package dia6;
import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        exercicio2();
    }
    public static void exercicio1(){
        int[] numero;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número inteiro para criar um array");
        int tamanhoArray = in.nextInt();
        numero = new int[tamanhoArray];
        for (int i = 0; i < tamanhoArray; i++) {
            numero[i] = i + 1;
        }
        for (int i = numero.length - 1; i > -1; i--) {
            System.out.println(numero[i]);
        }
        in.close();
    }
    public static void exercicio2(){
        int[] lista = {50, 30, 25, 80, 2, 7, 30, 20, -1, -101, 30, 50};
        int menor;
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[j] < lista[i]) {
                    menor = lista[j];
                    lista[j] = lista[i];
                    lista[i] = menor;
                }
            }
        }
        for (int valor : lista) {
            System.out.println(valor);
        }
    }
}
