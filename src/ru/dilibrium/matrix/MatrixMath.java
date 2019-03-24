package ru.dilibrium.matrix;

/**
 * Интерфейс описыват математические действия над матрицами
 */
public interface MatrixMath {

    /**
     * Возвращает новый объект типв Matrix в результате суммирования двух других матриц.
     * @param a матрица А
     * @param b матрица В
     * @return результирующая матрица
     */
    // TODO: выяснить про сложение матриц, какие матрицы можно складывать, какие нельзя
    // TODO: реализовать это в алгоритме
    static Matrix summation(Matrix a, Matrix b) {
        Matrix c = new Matrix(a.getRowCount(), a.getColumnCount());
        for (int i = 0; i < a.getRowCount(); i++) {
            for (int j = 0; j < a.getColumnCount(); j++) {
                c.setElement(a.getElement(i, j) + b.getElement(i, j), i, j);
            }
        }
        return c ;
    }

    /**
     * Возвращает новый объект типв Matrix в результате вычитания одной матрицы из другой.
     * @param a матрица А
     * @param b матрица В
     * @return результирующая матрица
     */
    static Matrix difference(Matrix a, Matrix b) {
        Matrix c = new Matrix(a.getRowCount(), a.getColumnCount());
        for (int i = 0; i < a.getRowCount(); i++) {
            for (int j = 0; j < a.getColumnCount(); j++) {
                c.setElement(a.getElement(i, j) - b.getElement(i, j), i, j);
            }
        }
        return c ;
    }

    /**
     * Возвращает новый объект типа Matrix в результате умножения матрица на скаляр.
     * @param a матрица А
     * @param s скаляр
     * @return результирующая матрица
     */
    static Matrix multiplicationScalar(Matrix a, float s) {
        Matrix c = new Matrix(a.getRowCount(), a.getColumnCount());
        for (int i = 0; i < a.getRowCount(); i++) {
            for (int j = 0; j < a.getColumnCount(); j++) {
                c.setElement(a.getElement(i, j) * s, i, j);
            }
        }
        return c ;
    }

    /**
     * Возвращает новый объект типв Matrix в результате умножения двух других матриц.
     * @param a матрица А
     * @param b матрица В
     * @return результирующая матрица
     */
    // TODO: оптимизировать алгоритм,
    // TODO: добавить проверку на условие умножения матриц
    static Matrix multiplication(Matrix a, Matrix b) {
        float[][] ma = a.getElements();
        float[][] mb = b.getElements();
        float[][] mc = new float[a.getRowCount()][b.getColumnCount()];
        Matrix c = new Matrix(mc);
            for (int i = 0; i < a.getRowCount(); i++) {
                for (int j = 0; j < b.getColumnCount(); j++) {
                    for (int k = 0; k < b.getRowCount(); k++) {
                        mc[i][j] += ma[i][k] * mb[k][j];
                        c.setElement(mc[i][j], i, j);
                    }

                }

            }
        return c;
    }

    /**
     * Возвращает новый объект в виде транспонированной матрицы.
     * @return транспоированная матрица
     */
    MatrixElement transpose();

    /**
     * Возвращает обратную матрицу.
     * @return обратная матрица
     */
    MatrixElement inverse();

    /**
     * Возвращает детерминант матрицы.
     * @return детерминант
     */
    float determinant();
}
