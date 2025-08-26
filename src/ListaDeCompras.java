import java.util.ArrayList;

public class ListaDeCompras {
    private double valorDaLista;
    private ArrayList[] itenList;

    public ListaDeCompras(){

    }
    public ListaDeCompras(double valorDaLista, ArrayList[] itens){
        this.valorDaLista = valorDaLista;
        this.itenList = itens;
    }
    public double getValorDaLista() {
        return valorDaLista;
    }
    public void setValorDaLista(double valorDaLista) {
        this.valorDaLista = valorDaLista;
    }
    public ArrayList[] getItenList() {
        return itenList;
    }
    public void setItenList(ArrayList[] itenList) {
        this.itenList = itenList;
    }

    
}
