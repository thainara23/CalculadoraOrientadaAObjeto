package com.company;

import java.util.Scanner;


public class Calculo {

    Menu menu = new Menu();
    Scanner scan = new Scanner(System.in);
    Calculadora calculadora = new Calculadora();

    private double numero1;
    private double numero2;
    private double resultado;
    private int operador;
    private final String[] operadorChar = {"+","-","*","/", "²", "³", "√", "³√", "log"};

    public  Calculo(){
        setNumero1();
        setOperador();
        if (operador <= 3){
            setNumero2();
        }
        setResultado();
    }

    public  Calculo(double numero1){
        this.numero1 = numero1;
        setOperador();
        if (operador <= 3){
            setNumero2();
        }
        setResultado();
    }

    public double getNumero1(){
        return numero1;
    }

    public double getNumero2(){
        return numero2;
    }

    public double getResultado(){
        return resultado;
    }

    public int getOperador(){
        return operador;
    }

    public void setNumero1(){
        menu.mensagemNumero();
        this.numero1 = scan.nextDouble();
    }

    public void setNumero2(){
        menu.mensagemNumero();
        this.numero2 = scan.nextDouble();
    }

    public void setResultado(){
        switch (getOperador()) {
            case 0 -> this.resultado = calculadora.soma(getNumero1(), getNumero2());
            case 1 -> this.resultado = calculadora.subtracao(getNumero1(), getNumero2());
            case 2 -> this.resultado = calculadora.multiplicacao(getNumero1(), getNumero2());
            case 3 -> this.resultado = calculadora.divisao(getNumero1(), getNumero2());
            case 4 -> this.resultado = calculadora.potencia(getNumero1(), 2);
            case 5 -> this.resultado = calculadora.potencia(getNumero1(), 3);
            case 6 -> this.resultado = calculadora.raizQuadrada(getNumero1());
            case 7 -> this.resultado = calculadora.raizCubica(getNumero1());
            case 8 -> this.resultado = calculadora.logaritmo(getNumero1());
            default -> throw new IllegalStateException("Unexpected value: " + getOperador());
        }
    }


    public void setOperador(){
        System.out.println("Digite o operador desejado:");
        menu.mensagemOperacao();
        int oper = scan.nextInt();
        while (oper < 0 || oper > 8){
            System.out.println("Operador inválido, digite novamente:");
            menu.mensagemOperacao();
            oper = scan.nextInt();
        }
        this.operador = oper;
    }


    @Override
    public String toString() {
        return  getNumero1() + " " + operadorChar[operador] + " " + getNumero2() + " = " + getResultado();
    }



}
