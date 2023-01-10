package br.com.alura;

// import java.util.Map.Entry;
// import java.util.Collection;
// import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
// import java.util.Set;

public class ExercicioMap {

    public static void main(String[] args) {

        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");

        // Collection<Integer> valores = pessoas.keySet();

        // for (Integer valor : valores) {
        //     System.out.println(pessoas.get(valor));
        // }
    
        // pessoas.keySet().forEach(idade -> System.out.println(pessoas.get(idade)));
        
        pessoas.forEach((key, value) -> System.out.println(value));

        // exercicio 02

        // Map<String, Integer> nomesParaIdade = new HashMap<>();
        // nomesParaIdade.put("Paulo", 31);
        // nomesParaIdade.put("Adriano", 25);
        // nomesParaIdade.put("Alberto", 33);
        // nomesParaIdade.put("Guilherme", 26);
        

        // Set<String> chave = nomesParaIdade.keySet();
        // for (String valor : chave) {
        //     System.out.println(valor);
        // }

        // Collection<Integer> valor = nomesParaIdade.values();
        // for (Integer idade : valor) {
        //     System.out.println(idade);
        // }

        // Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();

        // for (Entry<String,Integer> associacao : associacoes) {
        //     System.out.println(associacao.getKey() + "-" + associacao.getValue());
        // }


    }
}