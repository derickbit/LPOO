package controllerFuncionario;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ControllerFuncionario {
    public static void main(String[] args) {

        //Crie seis instâncias de cada classe do diagrama (das possíveis) com valores válidos
        //para os seus atributos. Depois, utilizando o método toString(), imprima estes objetos
        //e verifique o resultado.

        Desenvolvedor d1 = new Desenvolvedor("Finn", 2000);
        Desenvolvedor d2 = new Desenvolvedor("Jake", 3500);
        Desenvolvedor d3 = new Desenvolvedor("Bmo", 2000);
        Desenvolvedor d4 = new Desenvolvedor("Fiona", 2000);
        Desenvolvedor d5 = new Desenvolvedor("Cake", 2000);
        Desenvolvedor d6 = new Desenvolvedor("Jermaine", 2000);

        Gerente g1 = new Gerente("Simon", 4000, "ADVTIME", 800);
        Gerente g2 = new Gerente("Marceline", 4000, "ADVTIME", 800);
        Gerente g3 = new Gerente("Bonnie", 4000, "ADVTIME", 800);
        Gerente g4 = new Gerente("Billy", 4000, "ADVTIME", 900);
        Gerente g5 = new Gerente("Simon", 4000, "ADVTIME", 800);
        Gerente g6 = new Gerente("Minerva", 4000, "ADVTIME", 800);

        Cliente c1 = new Cliente("Prismo", "Adv", "ADVTIME", 500);
        Cliente c2 = new Cliente("Lich", "Adv", "ADVTIME", 500);
        Cliente c3 = new Cliente("Golb", "Adv", "ADVTIME", 500);
        Cliente c4 = new Cliente("Orgalorg", "Adv", "ADVTIME", 500);
        Cliente c5 = new Cliente("Magic", "Man", "ADVTIME", 600);
        Cliente c6 = new Cliente("Maja", "Adv", "ADVTIME", 500);

        System.out.println("\nDesenvolvedores:\n"+d1+"\n"+d2+"\n"+d3+"\n"+d4+"\n"+d5+"\n"+d6);
        System.out.println("\nGerentes:\n"+g1+"\n"+g2+"\n"+g3+"\n"+g4+"\n"+g5+"\n"+g6);
        System.out.println("\nClientes:\n"+c1+"\n"+c2+"\n"+c3+"\n"+c4+"\n"+c5+"\n"+c6);


        //Insira esses doze objetos em estruturas de dados do tipo coleção e imprima esta (s)
        //coleção (ões);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(d1);
        funcionarios.add(d2);
        funcionarios.add(d3);
        funcionarios.add(d4);
        funcionarios.add(d5);
        funcionarios.add(d6);
        funcionarios.add(g1);
        funcionarios.add(g2);
        funcionarios.add(g3);
        funcionarios.add(g4);
        funcionarios.add(g5);
        funcionarios.add(g6);

        List<Investidor> investidores = new ArrayList<>();
        investidores.add(c1);
        investidores.add(c2);
        investidores.add(c3);
        investidores.add(c4);
        investidores.add(c5);
        investidores.add(c6);
        investidores.add(g1);
        investidores.add(g2);
        investidores.add(g3);
        investidores.add(g4);
        investidores.add(g5);
        investidores.add(g6);

        System.out.println("\nLista de funcionarios:\n" + funcionarios);
        System.out.println("\nLista de investidores:\n" + investidores);


        //A partir dessa (as) coleção (ões) liste todos os funcionários, todos os clientes, bem
        //como, todos os investidores, ordenando-os pelo salário, ordem decrescente, e pela
        //quantidade de ações, ordem decrescente;

        funcionarios.sort(Comparator.comparing(Funcionario::getSalario).reversed());
        investidores.sort(Comparator.comparing(Investidor::getQuantidade).reversed());

        System.out.println("\nFuncionarios ordenados:\n"+funcionarios);
        System.out.println("\nInvestidores ordenados:\n" + investidores);
        System.out.println("\nClientes da empresa:\n");
        investidores.forEach(i->{ if(i instanceof Cliente) {
            System.out.println(i);
        }});

        //A partir dessa (as) coleção (ões), faça a aplicação imprimir o funcionário com o
        //maior salário e o investidor com o maior número de ações.

        System.out.println("\nFuncionario com salario maior:\n");
        Funcionario funcionarioMaiorSalario = Collections.max(funcionarios, Comparator.comparing(Funcionario::getSalario));
        funcionarios.forEach(f->{ if(f.getSalario() >= funcionarioMaiorSalario.getSalario()){
            System.out.println(f);}
        });

        System.out.println("\nInvestidor com maior numero de ações:\n");
        Investidor investMaisAcoes = Collections.max(investidores, Comparator.comparing(Investidor::getQuantidade));
        investidores.forEach(i->{ if(i.getQuantidade() >= investMaisAcoes.getQuantidade()){
            System.out.println(i);}
        });


    }
}