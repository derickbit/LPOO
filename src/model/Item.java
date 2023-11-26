package model;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private int codItem;
    private double desconto;
    private int quantidade;
    private Produto produto;

    public Item() {
    }

    public Item(int codItem, double desconto, int quantidade) {
        this.codItem = codItem;
        this.desconto = desconto;
        this.quantidade = quantidade;
    }

    public int getCodItem() {
        return codItem;
    }

    public void setCodItem(int codItem) {
        this.codItem = codItem;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Item{" +
                "codItem=" + codItem +
                ", desconto=" + desconto +
                ", quantidade=" + quantidade +
                ", produtos=" + produto +
                "}\n";
    }
}
