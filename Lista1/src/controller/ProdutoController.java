package controller;

import model.Produto;

import java.util.*;

public class ProdutoController {
    public static void main(String[] args) {

        Produto produto1= new Produto(); //construtor padrão
        Produto produto2 = new Produto(2,"Teclado","Teclado sem fio - USB",100.00,200); //contrutor parametrizado

        System.out.println("Impressão dos produtosList com toString: \n");
        System.out.println(produto1);
        System.out.println(produto2);

        System.out.println("\nAlterando os valores de produto1 com setters\n");

        produto1.setId(1);
        produto1.setNome("Mouse");
        produto1.setDescricao("Mouse sem fio USB");
        produto1.setValor(80.00);
        produto1.setEstoque(300);

        System.out.println("Impressão do produto 1 com Getters");
        System.out.println("ID: "+produto1.getId());
        System.out.println("Nome:"+produto1.getNome());
        System.out.println("Descricao: "+produto1.getDescricao());
        System.out.println("Valor: "+produto1.getValor());
        System.out.println("Estoque:"+produto1.getEstoque());


        //Exercício 2
        //criando mais 3 objetos para fazer o exercício 2

        Produto produto3 = new Produto(3,"Memória", "Memória RAM 8Gb",300,100);
        Produto produto4 = new Produto(4,"Placa de Video", "Placa de video GTx1050TI",3000,50);
        Produto produto5 = new Produto(4,"Placa de Video", "Placa de video GTx1050TI",3000,50);//produtos iguais


        //criando lista tipo List
        List<Produto> produtosList = new ArrayList<>();
        produtosList.add(produto1);
        produtosList.add(produto2);
        produtosList.add(produto3);
        produtosList.add(produto4);
        produtosList.add(produto5);
        System.out.println("Coleção do tipo List");
        System.out.println(produtosList+"\n"); //printa dois objetos iguais

        //Procurando produto de id=3 (exemplo prof)
        Produto pesquisa = produtosList.stream().filter(c->c.getId() == 3).findAny().orElse(null);
        System.out.println("Produto pesquisado (id=3) (conforme exemplo):\n" + pesquisa);

        //procurando produto de id=3 (conforme sei fazer)
        int buscaId=3;
        for(Produto produto : produtosList){
            if(produto.getId()==buscaId){
                System.out.println("Produto pesquisado (id=3) (conforme sei fazer):\n"+produto);
                break;
            }
        }

        //ordenando list - descrescente
        produtosList.sort(Comparator.comparing(Produto::getId).reversed());
        System.out.println("\nColeção tipo List ordenada de forma decrescente: "+produtosList);

        //criando coleção tipo Map
        Map<Integer, Produto> produtosMap = new HashMap();
        produtosMap.put(produto1.getId(), produto1);
        produtosMap.put(produto2.getId(), produto2);
        produtosMap.put(produto3.getId(), produto3);
        produtosMap.put(produto4.getId(), produto4);
        produtosMap.put(produto5.getId(), produto5);
        System.out.println("Coleção tipo Map"+produtosMap+"\n");
        //imprimiu sem o produto 5 pois não aceita dois objetos iguais
        //Map não permite ordenação

        //procurando produto em map id=3
        System.out.println("Produto pesquisado id=3\n"+produtosMap.get(3));
    }}
