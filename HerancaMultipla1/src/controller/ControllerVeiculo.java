package controller;

import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ControllerVeiculo {
    public static void main(String[] args) {

        //Crie uma instância da classe Bicicleta e adicione valores válidos para os atributos
        //dessa instância, considerando, também, os atributos da sua superclasse, a classe
        //Veículo, conforme expresso no diagrama de classes abaixo. Depois, utilizando o
        //método toString(), imprima este objeto e verifique o resultado;
        Bicicleta b1 = new Bicicleta(2,"perna", "SANTA CRUZ", "downhill", 2023, 30, "123456");
        System.out.println(b1);

        //Agora crie uma instância da classe Carro e adicione valores válidos para os atributos
        //dessa instância, considerando, também, os atributos da sua superclasse, bem como,
        //os métodos da interface de quem ele herda, conforme especificado no diagrama de
        //classes abaixo;
        //int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao, int capacidadePortaMalas, String chassi, String renavam, String placa
        Carro c1 = new Carro(2,"alcool","Fiat","Palio", 2007, 2, "987654","aaaaaa","INO9876");
        System.out.println(c1);

        //Agora repita as mesmas tarefas do item b para uma instância da classe Caminhao.
        //int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao, int capacidadeDeCarga, String chassi, String renavam, String placa
        Caminhao cm1=new Caminhao(10, "diesel",  "Marca de caminhao", "modelo de caminhao", 2000, 200, "CHssi", "abc555", "III5566");
        System.out.println(cm1);

        //5 bicicletas, 5 carros e 5 caminhões
        Bicicleta b2 = new Bicicleta(2,"perna", "SANTA CRUZ", "downhill", 2023, 29, "123457");
        Bicicleta b3 = new Bicicleta(2,"perna", "SANTA CRUZ", "downhill", 2023, 28, "123458");
        Bicicleta b4 = new Bicicleta(2,"perna", "SANTA CRUZ", "downhill", 2023, 27, "123459");
        Bicicleta b5 = new Bicicleta(2,"perna", "SANTA CRUZ", "downhill", 2023, 25, "123333");

        Carro c2 = new Carro(2,"alcool","Fiat","Palio", 2007, 2, "987655","bbbbb","INO9999");
        Carro c3 = new Carro(2,"alcool","Fiat","Palio", 2007, 2, "987666","ccccc","ONO5555");
        Carro c4 = new Carro(2,"alcool","Fiat","Palio", 2007, 2, "987777","ddddd","INO1235");
        Carro c5 = new Carro(2,"alcool","Fiat","Palio", 2007, 2, "988657","eeeee","ANO1111");

        Caminhao cm2=new Caminhao(10, "diesel",  "Marca de caminhao", "modelo de caminhao", 2000, 200, "CHssi2", "abc666", "III6666");
        Caminhao cm3=new Caminhao(10, "diesel",  "Marca de caminhao", "modelo de caminhao", 2000, 200, "CHssi3", "abc777", "ccc7777");
        Caminhao cm4=new Caminhao(10, "diesel",  "Marca de caminhao", "modelo de caminhao", 2000, 200, "CHssi4", "abc888", "jjj8888");
        Caminhao cm5=new Caminhao(10, "diesel",  "Marca de caminhao", "modelo de caminhao", 2000, 200, "CHssi5", "abc999", "III9999");
        //Ordene e imprima a lista de veículos cadastradas no sistema, do maior para o menor ano de fabricação;
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(b1);
        veiculos.add(b2);
        veiculos.add(b3);
        veiculos.add(b4);
        veiculos.add(b5);
        veiculos.add(c1);
        veiculos.add(c2);
        veiculos.add(c3);
        veiculos.add(c4);
        veiculos.add(c5);
        veiculos.add(cm1);
        veiculos.add(cm2);
        veiculos.add(cm3);
        veiculos.add(cm4);
        veiculos.add(cm5);

        //veículos cadastradas no sistema, do maior para o menor ano de fabricação
        veiculos.sort (Comparator.comparing(Veiculo::getAnoFabricacao).reversed());
        System.out.print("\nVeiculos (por ordem de ano de fabricação):\n " + veiculos);

        //automóveis cadastradas no sistema, na mesma ordem do item a
        System.out.print("\nAutomoveis (por ordem de ano de fabricação):\n ");
        veiculos.forEach(v-> { if(v instanceof Automovel) System.out.println(v);});

       // bicicletas cadastradas no sistema, na mesma ordem do  item a
        System.out.print("\nBicicleta (por ordem de ano de fabricação):\n ");
        veiculos.forEach(v-> { if(v instanceof Bicicleta) System.out.println(v);});

        //Ordene e imprima a lista de veículos que possuem placas que começam pela letra
        //“I” ou “i” (organize o código para que dois ou mais veículos tenham placas que
        //comecem por “I” ou “i”), em ordem crescente pelo ano de fabricação.
        System.out.print("\nVeiculos que a placa começa com I ou i:\n ");
        veiculos.forEach(v -> {
            if (v instanceof Automovel) {
                if( ((Automovel) v).getPlaca().startsWith("I") || ((Automovel) v).getPlaca().startsWith("i") ) {System.out.print(v);}
            }
    });
}
}