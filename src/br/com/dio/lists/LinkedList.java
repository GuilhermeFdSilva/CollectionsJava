package br.com.dio.lists;

import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        System.out.println("Crie uma lista chamada notas2 e coloque todos os elementos da list ArrayList nessa nova lista:");
        List<Double> notas2 = new java.util.LinkedList<>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);
        System.out.println(notas2);
        System.out.println("Mostre a primeira nota da nova lista sem remove-la:");
        System.out.println(notas2.get(0));
        System.out.println("Mostre a primeira nota da nova lista removendo-a:");
        System.out.println(notas2.remove(0));
        System.out.println(notas2);
    }
}
