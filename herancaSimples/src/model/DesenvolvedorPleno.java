package model;

public class DesenvolvedorPleno extends Desenvolvedor{
    public DesenvolvedorPleno(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return getSalario()*0.5;
    }
}
