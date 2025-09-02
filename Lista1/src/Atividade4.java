import java.util.Scanner;
public class Atividade4 {
/*  
    Cálculo de IMC: Escreva um programa que leia o peso e a altura de uma pessoa,calcule o Índice de Massa Corporal (IMC) e mostre o resultado.
    IMC = Peso/Altura²
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o peso: ");
        float peso = input.nextFloat();
        System.out.print("Digite a altura: ");
        float altura = input.nextFloat();
        float imc = peso/(altura*altura);
        System.out.println("O seu IMC é "+imc);    
        input.close();      
    }
}
