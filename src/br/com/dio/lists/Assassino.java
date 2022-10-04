package br.com.dio.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Assassino {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        List<Boolean> questoes = new ArrayList<>();
        String resposta;
        System.out.println("Telefonou para vítima?");
        resposta = ent.next();
        if(resposta.equalsIgnoreCase("sim") || resposta.equalsIgnoreCase("s")){
            questoes.add(true);
        }else{
            questoes.add(false);
        }
        System.out.println("Esteve no local do crime?");
        resposta = ent.next();
        if(resposta.equalsIgnoreCase("sim") || resposta.equalsIgnoreCase("s")){
            questoes.add(true);
        }else{
            questoes.add(false);
        }
        System.out.println("Mora perto vítima?");
        resposta = ent.next();
        if(resposta.equalsIgnoreCase("sim") || resposta.equalsIgnoreCase("s")){
            questoes.add(true);
        }else{
            questoes.add(false);
        }
        System.out.println("Devia para vítima?");
        resposta = ent.next();
        if(resposta.equalsIgnoreCase("sim") || resposta.equalsIgnoreCase("s")){
            questoes.add(true);
        }else{
            questoes.add(false);
        }
        System.out.println("Já trabalhou com a vítima?");
        resposta = ent.next();
        if(resposta.equalsIgnoreCase("sim") || resposta.equalsIgnoreCase("s")){
            questoes.add(true);
        }else{
            questoes.add(false);
        }
        Iterator<Boolean> iterator = questoes.iterator();
        int respostas = 0;
        while(iterator.hasNext()){
            if(iterator.next()){
                respostas++;
            }
        }
        if(respostas == 5){
            System.out.println("Assassina");
        } else if (respostas >= 3 && respostas <= 4) {
            System.out.println("Cúmplice");
        }else if (respostas == 2){
            System.out.println("Suspeita");
        }else {
            System.out.println("Inocente");
        }
    }
}