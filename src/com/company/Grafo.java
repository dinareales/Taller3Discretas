package com.company;

public class Grafo {

    /**
     * ¿Cuál es el tipo de grafo (dirigido o no dirigido, regular o completo)
     * nombre del método: tipoDeGrafo
     * entrada: matriz de adyacencia
     * retorno: cadena que contiene el tipo de grafo
     *
     * @return
     */
    public String tipoDeGrafo(int[][] matrix) {
        String retorno = "El grafo es: ";

        if (esRegular(matrix)) {
            retorno += "\nRegular";
        }

        if (esCompleto(matrix)) {
            retorno += "\nCompleto ";
        }

        if (esDirigido(matrix)) {
            retorno += "\nDirigido ";
        } else {
            retorno += "\nNo dirigido ";
        }

        return retorno;
    }

    private static boolean esRegular(int matriz[][]) {
        // testea si es regular
        int grauA = 0;

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                grauA += matriz[i][j];
            }
        }

        for (int i = 1; i < matriz.length; i++) {
            int grauB = 0;
            for (int j = 0; j < matriz.length; j++) {
                grauB += matriz[i][j];
            }
            if (grauA != grauB) {
                return false;
            }
        }
        return true;
    }

    private static boolean esDirigido(int matriz[][]) {
        // Testea si es digido o no es dirigido
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean esSimples(int matriz[][]) {
        // simples o multigrafo
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j && matriz[i][j] == 1) {
                    return false;
                }
                if (matriz[i][j] > 1) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean esCompleto(int matriz[][]) {
        // testea completo
        if (esSimples(matriz)) {
            int grauA = (matriz.length-1);

            for (int i = 1; i < matriz.length; i++) {
                int grauB = 0;
                for (int j = 0; j < matriz.length; j++) {
                    if (matriz[i][j] == 1) {
                        grauB++;
                    }
                }
                if (grauA != grauB) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

}