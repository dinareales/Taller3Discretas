package com.company;
import java.util.Scanner;

public class Menu {
    boolean exit = false;
    int option;
    int vertice;
    int arista;
    int[][] matrix;
    int[][] matrixInc;
    int n;

    public Menu() {
        this.menu();
    }

    private void menu() {
        Scanner sc = new Scanner(System.in);
        while (!exit) {
            System.out.print("\n\nVamos a calcular las matrices de adyacencia e incidencia" +
                    " \ny verificar si es un grafo dirigido y no dirigido, si es completo, regular o euleriano\n " +
                    "Seleccione el tipo de matriz\n " +
                    "1. Matriz adyacente \n " +
                    "2. Matriz incidente. \n " +
                    "3. Salir \n");
            System.out.print("Ingrese una opcion: ");
            try {
                option = Integer.parseInt(sc.next());
                switch (option) {
                    case 1:
                        System.out.print("Ingrese el numero de vertices del grafo: ");
                        vertice = Integer.parseInt(sc.next());

                        MatrixAdy matrix = new MatrixAdy(vertice);
                        System.out.print("Matriz adyacente actual:\n");
                        matrix.imprimir();

                        matrix.llenarMatrixAdy(vertice);
                        System.out.print("Matriz adyacente actual:\n");
                        matrix.imprimir();

                        Grafo grafo = new Grafo();
                        String typeGraph = grafo.tipoDeGrafo(matrix.getMatrix());
                        System.out.println(typeGraph);
                        break;
                    case 2:
                        System.out.print("Ingrese el numero de vertices del grafo: ");
                        vertice = Integer.parseInt(sc.next());
                        System.out.print("Ingrese el numero de aristas del grafo: ");
                        arista = Integer.parseInt(sc.next());

                        MatrixInci matrixInc = new MatrixInci(vertice,arista);
                        System.out.print("Matriz incidente actual:\n");
                        matrixInc.imprimir();

                        matrixInc.llenarMatrixAdy(vertice,arista);
                        System.out.print("Matriz incidente actual:\n");
                        matrixInc.imprimir();

                        Grafo grafo2 = new Grafo();
                        String typeGraph2 = grafo2.tipoDeGrafo(matrixInc.getMatrix());
                        System.out.println(typeGraph2);
                        break;
                    case 3:
                        System.out.print("Hasta luego!");
                        exit = true;
                        break;
                    default:
                        System.out.print("Opcion no valida!\n\n");
                }
            } catch (NumberFormatException ex ){
                System.out.println("Inserte un numero valido. Por favor intente nuevamente\n\n");
            }
        }
    }




}

