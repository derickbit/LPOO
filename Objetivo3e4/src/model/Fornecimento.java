package model;

import java.time.LocalDate;
import java.util.Date;

public class Fornecimento {
    private Date data;
    private double valorTotal;
    private Produto Produto;
    private Fornecedor Fornecedor;

    public Fornecimento() {
    }

    public Fornecimento(LocalDate data, double valorTotal, model.Produto produto, model.Fornecedor fornecedor) {
        LocalDate LocalDate;
        this.valorTotal = valorTotal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public model.Produto getProduto() {
        return Produto;
    }

    public void setProduto(model.Produto produto) {
        Produto = produto;
    }

    public model.Fornecedor getFornecedor() {
        return Fornecedor;
    }

    public void setFornecedor(model.Fornecedor fornecedor) {
        Fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return "Fornecimento{" +
                "data=" + data +
                ", valorTotal=" + valorTotal +
                ", Produto=" + Produto +
                ", Fornecedor=" + Fornecedor +
                '}';
    }
}
