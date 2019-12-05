package Exercicio2.br.com.exercico2;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NovaLista {

    public static void main(String[] args) {

        List<Integer> novaLista = new ArrayList<>();

        novaLista.add(1);
        novaLista.add(5);
        novaLista.add(5);
        novaLista.add(6);
        novaLista.add(7);
        novaLista.add(8);
        novaLista.add(8);
        novaLista.add(8);

        for (Integer valor : novaLista) {
            System.out.print(valor + ", ");

        }

        System.out.println("-------------------------------------------------------------------------------");

        Set<Integer> novoConjunto = new HashSet<>();

        novoConjunto.add(1);
        novoConjunto.add(5);
        novoConjunto.add(5);
        novoConjunto.add(6);
        novoConjunto.add(7);
        novoConjunto.add(8);
        novoConjunto.add(8);
        novoConjunto.add(8);

        for (Integer valor : novoConjunto) {
            System.out.println(valor);

        }

        }

    }

