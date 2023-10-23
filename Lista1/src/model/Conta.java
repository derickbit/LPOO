package model;

public class Conta {
    private int id;
    private double saldo;

    //construtores
    public Conta(){
    }
    public Conta(int id, double saldo){
        this.id = id;
        this.saldo=saldo;
    }
    //getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //getId solicitado pelo exercicio
    public double getSaldo() {
        return saldo;
    }

    //outras operações solicitadas pelo exercício
    public void deposita(double valor){
        this.saldo+=valor;
        System.out.println("Depósito realizado\nSaldo Atual="+this.saldo);
    }
    public void saca(double valor) {
        double valorTemporario = this.saldo - valor;
        if (valorTemporario < 0) {
            System.out.println("Saldo insuficiente\nSaldo atual= " + this.saldo);
            return;
        }
        this.saldo -= valor;
        System.out.println("Saque ralizado\nSaldo atual= " + this.saldo);
    }
    public void atualiza(double taxa){
        this.saldo += this.saldo * (taxa/100);
        System.out.println("Valor atualizado de acordo com a Taxa de "+taxa+"%\nSaldo atual= "+this.saldo);
        }

    @Override
    public String toString() {
        return "Conta{" +
                "id=" + id +
                ", saldo=" + saldo +
                '}';
    }
}
