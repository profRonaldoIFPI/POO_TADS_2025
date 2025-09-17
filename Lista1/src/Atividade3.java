import java.util.Scanner;
public class Atividade3 {
    /*
        Conversão de Moedas: Faça um programa que leia um valor em reais e a cotação do
        dólar, calcule o equivalente em dólares e exiba o valor.
        Valor em Dólares = Valor em Reais / Cotação do Dólar
    */
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o valor em R$: ");
        float real = entrada.nextFloat();
        System.out.print("Informe a cotação do US$: ");
        float dollar = entrada.nextFloat();
        float emDollar = real/dollar;
        // System.out.println("R$ "+real+" = US$ "+emDollar);
        System.out.printf("R$ %.2f = US$ %.2f ", real, emDollar); //com máscara
        entrada.close(); //fecha o scanner*
    }
}