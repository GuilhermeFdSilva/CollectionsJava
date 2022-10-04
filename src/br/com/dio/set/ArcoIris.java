package br.com.dio.set;

import java.util.*;

public class ArcoIris {
    public static void main(String[] args) {
        Set<String> arcoIris = new LinkedHashSet<>(){{
            add("Vermelho");
            add("Laranja");
            add("Amarelo");
            add("Verde");
            add("Azul");
            add("Índigo");
            add("Violeta");
        }};
        for(String cor : arcoIris){
            System.out.println(cor);
        }
        System.out.println("Quantidade de cores: " + arcoIris.size());
        Set<String> arcoIris1 = new TreeSet<>(arcoIris);
        System.out.println("Ordem alfabetica: ");
        for(String cor : arcoIris1){
            System.out.println(cor);
        }

        System.out.print("Ordem inversa: ");
        List<String> arcoIris2 = new ArrayList<>(arcoIris);
        Collections.reverse(arcoIris2);
        System.out.println(arcoIris2);

        System.out.println("Cores que começam com V: ");
        for(String cor : arcoIris){
            if(cor.startsWith("V")){
                System.out.println(cor);
            }
        }
        System.out.println("Apagando cores sem V: ");
        Iterator<String> iterator = arcoIris.iterator();
        while (iterator.hasNext()){
            if(iterator.next().startsWith("V")){
                continue;
            }
            iterator.remove();
        }
        System.out.println(arcoIris);
    }
}
