package model;

public class Peixe extends Animal{
    double z=0;

    public Peixe() {
    }

    public Peixe(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public void desenhar() {
        System.out.println("Função para desenhar peixe");
    }

    @Override
    public String toString() {
        return "Peixe{" +
                ", x=" + x +
                ", y=" + y +
                ", z=" + z +
                "}\n";
    }


    public void mover(double x, double y,double z) {
        super.mover(x,y);
        this.z=z;
    }
}
