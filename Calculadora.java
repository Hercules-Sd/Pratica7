import java.util.Scanner;

public class Calculadora{

    public static int soma(int n1, int n2){
        return n1+n2;
    }


    public static int sub(int n1, int n2){
        return n1-n2;
    }

    public static int mut(int n1, int n2){
        return n1*n2;
    }

    public static int div(int n1, int n2){
        return n1/n2;
    }

    public static void main(String[] args){
        Scanner scanner = new
        Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
        int n2 = scanner.nextInt();

        System.out.println("Somatório: "+soma(n1,n2));
        System.out.println("Subtração: "+sub(n1,n2));
        System.out.println("Multiplicação: "+mut(n1,n2));
        System.out.println("Divisão: " +div(n1,n2));
    }
}
