package ru.dilibrium;

class ActivationFunction {

    /**
     * логистическая функция
     * @param x x
     * @return f(x)
     */
    static float logistic(float x) {
        x = (float)(1 / (1 + (Math.pow(Math.E, x))));
        return x;
    }

}
