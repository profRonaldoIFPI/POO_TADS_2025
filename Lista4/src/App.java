public class App {
    public static void main(String[] args){
        //19
        VideoGame vg = new VideoGame();
        vg.nome = "SuperNintendo";
        vg.modelo = "SNES";
        vg.adicionarJogo("Street Figther II");
        vg.adicionarJogo("Metal Gear");
        vg.adicionarJogo("Killer Instinct");
        vg.adicionarJogo("Motal Kombat");
        vg.adicionarJogo("F-Zero");
        vg.adicionarJogo("Super Mario Allstars");
        vg.adicionarJogo("Battletoads");
        vg.adicionarJogo("Rock 'n' roll racing");
        vg.listarJogos();
    }
}

/*
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
        // Carro c1 = new Carro();
        // c1.marca = "volkswagen";
        // c1.modelo = "fusca";
        // c1.ano = 1994;

        // Carro c2 = new Carro();
        // c2.marca = "chevrolet";
        // c2.modelo = "maverik";
        // c2.ano = 2025;

        // c1.exibirInformacoes();
        // c2.exibirInformacoes();
// 5 e 6
        // Produto p1 = new Produto();
        // p1.nome = "Notebook";
        // p1.preco = 5000.0f;
        // p1.quantidade = 5;
        // System.out.println(p1.calcularValorTotal());
//13 e 14
        // ContaBancaria c = new ContaBancaria();
        // c.depositar(100);
        // c.sacar(150);
        // c.sacar(100);
 */