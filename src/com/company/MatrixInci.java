package com.company;

import java.util.Scanner;

public class MatrixInci {
    private int n;
    private int m; //numero de arista
    private int[][] matrix;
    Scanner sc = new Scanner(System.in);
    private int value;

    public MatrixInci(int n, int m) {
        this.n = n;
        this.m = m;

        matrix = new int[this.n][this.m];
        //se inicializa matriz en 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
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

    public void llenarMatrixAdy(int n, int m) {
        this.n = n;
        this.m = m;

        System.out.println("Matriz Incidencia: ");
        for (int i=0; i<n; i++) { //recorro el numero de filas (horizontal)
            for(int j=0; j<m; j++){
                    System.out.print("Matriz Inc\\n Matriz["+i+"]["+j+"]: ");
                value = Integer.parseInt(sc.next());
                matrix[i][j] = value;
            }
        }
    }

    public void imprimir(){
        for(int i=0; i< n; i++){
            for(int j=0; j< m; j++){
                System.out.print( matrix[i][j] + "  " );
            }
            System.out.println();
        }
    }
}
