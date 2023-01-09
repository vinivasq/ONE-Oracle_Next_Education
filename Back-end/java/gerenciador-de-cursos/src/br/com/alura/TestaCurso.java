package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as colecoes do Java",
                    "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));


        // System.out.println(javaColecoes.getAulas());

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        aulas.sort(Comparator.comparing(Aula::getTempo));

        // System.out.println(aulas);

        System.out.println(javaColecoes);


    }
}
