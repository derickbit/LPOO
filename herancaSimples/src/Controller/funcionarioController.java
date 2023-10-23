package Controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class funcionarioController {

    public static void main(String[] args) {

        //criando gerentes
        Gerente g1 = new Gerente("Gilson",6500.00);
        Gerente g2 = new GerenteDesenvolvimento("Claudio", 4500.00);

        //criando Devs Senior
        DesenvolvedorSenior d1 = new DesenvolvedorSenior("Eduardo",3500.00);
        DesenvolvedorSenior d2 = new DesenvolvedorSenior("Victor",3500.00);
        DesenvolvedorSenior d3 = new DesenvolvedorSenior("Gerson",3500.00);
        DesenvolvedorSenior d4 = new DesenvolvedorSenior("Lisiane",3500.00);
        DesenvolvedorSenior d5 = new DesenvolvedorSenior("Cleber",3500.00);
        DesenvolvedorSenior d6 = new DesenvolvedorSenior("Jorge",3500.00);

        //criando Devs plenos
        DesenvolvedorPleno d7 = new DesenvolvedorPleno("Arthur", 2500.00);
        DesenvolvedorPleno d8 = new DesenvolvedorPleno("Carina", 2500.00);
        DesenvolvedorPleno d9 = new DesenvolvedorPleno("Dante", 2500.00);
        DesenvolvedorPleno d10 = new DesenvolvedorPleno("Rubens", 2500.00);
        DesenvolvedorPleno d11 = new DesenvolvedorPleno("Balu", 2500.00);
        DesenvolvedorPleno d12 = new DesenvolvedorPleno("Verissimo", 2500.00);

        //criando devs junior
        DesenvolvedorJunior d13 = new DesenvolvedorJunior("Thiago", 1800.00);
        DesenvolvedorJunior d14 = new DesenvolvedorJunior("Liz", 1800.00);
        DesenvolvedorJunior d15 = new DesenvolvedorJunior("Alex", 1800.00);
        DesenvolvedorJunior d16 = new DesenvolvedorJunior("Cristopher", 1800.00);
        DesenvolvedorJunior d17 = new DesenvolvedorJunior("Joui", 1800.00);
        DesenvolvedorJunior d18 = new DesenvolvedorJunior("César", 1800.00);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(g1);
        funcionarios.add(g2);
        funcionarios.add(d1);
        funcionarios.add(d2);
        funcionarios.add(d3);
        funcionarios.add(d4);
        funcionarios.add(d5);
        funcionarios.add(d6);
        funcionarios.add(d7);
        funcionarios.add(d8);
        funcionarios.add(d9);
        funcionarios.add(d10);
        funcionarios.add(d11);
        funcionarios.add(d12);
        funcionarios.add(d13);
        funcionarios.add(d14);
        funcionarios.add(d15);
        funcionarios.add(d16);
        funcionarios.add(d17);
        funcionarios.add(d18);
        System.out.println("Funcionarios da empresa:\n" + funcionarios);

        //calculo da folha salarial com bonus
        double folha_total = 0.0;
        for (Funcionario funcionario : funcionarios){
            folha_total +=funcionario.getSalario()+funcionario.getBonus();
        }
        System.out.println("Folha salarial total da empresa (Salários e Bonus)="+folha_total);

        //calculo da folha salarial sem bonus
        double folha_bruta = 0.0;
        for (Funcionario funcionario : funcionarios){
            folha_bruta +=funcionario.getSalario();
        }
        System.out.println("Folha salarial total da empresa sem bonus="+folha_bruta);

        //Calculo da folha reajustada em 5%
        folha_total = 0.0;
        for(Funcionario funcionario : funcionarios)
            folha_total += funcionario.getSalario() + (funcionario.getSalario() * 0.05) + funcionario.getBonus();
        System.out.println("Folha salarial total da empresa (Salários e Bonus) reajustada em 5%="+folha_total);


    }
}