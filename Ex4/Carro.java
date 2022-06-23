package TesteGFT.Ex4;

public class Carro {
    private String modelo;
    private String marca;
    private String tipoDeCombustivel;

    public Carro(){

    }
    public Carro(String modelo, String marca, String tipodecombusString){
        this.modelo = modelo;
        this.marca = marca;
        this.tipoDeCombustivel = tipodecombusString;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }
    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }
}
