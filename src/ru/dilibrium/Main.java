package ru.dilibrium;

public class Main {

    public static void main(String[] args) {

        // размерность матрицы
        int n = 3,
            m = 3;

        Matrix wages = new Matrix(new double[n][m]);
        wages.randomMatrixDouble();

        // индексы элемента
        int a = 0,
            b = 0;

        for (int i = 0; i <10; i++) {
            System.out.println("Итерация: " + i);
            if (wages.getValue(a, b) > 0.005) {
                wages.multiplicationSkalar(ActivationFunction.logistic(wages.getValue(a, b)));
            }
        }

    }
}
