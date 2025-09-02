import java.util.Scanner;
public class Atividade1 {
/*  
    Cálculo de Média: Escreva um programa que leia quatro notas de um aluno, calcule a média e mostre o resultado.
    media = (nota1 + nota2 + nota3 + nota4) / 4
*/
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float media = 0; 
        for(int i=1; i<=4; i++){
            System.out.print("Digite a "+i+"ª nota: ");
            media += entrada.nextFloat(); // media = media + entrada.nextFloat(); 
        }
        media /=4;  //media = media / 4;
        System.out.print("A media eh: "+media);
        entrada.close(); //fecha o scanner*
    }
}
/* 
    *entrada.close(); é importante para liberar os recursos do sistema associados ao objeto Scanner.
    Em programas maiores ou que fazem uso intensivo de recursos, fechar o Scanner ajuda a evitar vazamentos de memória e outros problemas relacionados a recursos.
 */