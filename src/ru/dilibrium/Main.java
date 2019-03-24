package ru.dilibrium;

import ru.dilibrium.matrix.Matrix;
import ru.dilibrium.matrix.MatrixFactory;
import ru.dilibrium.matrix.MatrixMath;

public class Main {

    public static void main(String[] args) {

        float[][] ma = {{3f, 4f}, {4f, 3f}};
        float[][] mb = {{5f, 6f}, {6f, 5f}};
        Matrix a = new Matrix(ma); // MatrixFactory.random(new Matrix(5, 2));
        Matrix b = new Matrix(mb); //MatrixFactory.random(new Matrix(2, 3));
        Matrix c = new Matrix();

        try {
            if (a.getColumnCount() == b.getRowCount()) {
                c = MatrixMath.multiplication(a, b);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Умножение матриц невозможно");
        }

        MatrixFactory.toConsole(a);
        MatrixFactory.toConsole(b);
        MatrixFactory.toConsole(c);




    }
}
