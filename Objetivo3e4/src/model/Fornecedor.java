package model;

public class Fornecedor {
    private int cnpj;
    private String contato;
    private String nome;
    private Produto Produto;

    public Fornecedor() {
    }

    public Fornecedor(int cnpj, String contato, String nome) {
        this.cnpj = cnpj;
        this.contato = contato;
        this.nome = nome;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public model.Produto getProduto() {
        return Produto;
    }

    public void setProduto(model.Produto produto) {
        Produto = produto;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "cnpj=" + cnpj +
                ", contato='" + contato + '\'' +
                ", nome='" + nome + '\'' +
                ", Produto=" + Produto +
                "}\n";
    }
}
