package model;

public class ContaCorrente extends Conta implements Associado{
    private double valorCota;
    private int qdeCotas;

    public ContaCorrente() {
    }

    public ContaCorrente(int numConta, double saldo, int qdeCotas, double valorCota) {
        super(numConta, saldo);
        this.qdeCotas=qdeCotas;
        this.valorCota=valorCota;
    }

    @Override
    public double lucros(int qdeCotas, double valorCota) {
        this.qdeCotas=qdeCotas;
        this.valorCota=valorCota;
        return 0;
    }

    @Override
    public int getqdeCotas() {
        return this.qdeCotas;
    }

    @Override
    public void setqdeCotas(int qdeCotas) {
        this.qdeCotas=qdeCotas;
    }

    @Override
    public double getvalorCota() {
        return this.qdeCotas;
    }

    @Override
    public void setvalorCota(double valorCota) {
        this.valorCota=valorCota;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "numConta=" + numConta +
                ", saldo=" + saldo +
                ", valorCota=" + valorCota +
                ", qdeCotas=" + qdeCotas +
                "}\n";
    }

    @Override
    public double getSaldo() {
        return (double) this.saldo;
    }
}
