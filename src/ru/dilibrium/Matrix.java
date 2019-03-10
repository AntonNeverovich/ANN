package ru.dilibrium;

class Matrix {


    /**
     * метод возвращает матрицу в результате суммирования двух других матриц
     * @param matrix
     * @param matrix1
     * @return
     */
    public static double[][] summationMatrix (double[][] matrix, double[][] matrix1) {
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
     */
    public static double[][] multiplicationSkalar(double[][] matrix, double s) {
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
     * @return
     */
    public static double[][] randomMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.random();
            }
        }
        return matrix;
    }

    /**
     * метод выводит значение матрицы Matrix в консоль
     */
    public static void consoleDisplay(double[][] matrix) {
        System.out.println("Матрица \n");
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
