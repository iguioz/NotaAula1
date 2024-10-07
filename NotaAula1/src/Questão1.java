import java.util.Scanner;


public class Questão1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a primeira nota: ");
        double nota = sc.nextDouble();
        System.out.println("Insira a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Insira a terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota + nota2 + nota3) / 3;
        System.out.println("Media: " + media);

        if (media >= 7) {System.out.println("Aprovado");}
        else {System.out.println("Reprovado");}

    }
}
