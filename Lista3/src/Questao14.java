import java.util.Scanner;
public class Questao14 {
/*
  Elaborar um programa que leia sucessivamente valores numéricos e apresente no final o somatório, a média e o total de valores lidos. O programa deve ler os valores enquanto o usuário estiver fornecendo valores positivos. Ou seja. c programa deve parar quando o usuário fornece um valor negativo (menor que zero).
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float valor, media, soma = 0;
        int quantidade = 0;
        do{
            quantidade++;
            System.out.print("Digite um valor: ");
            valor = input.nextFloat();
            soma+=valor;
        }while(valor>=0);
        media = soma/ quantidade;
        System.out.println("A Soma é "+ soma);
        System.out.println("A média é "+ media);
        System.out.println("Foram lidos "+ quantidade+ "valores.");
    }
}