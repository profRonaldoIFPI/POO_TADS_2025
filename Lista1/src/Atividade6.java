import java.util.Scanner;
public class Atividade6 {
/*  
    Volume da Caixa Retangular: Efetuar o cálculo para apresentar o volume de uma caixa retangular, por meio da fórmula: Volume = Comprimento * Largura * Altura
*/    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o comprimento(m): ");
        float comprimento = input.nextFloat();
        System.out.print("Digite a largura(m): ");
        float largura = input.nextFloat();
        System.out.print("Digite a altura(m): ");
        float altura = input.nextFloat();
        float volume = comprimento * largura * altura;
        System.out.println("O volume da caixa é "+ volume+" m³");    
        input.close();      
    }
}
