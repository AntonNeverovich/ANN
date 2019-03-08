package ru.dilibrium;

import java.util.SplittableRandom;

public class Matrix {

    private double[][] matrixDouble;
//    private int[][] matrixInt;

    /**
     * конструкторы класса
     * @param matrixDouble
     */
    public Matrix (double[][] matrixDouble) {
        this.matrixDouble = matrixDouble;
    }
//    public Matrix(int[][] matrixInt) {
//        this.matrixInt = matrixInt;
//    }


    /**
     * метод заполняет матрицу случайными числами
     */
    public void randomMatrixDouble() {
        for (int i = 0; i < matrixDouble.length; i++) {
            for (int j = 0; j < matrixDouble[i].length; j++) {
                matrixDouble[i][j] = Math.random();
                System.out.printf("%.2f", matrixDouble[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println();
    }

//    public void randomMatrixInt() {
//        for (int i = 0; i < matrixInt.length; i++) {
//            for (int j = 0; j < matrixInt[i].length; j++) {
//                matrixInt[i][j] = ;
//                System.out.printf("%.2f", matrixInt[i][j]);
//                System.out.print("\t");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }


    /**
     * метод возвращает значение определенного элемента матрицы по индексу
     * @param i индекс строки
     * @param j индекс стоблца
     * @return
     */
    public double getValue(int i, int j) {
        System.out.print("Элемент матрицы с индексом (" + i + "," + j + ") = ");
        System.out.printf("%.2f", matrixDouble[i][j]);
        return matrixDouble[i][j];

    }

    /**
     * метод реализующий умножение матрицы на скалярный вектор
     * @param s значение скалярного вектора
     */
    public void multiplicationSkalar (double s) {
        for (int i = 0; i < matrixDouble.length; i++) {
            for (int j = 0; j < matrixDouble[i].length; j++) {
                matrixDouble[i][j] = matrixDouble[i][j] * s;
                System.out.printf("%.2f", matrixDouble[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println();
    }


}
