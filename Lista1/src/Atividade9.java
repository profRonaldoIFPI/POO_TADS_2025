import java.util.Scanner;
public class Atividade9 {
    /*
        Área do Trapézio: Calcular e apresentar a área de um trapézio de acordo com a
        fórmula:    Trapézio = ((Base Maior + Base Menor) * Altura) / 2.
    */
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a base maior: ");
        float bMaior = entrada.nextFloat();
        System.out.print("Informe a base menor: ");
        float bMenor = entrada.nextFloat();
        System.out.print("Informe a altura: ");
        float altura = entrada.nextFloat();
        float area = ((bMaior + bMenor)*altura)/2;
        System.out.printf("A área do trapézio é de %.2f cm²", area);
        entrada.close(); //fecha o scanner*
    }
}