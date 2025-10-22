public class Produto{
    String nome;
    float preco;
    int quantidade;
    float calcularValorTotal(){
        return preco*quantidade;
    }
}