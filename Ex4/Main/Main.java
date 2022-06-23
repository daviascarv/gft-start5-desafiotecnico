package TesteGFT.Ex4.Main;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o modelo, marca e tipo de combustível dos 5 carros.");
        for(int i = 0; i < 5; i++){
            System.out.println("Carro na posicao " +(i+1));
            System.out.println("Marca: ");
            String marca = sc.nextLine();
            System.out.println("Modelo: ");
            String modelo = sc.nextLine();
            System.out.println("Tipo de combustível: ");
            String tipoDeCombustível = sc.nextLine();
        }
    }
    
}
