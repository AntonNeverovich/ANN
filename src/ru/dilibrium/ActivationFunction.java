package ru.dilibrium;

public class ActivationFunction {

    public static double logistic(double x) {
        System.out.println();
        System.out.print("Значение до применения функции активации: ");
        System.out.printf("%.2f", x);
        x = 1 / (1 + (Math.pow(Math.E, x)));
        System.out.println();
        System.out.print("Значение после применения функции активации: ");
        System.out.println(x);

//        System.out.printf("%.2f", x);
        return x;


    }
}
