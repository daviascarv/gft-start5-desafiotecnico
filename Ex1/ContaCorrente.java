package TesteGFT.Ex1;

public class ContaCorrente extends Conta{
    
    public ContaCorrente(){

    }
    public ContaCorrente(int numero, String titular, double saldo){
        super(numero, titular, saldo);
    }
    @Override
    public String rendimento(){
        return
        "O rendimento da conta de " +titular+ " foi de R$" +saldo * 0.03;
    }
}
