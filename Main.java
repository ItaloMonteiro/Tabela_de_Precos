/*O Sr. Manoel Joaquim possui uma 
grande loja de artigos de R$ 1,99, com 
cerca de 10 caixas. Para agilizar o 
cálculo de quanto cada cliente deve 
pagar ele desenvolveu um tabela que 
contém o número de itens que o cliente 
comprou e ao lado o valor da conta. 
Desta forma a atendente do caixa 
precisa apenas contar quantos itens o 
cliente está levando e olhar na tabela 
de preços. Você foi contratado para 
desenvolver o programa que monta esta 
tabela de preços, que conterá os preços 
de 1 até 50 produtos, conforme o 
exemplo abaixo:*/
import java.util.Scanner;
import java.text.DecimalFormat;

class Main {
  public static void main(String[] args) {
    DecimalFormat formatador = new DecimalFormat("0.00");
    Scanner scan = new Scanner(System.in);
    System.out.print("\nDigite o nome do produto: ");
    String nomeProduto = scan.nextLine();
    float valorProduto = 1.99f;

    System.out.println("\n" + nomeProduto + ":\n");
    for(int i = 1; i < 51; i++){
      System.out.println(i + " - R$ " + formatador.format(valorProduto * i));
    }
 }
}