import java.util.Scanner;
public class Atividade10 {
/*
    Cálculo de Litros de Combustível: Efetuar o cálculo da quantidade de litros de combustível gastos em uma viagem, utilizando-se de um automóvel que faz 16 Km por litro. Para obter o cálculo, utilize as fórmulas: 
    distancia = tempo * velocidade 
    combustivelUsado = distancia / 16
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o tempo gasto na viagem(h): ");
        float tempo = input.nextFloat();
        System.out.print("Digite a velocidade média(km/h): ");
        float velocidade = input.nextFloat();
        float distancia = tempo * velocidade;
        float combustivelUsado = distancia / 16;
        System.out.println("Foram usados "+combustivelUsado+" l de combustível.");
        input.close();      
    }
}
