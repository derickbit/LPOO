package model;

public interface Associado {
    public double lucros(int qdeCotas, double valorCota);

    int getqdeCotas();
    void setqdeCotas(int qdeCotas);

    double getvalorCota();
    void setvalorCota(double valorCota);
    public abstract double getSaldo();

}
