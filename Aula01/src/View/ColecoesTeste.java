package View;

import java.awt.*;
import java.util.*;
import java.util.concurrent.ExecutionException;

public class ColecoesTeste {

    public static void main (String[] args) {
        // criar um lista de carros
        // add 3 carros
        // exibir os carros armazenado na lista


        //ArrayList podem ser acessados por índice.
        ArrayList<String> listacarros = new ArrayList<>();
        listacarros.add("corsa");
        listacarros.add("corvette");
        listacarros.add("GTR");

        for (String item : listacarros) {
            System.out.println(item);

        }

        System.out.println("*********Ex2********");

        // Criar um set de cores String
        // add duas cores
        // exibir as cores do conjunto(set)


        //SET é uma coleção que não permite elementos duplicados.
        Set<String> cores = new HashSet<>();
        cores.add("vermelho");
        cores.add("azul");
        cores.add("roxo");


        for (String item : cores) {
            System.out.println(item);
        }

        System.out.println("*********Ex3********");

        // Criar um map de estados brasileiros, chave(sigla), valor (nome estado)
        // add estados brasileiros
        // exibir a sigla e nome dos estados armazenados no map


        // MAP é uma estrutura de dados que mapeia chaves para valores.
        Map<String, String> mapsEstados = new HashMap<>();

        mapsEstados.put("SP", "São Paulo");
        mapsEstados.put("RJ", "Rio de Janeiro");
        mapsEstados.put("BA", "Bahia");

        for (Map.Entry<String, String> item : mapsEstados.entrySet()) {
            String chave = item.getKey();
            String valor = item.getValue();
            System.out.println("sigla:" + " " + chave + " " + "Estado:" + " " + valor);
        }

    }
}
