package aula_05;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<>();

        listaNomes.add("Alice");
        listaNomes.add("Bob");
        listaNomes.add("Carol");

        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        System.out.println();
        for (int i = 0; i < listaNomes.size(); i++) {
            System.out.println(listaNomes.get(i));
        }

        System.out.println();
        System.out.println(listaNomes.get(1));

        if (listaNomes.contains("Bob")) {
            System.out.println("\nO nome Bob esta na lista");
        }

        listaNomes.remove("Bob");

        if (! listaNomes.contains("Bob")) {
            System.out.println("\nO nome Bob NÃO esta na lista");
        }

        if (! listaNomes.isEmpty()) {
            System.out.println("\nA lista de nomes NÃo esta vazia");
        }

        listaNomes.clear();

        if (listaNomes.isEmpty()) {
            System.out.println("\nA lista de nomes esta vazia");
        }
    }
}
