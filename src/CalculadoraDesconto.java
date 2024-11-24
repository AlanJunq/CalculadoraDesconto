import java.util.Scanner;

public class CalculadoraDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: R$ ");
        double valorProduto = scanner.nextDouble();

        System.out.print("Digite a porcentagem de desconto: ");
        double percentualDesconto = scanner.nextDouble();

        double valorDesconto = (percentualDesconto / 100) * valorProduto;
        double valorFinal = valorProduto - valorDesconto;

        System.out.printf("Valor do desconto: R$ %.2f\n", valorDesconto);
        System.out.printf("Preço final: R$ %.2f\n", valorFinal);

        scanner.close();
    }
}
