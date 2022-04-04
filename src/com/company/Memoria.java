package com.company;

import java.util.ArrayList;

import static java.awt.SystemColor.menu;

public class Memoria {

    Menu menu = new Menu();
    public ArrayList<Calculo> conta = new ArrayList<>();

    public void add(Calculo c){
        conta.add(c);
    }

    public void imprimeConta(){
        Calculo calculo = conta.get(conta.size() - 1);
        System.out.println(calculo.toString());
    }

    public void imprimeTodasAsContas(){
        for(Calculo c : conta){
            System.out.println(c.toString());
        }
    }

    public  void imprimeUltimoResultado(){
        System.out.println("Resultado: " + ultimoResultado());
    }


    public  double ultimoResultado(){
        if(conta.size() > 0) {
            Calculo calculo = conta.get(conta.size() - 1);
            return calculo.getResultado();
        } else {
            menu.mensagemErro();
            return 0;
        }
    }

    public boolean taVazio(){
        return conta.size() > 0;
    }

}
