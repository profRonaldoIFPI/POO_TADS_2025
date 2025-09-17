import java.util.Scanner;
public class Questao10 {
    public static void main(String[] args) throws Exception {
        /*
         10. Leia um número de 1 a 7 e informe o dia da semana correspondente.
        */
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 7: ");
        int dia = input.nextInt(); 
        switch(dia){
            case 1: System.out.println("Domingo");       break; 
            case 2: System.out.println("Segunda-feira"); break;    
            case 3: System.out.println("Terça-feira");   break;    
            case 4: System.out.println("Quarta-feira");  break;    
            case 5: System.out.println("Quinta-feira");  break;    
            case 6: System.out.println("Sexta-feira");   break;    
            case 7: System.out.println("Sabado");        break;
            default: System.out.println("Número inválido!");   
        }
    }
}

