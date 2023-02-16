package com.company;

public class Matrix {


    public static void main(String[] args) {

        int[][] matrica1 = {{3, 4, 5}, {2, 1, 6}, {9, 8, 7}};
        int[][] matrica2 = {{8, 9, 7}, {2, 3, 1}, {4, 6, 5}};
        int[][] result_matrica = {{}};

        printMat(matrica1);
        System.out.println("+");
        printMat(matrica2);
        System.out.println("=");

        for (int i = 0; i < result_matrica.length; i++) {
            for (int j = 0; j < result_matrica[i].length; j++) {
                result_matrica[i][j] = matrica1[i][j] + matrica2[i][j];
            }
        }
           printMat(result_matrica);
    }

    public static void printMat( int pMatrix[][]){

        for (int i = 0; i < pMatrix.length; i++) {
            for (int j = 0; j < pMatrix[i].length; j++) {
                        System.out.print(pMatrix[i][j] + "\t");

            }
            System.out.println();
        }
    }
}



