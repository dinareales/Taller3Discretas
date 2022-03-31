package com.company;

import java.util.Scanner;

public class MatrixAdy {
    private int n;
    private int[][] matrix;
    Scanner sc = new Scanner(System.in);
    private int value;

    public MatrixAdy(int n) {
        this.n = n;
        matrix = new int[this.n][this.n];
        //se inicializa matriz en 0
        for(int i=0; i< n; i++){
            for(int j=0; j< n; j++){
                matrix[i][j] = 0;
            }
        }
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void agregar(int i, int j){
        matrix[i][j] += 1;
    }

    public void llenarMatrixAdy(int n) {
        this.n = n;

        System.out.println("Matriz Adyacente: ");
        for (int i=0; i<n; i++) { //recorro el numero de filas (horizontal)
            for(int j=0; j<n; j++){
                System.out.print("Matriz Ady\\n Matriz["+i+"]["+j+"]: ");
                value = Integer.parseInt(sc.next());
                matrix[i][j] = value;
            }
        }
    }

    public void imprimir(){
        for(int i=0; i< n; i++){
            for(int j=0; j< n; j++){
                System.out.print( matrix[i][j] + "  " );
            }
            System.out.println();
        }
    }
}
