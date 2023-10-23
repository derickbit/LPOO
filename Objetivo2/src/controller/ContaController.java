package controller;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ContaController {
    public static void main(String[] args) {

        //Crie 3 instâncias de cada classe (das possíveis de criar instâncias), insira valores válidos
        //nos atributos dessas instâncias, e imprima esses objetos;

        ContaPoupanca cp1=new ContaPoupanca(10, 1000);
        ContaPoupanca cp2=new ContaPoupanca(11, 2000);
        ContaPoupanca cp3=new ContaPoupanca(12, 3000);

        ContaCorrente cc1=new ContaCorrente(20, 1000,1,100);
        ContaCorrente cc2=new ContaCorrente(21, 2000,2,200);
        ContaCorrente cc3=new ContaCorrente(22, 3000,3,300);

        Cliente cl1=new Cliente("Naruto", 1, 100);
        Cliente cl2=new Cliente("Sasuke", 2, 200);
        Cliente cl3=new Cliente("Sakura", 3, 300);

        System.out.println("\nContas Poupança:\n" + cp1 + cp2 + cp3);
        System.out.println("\nContas Corrente:\n" + cc1 + cc2 + cc3);
        System.out.println("\nClientes:\n" + cl1 + cl2 + cl3);

        //Crie as coleções necessárias para expressar as contas registradas no sistema, bem como,
        //os associados, depois, imprima essa (s) coleção (ões);
        List<Conta> contas = new ArrayList<>();
        contas.add(cp1);
        contas.add(cp2);
        contas.add(cp3);
        contas.add(cc1);
        contas.add(cc2);
        contas.add(cc3);
        System.out.println("\nContas:\n" + contas);

        List<Associado> associados = new ArrayList<>();
        associados.add(cc1);
        associados.add(cc2);
        associados.add(cc3);
        associados.add(cl1);
        associados.add(cl2);
        associados.add(cl3);
        System.out.println("\nAssociados:\n"+associados);

       // Movimente, pelo menos, uma conta poupança, realizando as seguintes operações:
       // depósito de R$ 1.000,00; atualização monetária de 5%; saque de R$ 50,00;
        System.out.println("\nConta Poupança 1 antes das operações:\n" + cp1);
        cp1.deposita(1000.00);
        cp1.atualiza(5);
        cp1.saca(50.00);
        System.out.println("\nConta Poupança 1 depois das operações:\n" + cp1);

        //Movimente, pelo menos, uma conta corrente, realizando as seguintes operações: depósito
        //R$ 500,00; saque de R$ 400,00;
        System.out.println("\nConta Corrente 1 antes das operações:\n" + cc1);
        cc1.deposita(500.00);
        cc1.saca(400.00);
        System.out.println("\nConta Corrente 1 depois das operações:\n" + cc1);

        //Faça com que cada associado tenha as seguintes quantidade de cotas, nessa ordem: 100,
        //400, 600, 300, 600, 600, e imprima a (s) coleção (ões);
        cc1.setqdeCotas(100);
        cc2.setqdeCotas(400);
        cc3.setqdeCotas(600);
        cl1.setqdeCotas(300);
        cl2.setqdeCotas(600);
        cl3.setqdeCotas(600);
        System.out.println("\nAssociados:\n"+associados);

        //A partir da (s) coleção (ões), imprima todos os associados, ordenados pelo critério de
        //número de cotas, em ordem decrescente. E faça o programa calcular e imprimir os
        //associados com o maior número de cotas no sistema
        System.out.println("\nAssociado com maior numero de cotas:\n");
        Associado associadoMaisQdeCotas = Collections.max(associados, Comparator.comparing(Associado::getqdeCotas));
        associados.forEach(f->{ if(f.getqdeCotas() >= associadoMaisQdeCotas.getqdeCotas()){
            System.out.println(f);}
        });

        //. A partir da (s) coleção (ões), imprima todas as contas cadastradas no sistema, ordenadas
        //pelo critério saldo, em ordem decrescente.
        contas.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.println("Contas ordenadas pelo saldo:\n" + contas);

        //E, imprima todos associados que sejam  Associado e possua conta cadastradas no sistema, em qualquer ordem.
        System.out.println("\nClientes:\n");
        associados.forEach(i->{
            if(i instanceof Cliente){
                System.out.println(i);
            }});

        //Também faça o programa imprimir a lista de contas com maior saldo bancário.
        System.out.println("\nContas com maior saldo:\n");
        Conta contaMaiorSaldo = Collections.max(contas, Comparator.comparing(Conta::getSaldo));
        associados.forEach(f->{ if(f.getSaldo() >= contaMaiorSaldo.getSaldo()){
            System.out.println(f);}
        });
    }
}