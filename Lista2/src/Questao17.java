import java.util.Scanner;
public class Questao17 {
    public static void main(String[] args) throws Exception {
/*   17. Leia três lados de um triângulo e determine se ele é:
        • Equilátero (3 lados iguais),
        • Isósceles (2 lados iguais),
        • Escaleno (3 lados diferentes).      */
              
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o 1º lado do triângulo: ");
        int a = input.nextInt(); 
        System.out.print("Digite o 2º lado do triângulo: ");    
        int b = input.nextInt();
        System.out.print("Digite o 3º lado do triângulo: ");
        int c = input.nextInt();
        if ((a==b)&&(a==c)) 
            System.out.println("É um triangulo equilátero!");
        else if ((a==b)||(b==c)||(a==c)) 
            System.out.println("É um triangulo isósceles!");
        else 
            System.out.println("Se for um triangulo é escaleno!");
        input.close();
    }
}