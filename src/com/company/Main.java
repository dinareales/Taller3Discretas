package com.company;

public class Main {
    public static void main(String[] args) {
        new Menu();
        //ejemplos para validar si funciona
        //matriz ady
        //La matriz de adyacencia de los grafos no dirigidos siempre es simétrica.
        int[][] noDir = {{0, 1, 0, 1, 1}, {1, 0, 1, 0, 0}, {0, 1, 0, 1, 0}, {1, 0, 1, 0, 1}, {1, 0, 0, 1, 0}};
        int[][] dir = {{0, 1, 1, 0}, {0, 0, 0, 1}, {0, 1, 0, 0}, {0, 0, 1, 0}};
        Grafo grafo = new Grafo();
        String typeGraph = grafo.tipoDeGrafo(noDir);
        System.out.println(typeGraph);
    }
}