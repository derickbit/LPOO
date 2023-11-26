package controller;

import model.*;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class controllerVenda {
    public static void main(String[] args) {

        //Faça a aplicação realizar duas vendas de dois produtos. Salve as vendas em uma
        //coleção. Cada venda deve registrar: 1) os itens vendidos, os produtos de cada um desses
        //itens, o total do item, bem como o pedido e o total do pedido; 2) o vendedor que fez a venda;
        //3) Baixar o estoque de cada produto vendido. Imprima a coleção com as duas vendas
        //realizadas (o relatório de vendas). Imprima o estoque de produtos após as vendas.


        Fornecedor f1 = new Fornecedor(1111, "AAAA", "Mercadao");
        Fornecedor f2 = new Fornecedor(2222, "BBBB", "Atacadão");

        Vendedor v1 = new Vendedor(111, "Jorge", "Av. Brasil", "Guatemala", "96969696", "Pelotas", "RS", "ABC");
        Vendedor v2 = new Vendedor(222, "Maicon", "Av. Argentina", "Guacamole", "96040969", "Pelotas", "RS", "FEG");

        Produto pr1 = new Produto(1, "Arroz", 100, 5.00, f1);
        Produto pr2 = new Produto(2, "Feijao", 100, 4.00, f2);

        Item i1 = new Item(11, 1.0, 20);
        Item i2 = new Item(22, 1.5, 30);

        Pedido pe1 = new Pedido(1, LocalDate.of(2023, 3, 16), 20.0, "atendido", v1);
        Pedido pe2 = new Pedido(2, LocalDate.of(2023, 3, 17), 20.0, "atendido", v2);

        if (pr1.getPreco() > 0 && pr2.getPreco() > 0) {
            System.out.println("Vendas:\n");
            List<Pedido> pedidos = new ArrayList<>();
            pedidos.add(pe1);
            pedidos.add(pe2);
            System.out.println(pedidos);

            pe1.getItens().add(i1);
            pe2.getItens().add(i2);
            v1.getpedidos().add(pe1);
            v2.getpedidos().add(pe2);

            System.out.println("Estoque:\n");
            pr1.setQuantidade(pr1.getQuantidade() - i1.getQuantidade());
            pr2.setQuantidade(pr2.getQuantidade() - i2.getQuantidade());

            System.out.println("Venda 1:");
            System.out.println(v1.getpedidos());

            System.out.println("Venda 2:");
            System.out.println(v2.getpedidos());

            //Faça dois produtos receberem entrada de estoque, podendo vir de um mesmo
            //fornecedor. Registre esses eventos em uma coleção e imprima um relatório de todos os
            //fornecimentos, indicando o fornecedor, o produto, a data do fornecimento, o valor total de
            //cada fornecimento, e o custo total desses fornecimentos

            Produto pr3 = new Produto(3, "Erva mate", 200, 7.00, f1);
            Produto pr4 = new Produto(4, "Massa", 400, 3.50, f1);

            int qtdforn1 = 100;
            double total1 = qtdforn1 * pr3.getPreco();
            pr3.setQuantidade(qtdforn1 + pr3.getQuantidade());
            Fornecimento fr1 = new Fornecimento(LocalDate.of(2023, 11, 25), total1, pr3, f1);

            int qtdforn2 = 150;
            double total2 = qtdforn2 * pr4.getPreco();
            pr4.setQuantidade(qtdforn2 + pr4.getQuantidade());
            Fornecimento fr2 = new Fornecimento(LocalDate.of(2023, 11, 25), total2, pr4, f1);

            List<Fornecimento> fornecimentos = new ArrayList<>();
            fornecimentos.add(fr1);
            fornecimentos.add(fr2);
            System.out.println("\n Fornecimentos:\n");
            System.out.println(fornecimentos);

            double totalFornecido = 0;
            for (Fornecimento fornecimento : fornecimentos) {
                totalFornecido += fornecimento.getValorTotal();
            }
            System.out.println("\n Valor total fornecido: " + NumberFormat.getCurrencyInstance().format(totalFornecido) + "\n");


        } else comportamento();
    }

    private static void comportamento() {
        mythrowException();
    }

    private static void mythrowException() {
        try {
            System.out.println("\nErro! Há um produto sem preço.\n");
            throw new produtoSemPreco();
        } catch (produtoSemPreco e) {
            e.printStackTrace();
        } finally {
            System.err.println("Sucesso!");
        }
    }

    static class produtoSemPreco extends Exception {
        public produtoSemPreco() {
            super("\nErro! Há um produto sem preço. \n");
        }

}}

