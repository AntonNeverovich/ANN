package ru.dilibrium;

public class Main {

    public static void main(String[] args) {

        int m = 3,
            n = 3;

        double[][] matrix = new double[m][n];
        Matrix.randomMatrix(matrix);
        Matrix.consoleDisplay(matrix);

        double[][] matrix1 = new double[m][n];
        Matrix.randomMatrix(matrix1);
        Matrix.consoleDisplay(matrix1);

        Matrix.consoleDisplay(Matrix.multiplicationSkalar(matrix1, ActivationFunction.logistic(Math.random())));
        Matrix.consoleDisplay(Matrix.summationMatrix(matrix, matrix1));




    }
}
