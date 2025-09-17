import java.util.Scanner;
public class Atividade8 {
    /*
        Conversão de Temperatura: Ler uma temperatura em graus Fahrenheit e apresentá-la
        convertida em graus Celsius.
        C = (F - 32) * (5/9).
    */
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a temperatura em °F: ");
        float fahrenheit = entrada.nextFloat();
        float celsius = (fahrenheit-32) * (5.0f/9);
        System.out.printf("%.2f °F = %.2f °C", fahrenheit, celsius);
        entrada.close(); //fecha o scanner*
    }
}