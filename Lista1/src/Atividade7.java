import java.util.Scanner;
public class Atividade7 {
    /*
        Prestação em Atraso: Efetuar o cálculo para apresentar o valor de uma prestação em
        atraso, utilizando a fórmula:
        Prestação = Valor + (Valor * (Taxa / 100) * Tempo).
    */
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o valor da prestação: ");
        float valor = entrada.nextFloat();
        System.out.print("Informe a taxa de juros (ao dia): ");
        float taxa = entrada.nextFloat();
        System.out.print("Informe quantos dias de vencimento: ");
        int tempo = entrada.nextInt();
        float prestacao = valor + (valor*(taxa/100)*tempo);
        System.out.printf("Valor com juros R$ %.2f.", prestacao);
        entrada.close(); //fecha o scanner*
    }
}