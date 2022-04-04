package com.company;


import java.util.Scanner;



public class Main {

    public static void main(String[] args) {;

        Scanner scan = new Scanner(System.in);
        Menu menu = new Menu();
        Memoria conta = new Memoria();
        boolean continuar = true;
        int opcao;

        while (continuar) {
            menu.decisao();
            opcao = scan.nextInt();
            switch (opcao) {
                case 1: {
                    conta.add(new Calculo());
                    conta.imprimeUltimoResultado();
                    break;
                }
                case 2: {
                    if (!(conta.taVazio())){
                        menu.primeiraConta();
                        break;
                    }
                    else {
                        conta.add(new Calculo(conta.ultimoResultado()));
                        conta.imprimeUltimoResultado();
                    }
                    break;
                }
                case 3:{
                    if (!(conta.taVazio())){
                        menu.primeiraConta();
                        break;
                    } else {
                        conta.imprimeUltimoResultado();
                        break;
                    }
                }
                case 4: {
                    if (!(conta.taVazio())){
                        menu.primeiraConta();
                        break;
                    } else {
                        conta.imprimeConta();
                        break;
                    }
                }
                case 5: {
                    if (!(conta.taVazio())){
                        menu.primeiraConta();
                        break;
                    } else {
                        conta.imprimeTodasAsContas();
                    }
                }
                case 6:
                    continuar = false;
                    menu.mensagemSair();
                    menu.mensagemFinal();
                    break;
                default: {
                    menu.mensagemErro();
                    break;
                }
            }
        }

    }
}
