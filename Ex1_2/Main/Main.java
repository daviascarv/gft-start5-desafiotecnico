package TesteGFT.Ex1_2.Main;
import TesteGFT.Ex1_2.Conta;
import TesteGFT.Ex1_2.ContaCorrente;
import TesteGFT.Ex1_2.ContaPoupança;
import TesteGFT.Ex1_2.Imposto;

public class Main {
    public static void main(String[] args) {
        
        Conta cc = new ContaCorrente(1234, "Davi Augusto", 2000.00);
        Conta cp = new ContaPoupança(4321, "João Augusto", 1500.00);
        
        System.out.println(cc.rendimento());
        System.out.println(cp.rendimento());
        
        
    }
    
}
