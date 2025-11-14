package aula_05;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, String> capitais = new HashMap<>();

        capitais.put("Brasil", "Brasilia");
        capitais.put("Argentina", "Buenos Aires");
        capitais.put("França", "Paris");

        System.out.println(capitais.get("Brasil"));

        if (capitais.containsKey("Japao")){
            System.out.println("\nExiste cadastro da chave japao");
        }else {
            System.out.println("\nNÃo existe cadastro da chave japao");
        }

        System.out.println();
        for (String chave : capitais.keySet()) {
            System.out.println(chave + " - " + capitais.get(chave));
        }
    }
}

