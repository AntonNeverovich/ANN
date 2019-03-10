package ru.dilibrium;

public class ActivationFunction {


    public static double logistic(double x) {
        x = 1 / (1 + (Math.pow(Math.E, x)));
        return x;
    }

}
