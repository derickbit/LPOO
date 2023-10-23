package model;

public class ContaPoupanca extends Conta{
    public ContaPoupanca() {
    }

    public ContaPoupanca(int numConta, double saldo) {
        super(numConta, saldo);
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "numConta=" + numConta +
                ", saldo=" + saldo +
                "}\n";
    }
}
