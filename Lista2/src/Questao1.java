import java.util.Scanner;
public class Questao1{
    public static void main(String[] args) throws Exception {
/* 
    1. Leia a idade de uma pessoa e verifique se ela é maior de idade (18 anos ou mais).
*/  
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a idade da pessoa: ");
        int idade = input.nextInt();
        if (idade>=18){
            System.out.println("Maior de idade!");
        }

        String nome = "Ronaldo";
        nome.length();

    }
}