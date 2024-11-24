# Calculadora de Desconto

Este programa calcula o valor do desconto e o preço final de um produto com base no valor inicial e na porcentagem de desconto informados pelo usuário.

## Como Usar

1. O programa solicita as seguintes informações:
   - **Valor do produto**: O preço original do item.
   - **Porcentagem de desconto**: A porcentagem de desconto a ser aplicada.

2. O programa calcula o valor do desconto e o preço final após o desconto.

3. O valor do desconto e o preço final são exibidos com 2 casas decimais.

## Como Executar

### Passos

1. **Crie um arquivo Java** com o código abaixo:

   ```java
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


2. **Compile o código:**

javac CalculadoraDesconto.java

3. **Execute o programa:**

java CalculadoraDesconto

