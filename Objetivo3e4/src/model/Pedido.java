package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private int numero;
    private LocalDate data;
    private double valor;
    private Vendedor vendedor;
    private List<Item> itens = new ArrayList<>();
    private String tipo;

    public Pedido() {
    }

    public Pedido(int numero, LocalDate data, double valor, String tipo, Vendedor vendedor) {
        this.numero = numero;

        LocalDate LocalDate;

        this.valor = valor;

        this.tipo = tipo;
        this.vendedor=vendedor;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numero=" + numero +
                ", data=" + data +
                ", valor=" + valor +
                ", itens=" + itens +
                ", vendedor=" + vendedor +
                ", tipo="+ tipo +
                "}\n";
    }
}
