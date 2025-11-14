package aula_05;

import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> numInteiros = new HashSet();

        numInteiros.add(1);
        numInteiros.add(2);
        numInteiros.add(3);
        numInteiros.add(3);

        // o metodo HashSet nao aceita elementos duplicados na lista
        for (Integer i : numInteiros) {
            System.out.println(i);
        }

        numInteiros.remove(3);

        // quando usamos o remove ele tira o elemento 3 da lista mesmo tendo adicionado o elemento "3" duas vezes na lista ele entende que adiconamos apenas uma vez ja que o metodo HashSet nao aceita itens duplicados na lista
        if (numInteiros.contains(3)) {
            System.out.println("\nO numero 3 esta na lista");
        }else {
            System.out.println("\nO numero 3 NÃO esta na lista");
        }

        if (! numInteiros.isEmpty()) {
            System.out.println("\nA lista de numeros NÃo esta vazia");
        }

        numInteiros.clear();

        if (numInteiros.isEmpty()) {
            System.out.println("\nA lista de numeros esta vazia");
        }

    }
}
