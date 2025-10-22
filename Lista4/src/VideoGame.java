/*19. Modele uma classe VideoGame com nome, modelo e jogosDisponiveis. 
Crie um método listarJogos() e outro adicionarJogo(String jogo). 
*/
import java.util.ArrayList;
public class VideoGame {
    String nome;
    String modelo;
    ArrayList<String> jogosDisponiveis = new ArrayList<>();
    void listarJogos(){
        System.out.println("Jogos disponíveis: ");
        for(String jogo: jogosDisponiveis){
            System.out.println("\t"+jogo);
        }
    }
    void adicionarJogo(String novoJogo){
        jogosDisponiveis.add(novoJogo);
    }
}
