package TesteGFT.Ex1_2;

public class ContaCorrente extends Conta implements Imposto{
    
    public ContaCorrente(){

    }
    public ContaCorrente(int numero, String titular, double saldo){
        super(numero, titular, saldo);
    }
    @Override
    public String rendimento(){
        return
        "O rendimento da conta de " +getTitular()+ " foi de R$" +getSaldo() * 0.03;
    }
    @Override
    public String calcularImposto() {
        // TODO Auto-generated method stub
        return rendimento();
    }
}
