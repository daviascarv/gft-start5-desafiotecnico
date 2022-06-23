package TesteGFT.Ex1_2;

public class ContaPoupança extends Conta implements Imposto{
    
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
    @Override
    public String calcularImposto() {
        // TODO Auto-generated method stub
        return rendimento();
    }
}
