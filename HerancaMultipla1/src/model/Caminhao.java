package model;

public class Caminhao extends Veiculo implements Automovel {
    private int capacidadeDeCarga;
    //atributos automovel
    private String Chassi;
    private String Renavam;
    private String Placa;

    public Caminhao() {
    }

    public Caminhao(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao, int capacidadeDeCarga, String chassi, String renavam, String placa) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.capacidadeDeCarga = capacidadeDeCarga;
        Chassi = chassi;
        Renavam = renavam;
        Placa = placa;
    }

    public int getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(int capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
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
        return "Caminhao{" +
                ", capacidadeDeCarga=" + capacidadeDeCarga +
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
