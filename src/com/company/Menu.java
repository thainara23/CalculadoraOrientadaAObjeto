package com.company;

public class Menu {

    public void mensagemOperacao(){
        System.out.println("0 - Soma");
        System.out.println("1 - Subtração");
        System.out.println("2 - Multiplicação");
        System.out.println("3 - Divisão");
        System.out.println("4 - Número a ser elevado ao quadrado");
        System.out.println("5 - Número a ser elevado ao cubo");
        System.out.println("6 - Raiz Quadrada");
        System.out.println("7 - Raiz Cubica");
        System.out.println("8 - Logaritmo");
    }

    public void mensagemFinal(){
        System.out.println("Programa finalizado.");
    }

    public void mensagemErro(){
        System.out.println("Operação inválida.");
    }

    public void mensagemSair(){
        System.out.println("Saindo...");
    }

    public void mensagemNumero(){
        System.out.println("Digite um número: ");
    }

    public void decisao(){
        System.out.println("Digite a operação desejada: ");
        System.out.println("1 - Realizar uma nova conta sem ultilizar o resultado da anterior");
        System.out.println("2 - Realizar uma nova conta reaproveitando o resultado da anterior");
        System.out.println("3 - Vizualizar o resultado da conta anterior");
        System.out.println("4 - Vizualizar a conta anterior e o resultado");
        System.out.println("5 - Vizualizar todas as contas realizadas e o resultado");
        System.out.println("6 - Sair");
    }

    public void primeiraConta(){
        System.out.println("Esta é a sua primeira conta que será realizada.");
    }

}
