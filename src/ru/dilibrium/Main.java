package ru.dilibrium;

public class Main {

    public static void main(String[] args) {

        int m = 3,
            n = 3;

        System.out.println("Инициализация первой матрицы");
        double[][] matrix = new double[m][n];
        Matrix.randomMatrix(matrix);
        Matrix.consoleDisplay(matrix);

        System.out.println("Инициализация второй матрицы");
        double[][] matrix1 = new double[m][n];
        Matrix.randomMatrix(matrix1);
        Matrix.consoleDisplay(matrix1);

        double s = ActivationFunction.logistic(Math.random());
        System.out.print("Умножение второй матрицы на случайное число ");
        System.out.printf("%.2f", s);
        System.out.println();
        Matrix.consoleDisplay(Matrix.multiplicationSkalar(matrix1, s));

        System.out.println("Прибавление второй матрицы к первой");
        Matrix.consoleDisplay(Matrix.summationMatrix(matrix, matrix1));

    }
}
