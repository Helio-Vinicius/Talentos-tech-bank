package dia3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        exercicio5();
    }
    public static void validadorInteiro(Scanner in){
        if (!in.hasNextInt()){
            System.out.println("Digite um Numero Inteiro Valido");
            in.close();
            System.exit(1);
        }

    }

    public static void validadorDouble(Scanner in){
        if (!in.hasNextDouble()){
            System.out.println("Digite um Numero Real Valido");
            in.close();
            System.exit(1);
        }

    }


    public static void exercicio1() {
        int x;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um Numero:");
        if (!in.hasNextInt()) {
            System.out.println("Digite um Numero Valido");
            in.close();
            System.exit(1);

        }
        x = in.nextInt();
        if (x % 2 == 0) {
            System.out.println("esse numero é par");
        } else {
            System.out.println("esse numero é impar");

        }

    }

    public static void exercicio2() {
        int x;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um Numero:");
        if (!in.hasNextInt()) {
            System.out.println("Digite um Numero Valido");
            in.close();
            System.exit(1);
        }
        x = in.nextInt();

        if (x >= 5 && x <= 7) {
            System.out.println(" Infantil A");
        } else if (x >= 8 && x <= 11) {
            System.out.println("Infantil B");
        } else if (x >= 12 && x <= 13) {
            System.out.println("Juvenil A");
        } else if (x >= 14 && x <= 17) {
            System.out.println("Juvenil B");
        } else if (x >= 18 && x < 99) {
            System.out.println("Maiores 18");
        } else {
            System.out.println("idade não permitida");
        }

        in.close();

    }

    public static void exercicio3() {
        int N1, N2;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um Numero:");
        validadorInteiro(in);
        N1 = in.nextInt();

        System.out.println("Digite um Numero:");
        validadorInteiro(in);
        N2 = in.nextInt();
        if (N1 > N2) {
            System.out.println("O numero maior é n1:" + N1 + " e o numero menor é n2:" + N2);

        } else if (N2 > N1) {
            System.out.println("O numero maior é n2:" + N2 + "e o numero menor é n1:" + N1);

        } else {
            System.out.println("Os numeros são iguais");
        }
    }

    public static void exercicio4() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o Numero 1:");
        validadorInteiro(in);
        int numero = in.nextInt();

        int m1 = numero;
        int m2 = numero;
        int valorTotal = 0;

        valorTotal = valorTotal + numero;

        System.out.println("Digite o Numero 2:");
        validadorInteiro(in);
        numero = in.nextInt();
        valorTotal = valorTotal + numero;

        if (m1 > numero) {
            m1 = numero;
        } else if (m2 < numero) {
            m2 = numero;
        }

        System.out.println("Digite o Numero 3:");
        validadorInteiro(in);
        numero = in.nextInt();
        valorTotal = valorTotal + numero;

        if (m1 > numero) {
            m1 = numero;
        } else if (m2 < numero) {
            m2 = numero;
        }
        System.out.println("Digite o Numero 4:");
        validadorInteiro(in);
        numero = in.nextInt();
        valorTotal = valorTotal + numero;

        if (m1 > numero) {
            m1 = numero;
        } else if (m2 < numero) {
            m2 = numero;
        }
        System.out.println("Digite o Numero 5:");
        validadorInteiro(in);
        numero = in.nextInt();
        valorTotal = valorTotal + numero;

        if (m1 > numero) {
            m1 = numero;
        } else if (m2 < numero) {
            m2 = numero;
        }
        System.out.println("Digite o Numero 6:");
        validadorInteiro(in);
        numero = in.nextInt();
        valorTotal = valorTotal + numero;

        if (m1 > numero) {
            m1 = numero;
        } else if (m2 < numero) {
            m2 = numero;
        }
        System.out.println("Digite o Numero 7:");
        validadorInteiro(in);
        numero = in.nextInt();
        valorTotal = valorTotal + numero;

        if (m1 > numero) {
            m1 = numero;
        } else if (m2 < numero) {
            m2 = numero;
        }
        System.out.println("Digite o Numero 8:");
        validadorInteiro(in);
        numero = in.nextInt();
        valorTotal = valorTotal + numero;

        if (m1 > numero) {
            m1 = numero;
        } else if (m2 < numero) {
            m2 = numero;
        }
        System.out.println("Digite o Numero 9:");
        validadorInteiro(in);
        numero = in.nextInt();
        valorTotal = valorTotal + numero;

        if (m1 > numero) {
            m1 = numero;
        } else if (m2 < numero) {
            m2 = numero;
        }
        System.out.println("Digite o Numero 10:");
        validadorInteiro(in);
        numero = in.nextInt();
        valorTotal = valorTotal + numero;

        if (m1 > numero) {
            m1 = numero;
        } else if (m2 < numero) {
            m2 = numero;
        }

        System.out.println("O maior numero é:" + m2);
        System.out.println("O menor numero é:" + m1);
        System.out.println("E a media é:" + valorTotal / 10.0);


    }

    public static void exercicio5() {
        Scanner in = new Scanner(System.in);

        System.out.println("  1 - Adição 2 - Subtração 3 - Multiplicação  4 - Divisão");
        System.out.println("                    Escolha uma Opção");
        validadorInteiro(in);
        int opcao = in.nextInt();
        System.out.println("Digite o Primeiro Numero");
        validadorDouble(in);
        double n1 = in.nextDouble();
        System.out.println("Digite o Segundo Numero");
        validadorDouble(in);
        double n2 = in.nextDouble();

        if ( opcao == 1){
            System.out.println("A soma dos Valores é:" + (n1 + n2));
        }else if (opcao == 2){
            System.out.println("A subtração dos Valores é:" + (n1 - n2));
        }else if (opcao == 3){
            System.out.println("A multiplicação dos Valores é:" + (n1 * n2));
        }else if(opcao == 4){
            if (n2 == 0){
                System.out.println("Não é possivel dividir um numero por 0.");
                in.close();
                System.exit(1);
            }
            System.out.println("A divisão dos Valores é:" + (n1 / n2));
        }
    }
    public static void exercicio6() {
        Scanner in = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------");
        System.out.println("----------------------- Jo Ken Pô -------------------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("------------ 1:PAPEL --- 2:PEDRA --- 3:TESOURA ------------");
        System.out.println("Escolha sua opcão Jogador 1:");
        int n1 = in.nextInt();
        System.out.println("Escolha sua opção Jogador 2:");
        int n2 = in.nextInt();
        if (n1 == 1 && n2 == 2 || n1 == 2 && n2 == 3 || n1 == 3 && n2 == 1) {
            System.out.println("O jogador 1 é o Vencedor");
        } else if (n2 == 1 && n1 == 2 || n2 == 2 && n1 == 3 || n2 == 3 && n1 == 1) {
            System.out.println("O jogador 2 é o Vencedor");
        } else if (n1 == n2){
            System.out.println("Deu empate");
        }else{
            System.out.println("Resultado invalido");
        }
    }
}
