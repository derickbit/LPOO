package model;

public abstract class Conta {
    protected double saldo;
    protected double valor;
    protected double taxa;
    protected int numConta;


    public Conta() {
    }

    public Conta(int numConta, double saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
    }
    public void deposita(double valor){
        this.saldo += valor;
        System.out.println("Depositou");
    };

    public void saca(double valor){
        this.saldo -= valor;
        System.out.println("Sacou");
    }

    public void atualiza(double taxa){
        this.saldo = this.valor +(this.valor * taxa/100);
        System.out.println("Atualizou");
    }

    public double getSaldo() {
        return (double) this.saldo;
    }


    public abstract String toString();
}
