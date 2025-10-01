public class App {
    public static void main(String[] args){
//1 e 2
        // Pessoa p1 = new Pessoa();
        // p1.nome = "Vinícius";
        // p1.idade = 22;
        // p1.apresentar();

        // Pessoa p2 = new Pessoa();
        // p2.nome = "Isaac";
        // p2.idade = 19;
        // p2.apresentar();

        // Pessoa p3 = new Pessoa();
        // p3.apresentar();
//3 e 4
        Carro c1 = new Carro();
        c1.marca = "volkswagen";
        c1.modelo = "fusca";
        c1.ano = 1994;

        Carro c2 = new Carro();
        c2.marca = "chevrolet";
        c2.modelo = "maverik";
        c2.ano = 2025;

        c1.exibirInformacoes();
        c2.exibirInformacoes();
    }
}