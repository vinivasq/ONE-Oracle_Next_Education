package br.com.bytebank.teste;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.modelo.conta.Cliente;
import br.com.bytebank.modelo.conta.Conta;
import br.com.bytebank.modelo.conta.ContaCorrente;
import br.com.bytebank.modelo.conta.ContaPoupanca;

public class TesteDeLamba {
    public static void main(String[] args) {
        
        Conta c1 = new ContaCorrente(22, 33);
        Cliente clienteC1 = new Cliente("Vinicius", "98512354720", "programador");
        c1.setTitular(clienteC1);
        c1.deposita(333.0);

        Conta c2 = new ContaPoupanca(22, 44);
        Cliente clienteC2 = new Cliente("Guilherme", "8721376472", "Designer");
        c2.setTitular(clienteC2);
        c2.deposita(444.0);

        Conta c3 = new ContaCorrente(22, 11);
        Cliente clienteC3 = new Cliente( "Paulo", "12187465390", "Vendedor");
        c3.setTitular(clienteC3);
        c3.deposita(111.0);

        Conta c4 = new ContaPoupanca(22, 22);
        Cliente clienteC4 = new Cliente("Ana", "85432509712", "Contadora");
        c4.setTitular(clienteC4);
        c4.deposita(222.0);

     
        List<Conta> lista = new ArrayList<>();
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);
        lista.add(c4);
        
        lista.forEach(conta -> System.out.println(conta + ", " + conta.getTitular().getNome()));

        lista.sort((conta1, conta2) ->  Integer.compare(conta1.getNumero(), conta2.getNumero()));
        
        Comparator<Conta> compNome = (conta1, conta2) -> {
            String nomeC1 = conta1.getTitular().getNome();
            String nomeC2 = conta2.getTitular().getNome();
            
            return nomeC1.compareTo(nomeC2);
        };
    
        lista.sort(compNome);

        System.out.println("----------------------");
        lista.forEach(conta -> System.out.println(conta + ", " + conta.getTitular().getNome()));
    }
}
