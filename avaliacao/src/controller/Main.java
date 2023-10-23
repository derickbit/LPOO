package controller;

import model.Aluno;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        Aluno aluno3 = new Aluno(3,333333,"Mauricio","Silva","mauriciosilva@gmail.com");
        Aluno aluno4 = new Aluno(4,444444,"Mercer","Cunha","ultimatemercer@gmail.com");

        Aluno aluno5 = new Aluno(5, "Ana");
        Aluno aluno6 = new Aluno(6, "Nier");

        System.out.print("\nPrintando alunos com toString\n");
        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3);
        System.out.println(aluno4);
        System.out.println(aluno5);
        System.out.println(aluno6);

        aluno1.setId(1);
        aluno1.setCpf(111111);
        aluno1.setNome("Jorge");
        aluno1.setSobrenome("Maicon");
        aluno1.setEmail("jorgemaicon@yahoo.com.br");

        aluno2.setId(2);
        aluno2.setCpf(22222);
        aluno2.setNome("Jorge");
        aluno2.setSobrenome("Harisson");
        aluno2.setEmail("jorgeharisson@hotmail.com");

        System.out.print("\nPrintando alunos com getters\n");
        System.out.println("Aluno 1:" + aluno1.getId() + aluno1.getCpf() + aluno1.getNome() + aluno1.getSobrenome() + aluno1.getEmail());
        System.out.println("Aluno 2:" + aluno2.getId() + aluno2.getCpf() + aluno2.getNome() + aluno2.getSobrenome() + aluno2.getEmail());


        List<Aluno> listaAlunos = new ArrayList<Aluno>();
        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);
        listaAlunos.add(aluno3);
        listaAlunos.add(aluno4);
        listaAlunos.add(aluno5);
        listaAlunos.add(aluno6);

        System.out.print("\nPrintando lista\n");
        System.out.println(listaAlunos);

        System.out.print("\nPrintando aluno de id=5\n");
        int buscaId=5;
        for(Aluno aluno : listaAlunos ){
            if(aluno.getId()==buscaId){
                System.out.println(aluno);
                break;
            }
    }

        Map<Integer, Aluno> mapAlunos = new HashMap<>();
        mapAlunos.put(aluno1.hashCode(), aluno1);
        mapAlunos.put(aluno2.hashCode(), aluno2);
        mapAlunos.put(aluno3.hashCode(), aluno3);
        mapAlunos.put(aluno4.hashCode(), aluno4);
        mapAlunos.put(aluno5.hashCode(), aluno5);
        mapAlunos.put(aluno6.hashCode(), aluno6);

        System.out.print("\nPrintando Map padrão\n");
        System.out.println(mapAlunos);
        listaAlunos.sort(Comparator.comparing(Aluno::getId).reversed());
        System.out.print("\nPrintando Map ordenado\n");
        System.out.println(mapAlunos);
}}