import java.math.BigInteger;
public class Questao11 {
    public static void main(String[] args) {
        BigInteger graos = BigInteger.valueOf(1);
        BigInteger somaGraos = BigInteger.valueOf(0);

        for(int casa=1; casa<=64 ; casa++){
            System.out.println("Casa do tabuleiro: "+casa+" nº de grãos: "+graos);
            somaGraos = somaGraos.add(graos);
            System.out.println("Total de grãos: "+ somaGraos);
            graos = graos.multiply(BigInteger.valueOf(2));
        }
    }
}
