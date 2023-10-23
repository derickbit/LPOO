package model;

public class DesenvolvedorJunior extends Desenvolvedor{
    public DesenvolvedorJunior(String nome, double salario) {
        super(nome, salario);
    }
    @Override
    public double getBonus() {
        return getSalario()*0.5;
    }
}
