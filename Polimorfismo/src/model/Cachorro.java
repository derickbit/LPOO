package model;

public class Cachorro extends Animal {
    public Cachorro() {
        super();
    }

    public Cachorro(double x, double y) {
        super(x, y);
    }

    @Override
    public void desenhar() {
        System.out.println("Função para desenhar um cachorro");
    }

    @Override
    public void mover(double x, double y) {
        this.x=x;
        this.y=y;

    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "x=" + x +
                ", y=" + y +
                "}\n";
    }
}
