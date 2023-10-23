package model;

public class Cliente implements Associado{
    private String nome;
    private int qdeCotas;
    private double valorCota;
    private double saldo;

    public Cliente() {
    }

    public Cliente(String nome, int qdeCotas, double valorCota) {
        this.nome = nome;
        this.qdeCotas = qdeCotas;
        this.valorCota = valorCota;
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
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", qdeCotas=" + qdeCotas +
                ", valorCota=" + valorCota +
                "}\n";
    }

    @Override
    public double getSaldo() {
        return (double) this.saldo;
    }
}
