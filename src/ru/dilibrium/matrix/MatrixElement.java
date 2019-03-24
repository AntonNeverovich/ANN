package ru.dilibrium.matrix;

/**
 * Интерфейс описывает объект типа матрица
 */
public interface MatrixElement {

    /**
     * Возвращает индекс строки элемента матрицы.
     * @param a значение элемента матрицы
     * @return индекс строки
     */
    int getRowIndex(float a);

    /**
     * Возвращает индекс столбца элемента матрицы.
     * @param a значение элемента матрицы
     * @return индекс столбца
     */
    int getColumnIndex(float a);

    /**
     * Возвращает элемент матрицы по индексу.
     * @param m индекс строки
     * @param n индекс столбца
     * @return элемент матрицы
     */
    float getElement(int m, int n);

    /**
     * Возвращает марицу в виде массива элементов.
     * @return матрица
     */
    float[][] getElements();

}
