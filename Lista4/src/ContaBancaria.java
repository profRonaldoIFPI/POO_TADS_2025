public class ContaBancaria {
    int numeroConta; 
    double saldo = 0; 
    void depositar(double valorDeposito){
        saldo = saldo + valorDeposito;
        imprimirSaldo();
    }
    void sacar(double valorSaque){
        if(valorSaque<=saldo){
            saldo = saldo - valorSaque;
        } else {
            System.out.println("Saldo insuficiente.");
        }
        imprimirSaldo();
    }
    void imprimirSaldo(){
        System.out.println("Saldo: "+saldo);
    }
}//fim da classe