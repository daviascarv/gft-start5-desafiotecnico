package TesteGFT.Ex1;

public class ContaPoupança extends Conta{
    
    public ContaPoupança(){

    }
    public ContaPoupança(int numero, String titular, double saldo){
        super(numero, titular, saldo);
    }

    @Override
    public String rendimento(){
        return
        "O rendimento da conta de " +getTitular()+ " foi de R$" +getSaldo() * 0.05;
    }
}
