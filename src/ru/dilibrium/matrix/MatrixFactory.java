package ru.dilibrium.matrix;

/**
 * Интефейс описывает действия над матрицами, такие как:
 * создание матриц,
 * вывод матрицы в консоль
 */
public interface MatrixFactory {

    /**
     * Возващает объект типа Matrix, заполненный случайными числами.
     * @return Matrix
     */
    static Matrix random(Matrix matrix) {
        for (int i = 0; i < matrix.getRowCount(); i++) {
            for (int j = 0; j < matrix.getColumnCount(); j++) {
                matrix.setElement((float)Math.random(), i, j);
            }
        }
        return matrix;
    }

    /**
     * Выводит матрицу в консоль.
     */
    static void toConsole(Matrix matrix) {
        for (int i = 0; i < matrix.getRowCount(); i++) {
            for (int j = 0; j < matrix.getColumnCount(); j++) {
                System.out.printf("%.2f", matrix.getElement(i, j));
                System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
