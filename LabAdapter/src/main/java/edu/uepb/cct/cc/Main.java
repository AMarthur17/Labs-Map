package edu.uepb.cct.cc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        testarListMapAdapter();
        System.out.println("\n=====================================================\n");
        testarMapListAdapter();
    }

    private static void testarListMapAdapter() {
        System.out.println("\n#### Iniciando os testes do ListMapAdapter: ####");
        List<Object> lista = new ArrayList<>();
        MapFromListAdapter<Integer, Object> adapterLista = new MapFromListAdapter<>(lista);

        // CLEAR
        adapterLista.put(0, "Elemento 1");
        adapterLista.clear();
        System.out.println("Depois de limpar, ListMapAdapter está vazio? " + adapterLista.isEmpty());

        // CONTAINS
        adapterLista.put(0, "Elemento 1");
        System.out.println("O ListMapAdapter possui 'Elemento 1'? " + adapterLista.containsValue("Elemento 1"));
        System.out.println("O ListMapAdapter possui 'Elemento 2'? " + adapterLista.containsValue("Elemento 2"));

        // GET
        adapterLista.put(0, "Elemento 1");
        System.out.println("Valor no índice 0: " + adapterLista.get(0));

        // ISEMPTY
        System.out.println("ListMapAdapter está vazio? " + adapterLista.isEmpty());

        // PUT / ADD
        adapterLista.put(1, "Elemento 2");
        System.out.println("Valor no índice 1: " + adapterLista.get(1));

        // REMOVE
        adapterLista.remove(0);
        System.out.println("Após remover o índice 0, ListMapAdapter possui 'Elemento 1'? " + adapterLista.containsValue("Elemento 1"));

        // SIZE
        System.out.println("Quantidade de elementos no ListMapAdapter: " + adapterLista.size());

        // VALUES
        System.out.println("Elementos armazenados no ListMapAdapter: " + adapterLista.values());
    }

    private static void testarMapListAdapter() {
        System.out.println("#### Iniciando os testes do MapListAdapter: ####");
        Map<Integer, Object> mapa = new HashMap<>();
        ListFromMapAdapter<Object> adapterMapa = new ListFromMapAdapter<>(mapa);

        // CLEAR
        adapterMapa.add(0, "Elemento A");
        adapterMapa.clear();
        System.out.println("Depois de limpar, MapListAdapter está vazio? " + adapterMapa.isEmpty());

        // CONTAINS
        adapterMapa.add(0, "Elemento A");
        System.out.println("O MapListAdapter possui 'Elemento A'? " + adapterMapa.contains("Elemento A"));
        System.out.println("O MapListAdapter possui 'Elemento B'? " + adapterMapa.contains("Elemento B"));

        // GET
        adapterMapa.add(0, "Elemento A");
        System.out.println("Valor no índice 0: " + adapterMapa.get(0));

        // ISEMPTY
        System.out.println("MapListAdapter está vazio? " + adapterMapa.isEmpty());

        // PUT / ADD
        adapterMapa.add(1, "Elemento B");
        System.out.println("Valor no índice 1: " + adapterMapa.get(1));

        // REMOVE
        adapterMapa.remove(0);
        System.out.println("Após remover o índice 0, MapListAdapter possui 'Elemento A'? " + adapterMapa.contains("Elemento A"));

        // SIZE
        System.out.println("Quantidade de elementos no MapListAdapter: " + adapterMapa.size());

        // VALUES
        System.out.println("Elementos armazenados no MapListAdapter: " + Arrays.toString(adapterMapa.toArray()));
    }
}