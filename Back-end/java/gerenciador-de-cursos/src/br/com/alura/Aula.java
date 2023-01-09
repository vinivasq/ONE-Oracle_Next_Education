package br.com.alura;

public class Aula  implements Comparable<Aula>{
    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo){
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }

    public int ordenaPorTempo(Aula outraAula){
        return Integer.compare(this.tempo, outraAula.tempo);
    }
    
    @Override
    public String toString() {
        return "[Aula: " + this.titulo + ", duração: " + this.tempo + " min.]";
    }

    @Override
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.titulo);
    }
}
