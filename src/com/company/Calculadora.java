package com.company;

public class Calculadora {

    public double soma(double a, double b) {
        return a + b;
    }

    public double subtracao(double a, double b) {
        return a - b;
    }

    public double multiplicacao(double a, double b) {
        return a * b;
    }

    public double divisao(double a, double b) {
        return a / b;
    }

    public double potencia(double a, double b) {
        return Math.pow(a, b);
    }


    public double raizQuadrada(double a) {
        return Math.sqrt(a);
    }

    public double raizCubica(double a) {
        return Math.cbrt(a);
    }

    public double logaritmo(double a) {
        return Math.log(a);
    }


}
