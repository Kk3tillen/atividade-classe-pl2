import java.util.ArrayList;

public class ControleFinanceiro {
    private ArrayList<Double>[] valoresDeGastos;
    private double gastoTotal;
    private double valorDisponivel;
    private double valorEconomizado;

    public ControleFinanceiro(ArrayList<Double>[] valoresDeGastos, double gastoTotal, double valorDisponivel,
            double valorEconomizado) {
        this.valoresDeGastos = valoresDeGastos;
        this.gastoTotal = gastoTotal;
        this.valorDisponivel = valorDisponivel;
        this.valorEconomizado = valorEconomizado;
    }

    private double calculaGastoTotal(ArrayList<Double>[] valores){
        this.gastoTotal = 0;
        for (int i = 0; i < valores.length; i++) {
            for (Double valor : valores[i]) {
                this.gastoTotal += valor;
            }
        }
        return this.gastoTotal;
    }
    
    public ArrayList<Double>[] getValoresDeGastos() {
        return valoresDeGastos;
    }

    public void setValoresDeGastos(ArrayList<Double>[] valoresDeGastos) {
        this.valoresDeGastos = valoresDeGastos;
    }

    public double getGastoTotal(ArrayList<Double>[] valoresDeGastos) {
        return calculaGastoTotal(this.valoresDeGastos);
    }

    public double getValorDisponivel() {
        return valorDisponivel;
    }

    public void setValorDisponivel(double valorDisponivel) {
        this.valorDisponivel = valorDisponivel;
    }

    public double getValorEconomizado() {
        return valorEconomizado;
    }

    public void setValorEconomizado(double valorEconomizado) {
        this.valorEconomizado = valorEconomizado;
    }

    
}


