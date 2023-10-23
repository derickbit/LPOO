package controller;

import model.Conta;

import java.util.*;

public class contaController {
    public static void main(String[] args) {
        //criando objetos da classe Conta
        Conta conta1 = new Conta();
        Conta conta2 = new Conta(2,200);
        //criando mais 3 objetos para o exercício 2
        Conta conta3 = new Conta(3,300);
        Conta conta4 = new Conta(4,400);
        Conta conta5 = new Conta(2,200);

        //imprimindo com toSring
        System.out.println("Conta 1: "+conta1);
        System.out.println("Conta 2: "+conta2+"\n");

        //colocando valores em conta 1 com setters
        conta1.setId(1);
        conta1.setSaldo(100);

        //imprimindo conta 1 com getters
        System.out.println("Conta 1: {id="+conta1.getId()+" Saldo="+conta1.getSaldo()+"}");

        //depositando na conta 1
        conta1.deposita(50);

        System.out.println();

        //sacando na conta 1
        conta1.saca(25);

        System.out.println();

        //atualizando conta1
        conta1.atualiza(30);

        System.out.println();

        //criando lista de contas
        List<Conta> contasList = new ArrayList<>();
        contasList.add(conta1);
        contasList.add(conta2);
        contasList.add(conta3);
        contasList.add(conta4);
        contasList.add(conta5);

        //printando List
        System.out.println(contasList);

        //conta de id=3
        int buscaId=3;
        for(Conta conta : contasList){
            if(conta.getId()==buscaId){
                System.out.println("Pesquisa conta com id=3:\n"+conta);
            }
        }


        //ordenando list
        contasList.sort(Comparator.comparing(Conta::getId).reversed());
        System.out.println("Lista ordenada:\n"+contasList);

        //criando map
        Map<Integer, Conta> contasMap = new HashMap<>();
        contasMap.put(conta1.getId(), conta1);
        contasMap.put(conta2.getId(), conta2);
        contasMap.put(conta3.getId(), conta3);
        contasMap.put(conta4.getId(), conta4);
        contasMap.put(conta5.getId(), conta5);

        //encontrando conta de id=3 em map
        System.out.println("Pesquisa conta com id=3:\n"+contasMap.get(3));



    }
}
