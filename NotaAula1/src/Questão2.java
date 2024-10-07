import java.util.Scanner;


public class Questão2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
                System.out.print("Digite o código do produto: ");
                int cod = sc.nextInt();
                System.out.println("Digite o nome do produto:");
                String nome = sc2.next();
                System.out.println("Digite o peso do produto:");
                double peso = sc.nextDouble();
                System.out.println("Digite a quantidade do produto:");
                int quantidade = sc.nextInt();
                System.out.println("Digite o valor do produto:");
                double valor = sc.nextDouble();
                System.out.println("Digite a cor do produto:");
                String cor = sc2.next();
                System.out.println("Crédito ou à vista? parcelamos em até 3x e caso seja a vista ganha-se 5% de desconto.");
                int pagamento = sc.nextInt();
                System.out.println("Em caso de espécie, qual foi o valor recebido?");
                double valorRecebido = sc.nextDouble();
                double troco = valorRecebido - valor;
                System.out.println("O troco é:" + troco);
                System.out.println("Parabéns pela venda!");








    }
}
