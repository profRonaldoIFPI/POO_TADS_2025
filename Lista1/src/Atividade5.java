import java.util.Scanner;
public class Atividade5 {
    /*
        Cálculo de Desconto: Crie um programa que leia o preço de um produto e o percentual
        de desconto, calcule o valor do desconto e o novo preço do produto.
        Valor do Desconto = Preço do Produto * (Percentual de Desconto / 100)
        Novo Preço = Preço do Produto - Valor do Desconto
    */
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o valor do produto: ");
        float valor = entrada.nextFloat();
        System.out.print("Informe o percentual de desconto: ");
        float desconto = entrada.nextFloat();
        float valorDesconto = valor * (desconto/100f);
        float novoPreco = valor - valorDesconto; 
        System.out.printf("Valor do produto R$ %.2f.\n", valor);
        System.out.printf("Desconto de %.2f %% = R$ %.2f.\n", desconto, valorDesconto);
        System.out.printf("Valor com desconto R$ %.2f.", novoPreco); 
        entrada.close(); //fecha o scanner*
    }
}