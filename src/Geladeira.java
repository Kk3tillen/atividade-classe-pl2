public class Geladeira{
    private String marca;
    private int tamanho;
    private int litros;
    private int qntPortas;
    private double gastoEnergetico;

    public Geladeira(){

    }

    public Geladeira(String marca, int tamanho, int litros, int qntPortas, double gastoEnergetico) {
        this.marca = marca;
        this.tamanho = tamanho;
        this.litros = litros;
        this.qntPortas = qntPortas;
        this.gastoEnergetico = gastoEnergetico;
    }

    public void abrir(){
        System.out.println("Geladeira aberta");
    }
    public void fechar(){
        System.out.println("Geladeira fechada");
    }

    public boolean estaCheia (){
        return true;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    public int getQntPortas() {
        return qntPortas;
    }

    public void setQntPortas(int qntPortas) {
        this.qntPortas = qntPortas;
    }

    public double getGastoEnergetico() {
        return gastoEnergetico;
    }

    public void setGastoEnergetico(double gastoEnergetico) {
        this.gastoEnergetico = gastoEnergetico;
    }
    
}