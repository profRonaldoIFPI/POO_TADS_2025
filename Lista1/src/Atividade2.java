import java.util.Scanner;
public class Atividade2 {
    /*
        Área do Triângulo: Crie um programa que leia a base e a altura de um triângulo,
        calcule a área e mostre o resultado.
        Área = (Base * Altura) / 2
    */
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a base do triangulo: ");
        float base = entrada.nextFloat();
        System.out.print("Informe a altura do triangulo: ");
        float altura = entrada.nextFloat();
        float area = (base * altura)/2;
        System.out.println("A área é de "+area+" cm².");
        entrada.close(); //fecha o scanner*
    }
}