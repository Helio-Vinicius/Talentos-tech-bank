package dia2;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        exercicio4();
}

    public static void exercicio2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um Valor para mostrar o antecessor");
        int valor = in.nextInt();

        System.out.println("o antecessor de " + valor + " é " + --valor);
        in.close();
    }

    public static void exercicio1() {
        short vX = 99;
        short vY = 11;
        short vT;

        vT = vX;
        vX = vY;
        vY = vT;

        System.out.println(vX);
        System.out.println(vY);

    }

    public static void exercicio3() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a Base:");
        int valor = in.nextInt();
        System.out.println(valor);
        System.out.println("Digite a Altura");
        int valor2 = in.nextInt();
        System.out.println(valor2);
        int resultado = valor * valor2;
        System.out.println("o calculo do retangulo é:" + resultado);
        in.close();


    }
    public static void exercicio4(){
        int numeroTotal, votosBranco, votosNulos,votosValidos;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o numero Total de Votos:");
        numeroTotal = in.nextInt();
        System.out.println("Digite o Numero de Votos Brancos:");
        votosBranco = in.nextInt();
        System.out.println("Digite o Numero de Votos Nulos:");
        votosNulos = in.nextInt();
        System.out.println("Digite o Numero de Votos Validos");
        votosValidos = in.nextInt();

        double percentualNumeroBranco = votosBranco * 100 / numeroTotal;
        double percentualNumeroNulos = votosNulos * 100 / numeroTotal;
        double percentualNumeroValidos = votosValidos * 100 / numeroTotal;

        System.out.println("O percentual dos votos em branco é:" + percentualNumeroBranco);
        System.out.println("O percentual dos votos nulos é:" + percentualNumeroNulos);
        System.out.println("O percentual dos votos Validos é:" + percentualNumeroValidos);
        in.close();

    }


}