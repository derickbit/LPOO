package controller;

import model.Animal;
import model.Cachorro;
import model.Passaro;
import model.Peixe;

import java.util.ArrayList;
import java.util.List;

public class AnimalController {
    public static void main(String[] args) {

        //Crie três instâncias de cada classe do diagrama (das possíveis) com valores válidos para
        //os seus atributos. Insira-os em uma coleção do tipo List e os imprima.
        Peixe p1 = new Peixe(1.0, 1.0,1.0);
        Peixe p2 = new Peixe(2.0, 2.0, 2.0);
        Peixe p3 = new Peixe(3.0, 3.0, 3.0);
        Cachorro c1 = new Cachorro(1.0, 1.0);
        Cachorro c2 = new Cachorro(2.0, 2.0);
        Cachorro c3 = new Cachorro(3.0, 3.0);
        Passaro pa1 = new Passaro(1.0, 1.0, 1.0);
        Passaro pa2 = new Passaro(2.0, 2.0, 2.0);
        Passaro pa3 = new Passaro(3.0, 3.0, 3.0);

        List<Animal> animais = new ArrayList<>();
        animais.add(p1);
        animais.add(p2);
        animais.add(p3);
        animais.add(c1);
        animais.add(c2);
        animais.add(c3);
        animais.add(pa1);
        animais.add(pa2);
        animais.add(pa3);

        System.out.println("\nlista de animais:\n"+animais);

        //Percorra a coleção e faça com que os personagens sejam posicionados nas coordenadas
        //(2, 2), os desenhe, e imprima-os;
        System.out.println("\nReposicionando animais em x=2, y=2:\n");
        animais.forEach(a-> {
            a.mover(2.0,2.0); //movendo todos para 2,2
            a.desenhar(); //desenhando todos, cada um com seu método desenhar
            System.out.println(a);
        });

        //Reposicione os personagens que pertençam a classe Cachorro, nas coordenadas (8, 8),
        //os desenhe e imprima-os;

        System.out.println("Reposicionando os cachorros em x=8 e y=8");
        animais.forEach(a->{
            if(a instanceof Cachorro){
                a.mover(8.0,8.0);
                a.desenhar();
                System.out.println(a);
            }
        });

        //Reposicione os personagens que pertençam as classes Peixe e Passaro, nas coordenadas
        //(5, 5, 5), os desenhe e imprima-os

        System.out.println("Reposicionando os peixes e passaros em x=5 e y=5 z=5");
        animais.forEach(a->{
            if(a instanceof Peixe){
                ((Peixe) a).mover(5.0,5.0, 5.0);
                a.desenhar();
                System.out.println(a);
            }
        });
        animais.forEach(a->{
            if(a instanceof Passaro){
                ((Passaro)a).mover(5.0,5.0, 5.0);
                a.desenhar();
                System.out.println(a);
            }
        });


    }
}