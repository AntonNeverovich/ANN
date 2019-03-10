package ru.dilibrium;

class Matrix {

    /**
     * метод возвращает первую матрицу в результате суммирования с другой
     * @param matrix матрица 1
     * @param matrix1 матрица 2
     * @return результирующая матрица
     */
    static double[][] summationMatrix (double[][] matrix, double[][] matrix1) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrix[i][j] + matrix1[i][j];
            }
        }
        return matrix;
    }

    /**
     * метод реализующий умножение матрицы на скаляр (число)
     * @param s значение скалярного вектора
     * @return возвращает результирующую мтарицу
     */
    static double[][] multiplicationSkalar(double[][] matrix, double s) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrix[i][j] * s;
            }
        }
        return matrix;
    }

    /**
     * метод заполняет матрицу случайными числами
     * @param matrix изначальная матрица
     */
    static void randomMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.random();
            }
        }
    }

    /**
     * метод выводит значение матрицы Matrix в консоль
     */
    static void consoleDisplay(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%.2f", matrix[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
