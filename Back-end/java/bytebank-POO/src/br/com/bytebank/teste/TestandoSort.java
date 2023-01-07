package br.com.bytebank.teste;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.modelo.conta.Conta;
import br.com.bytebank.modelo.conta.ContaCorrente;

public class TestandoSort {
    public static void main(String[] args) {
        
        Conta c1 = new ContaCorrente(22, 87);
        Conta c2 = new ContaCorrente(22, 13);
        Conta c3 = new ContaCorrente(22, 46);
        Conta c4 = new ContaCorrente(22, 32);
    
        List<Conta> lista = new ArrayList<>();
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);
        lista.add(c4);
        
        lista.forEach(conta -> System.out.println(conta));
        
        OrdenaPorNumero comparador = new OrdenaPorNumero();
        lista.sort(comparador);
        
        System.out.println("----------------------");
        lista.forEach(conta -> System.out.println(conta));
    }
}

class OrdenaPorNumero implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {

        if(c1.getNumero() < c2.getNumero()) return -1;
        if(c1.getNumero() > c2.getNumero()) return 1;
        
        return 0;
    }
    
}