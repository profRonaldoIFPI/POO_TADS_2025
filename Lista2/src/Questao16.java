import java.util.Scanner;
public class Questao16 {
    public static void main(String[] args) throws Exception {
/*
    16. Leia o valor de uma compra. Se for maior que 100, aplique 10% de desconto; caso contrário, não aplique desconto. Mostre o valor final. 
*/      
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o valor da compra: ");
        float valorCompra = input.nextFloat(); 
        valorCompra = valorCompra>100 ? valorCompra-valorCompra*0.1f : valorCompra;
        System.out.println("O valor final é R$ "+ valorCompra);        
    }
}

