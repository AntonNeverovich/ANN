package ru.dilibrium.matrix;

public class Matrix implements MatrixElement {

    private int m, n; // индексы количества строк и столбцов
    private float a; // элемент матрицы
    private float[][] matrix; // матрица в форме массива

    public Matrix() {}

    /**
     * Конструктор класса. Создает двумерный массив размером m × n.
     * @param m количество строк
     * @param n количество столбцов
     */
    public Matrix(int m, int n) {
        this.m = m;
        this.n = n;
        this.matrix = new float[m][n];
    }

    /**
     * Конструктор класса. Принимает готовый двумерный массив.
     * @param matrix двумерный массив
     */
    public Matrix(float[][] matrix) {
        this.matrix = matrix;
    }

    // getters & setters
    //public int getRowCount() { return m; } // возвращает количество строк
    public int getRowCount() { return matrix.length; } // возвращает количество строк
    //public int getColumnCount() { return n; } // возвращает количество столбцов
    public int getColumnCount() { return matrix[0].length; } // возвращает количество столбцов
    @Override
    public float getElement(int m, int n) { return matrix[m][n]; } // возвращает значение элемента по индексу

    public void setRowCount(int m) { this.m = m; } // задает количество строк
    public void setColumnCount(int n) { this.n = n; } // задает количество столбцов
    public void setElement(float el, int m, int n) { this.matrix[m][n] = el; } // задает значение элемента матрицы по индексу

    // TODO: усовершенствовать методы, чтобы они могли проверять есть этот элемент в матрице или нет
    // TODO: и проверять есть ли одинаковые элементы
    @Override
    public int getRowIndex(float a) {
        int k = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == a) {
                    k = i;
                }
            }
        }
        return k;
    }

    @Override
    public int getColumnIndex(float a) {
        int k = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == a) {
                    k = j;
                }
            }
        }
        return k;
    }

    @Override
    public float[][] getElements() {
        return matrix;
    }

}
