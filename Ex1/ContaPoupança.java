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
        "O rendimento da conta de " +titular+ " foi de R$" +saldo * 0.05;
    }
}
