package TesteGFT.Ex1;

public class Conta {
    private int numero;
    private String titular;
    private double saldo;

    public Conta(){

    }
    public Conta(int numero, String titular, double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public String rendimento(){
        return 
            "O rendimento da conta de " +titular+ " foi de R$" +saldo;
    }
}
