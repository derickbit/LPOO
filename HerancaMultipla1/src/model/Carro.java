package model;

public class Carro extends Veiculo implements Automovel {
    private int capacidadePortaMalas;

    //atributos automovel
    private String Chassi;
    private String Renavam;
    private String Placa;

    public Carro() {
        super();
    }

    public Carro(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao, int capacidadePortaMalas, String chassi, String renavam, String placa) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.capacidadePortaMalas = capacidadePortaMalas;
        Chassi = chassi;
        Renavam = renavam;
        Placa = placa;
    }



    public int getCapacidadePortaMalas() {
        return capacidadePortaMalas;
    }

    public void setCapacidadePortaMalas(int capacidadePortaMalas) {
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    @Override
    public String getChassi() {
        return Chassi;
    }

    @Override
    public void getChassi(String chassi) {

    }

    public void setChassi(String chassi) {
        Chassi = chassi;
    }

    @Override
    public String getRenavam() {
        return Renavam;
    }

    @Override
    public void getRenavam(String renavam) {

    }

    public void setRenavam(String renavam) {
        Renavam = renavam;
    }

    @Override
    public String getPlaca() {
        return Placa;
    }

    @Override
    public void setPlaca(String placa) {
        Placa = placa;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "capacidadePortaMalas=" + capacidadePortaMalas +
                ", Chassi='" + Chassi + '\'' +
                ", Renavam='" + Renavam + '\'' +
                ", Placa='" + Placa + '\'' +
                ", numeroDeEixos=" + getNumeroDeEixos() + '\'' +
                ", propulsao='" + getPropulsao() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", anoFabricacao=" + getAnoFabricacao() +
                "}\n";
    }
}
