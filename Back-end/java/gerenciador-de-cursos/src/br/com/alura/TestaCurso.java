package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        aulas.sort(Comparator.comparing(Aula::getTempo));
        // System.out.println(javaColecoes);
        // System.out.println(aulas);

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);
        
        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        
        javaColecoes.getAlunos().forEach(aluno -> System.out.println(aluno));
        
        // Aluno turini = new Aluno("Rodrigo Turini", 34672);


        System.out.println("Existe o aluno com a matricula: 5617?");
        Aluno pesquisaAluno = javaColecoes.buscaMatriculaAluno(5617);
        System.out.println(pesquisaAluno);
        
        // System.out.println(a1.equals(turini));
        // System.out.println(javaColecoes.getAlunos().contains(turini));

    }
}
