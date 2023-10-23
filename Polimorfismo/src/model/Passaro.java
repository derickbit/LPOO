package model;

public class Passaro extends Animal {
    double z=0;

    public Passaro() {
    }

    public Passaro(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public void desenhar() {
        System.out.println("Função para desenhar passaro");
    }

    @Override
    public String toString() {
        return "Passaro{" +
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
