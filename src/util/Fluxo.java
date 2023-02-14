package util;

public class Fluxo {
    private double valorConta = 0;

    public double getValorConta() {
        return valorConta;
    }
    public Fluxo() {
    }
    public void addValorC(double entradaConta){
    this.valorConta +=entradaConta;
    }
    public void removeValorC(double saidaConta){
    this.valorConta -= saidaConta+5;
    }

}
