package ru.dilibrium;

class ActivationFunction {

    /**
     * логистическая функция
     * @param x x
     * @return f(x)
     */
    static double logistic(double x) {
        x = 1 / (1 + (Math.pow(Math.E, x)));
        return x;
    }

}
