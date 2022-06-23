package TesteGFT.Ex1;

public class Conta {
    public int numero;
    public String titular;
    public double saldo;

    public Conta(){

    }
    public Conta(int numero, String titular, double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    public String rendimento(){
        return 
            "O rendimento da conta de " +titular+ " foi de R$" +saldo;
    }
}
