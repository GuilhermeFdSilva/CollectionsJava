package br.com.dio.map;

import java.sql.SQLOutput;
import java.util.*;

public class Populacao {
    public static void main(String[] args) {
        Map<String, Integer> estados = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estados);
        estados.put("RN",3534165);
        System.out.println(estados);
        System.out.println("PB está no dicionario: " + estados.containsKey("PB"));
        if(!estados.containsKey("PB")){
            estados.put("PB", 4039277);
        }
        System.out.println(estados);
        Set<Map.Entry<String, Integer>> entries = estados.entrySet();
        for (Map.Entry<String, Integer> entry: entries) {
            if(entry.getKey().equals("PE")){
                System.out.println("População de PE: " + entry.getValue());
            }
        }
        Map<String, Integer> estados2 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estados2);
        Map<String, Integer> estados3 = new TreeMap<>(estados);
        System.out.println(estados3);
        Integer menorPopulacao = Collections.min(estados.values());
        String menorEstado = "";
        Set<Map.Entry<String, Integer>> entries1 = estados.entrySet();
        for (Map.Entry<String, Integer> entry : entries1) {
            if(entry.getValue().equals(menorPopulacao)){
                menorEstado = entry.getKey();
            }
        }
        System.out.println("Estado com menor população: " + menorEstado);
        Integer maiorPopulacao = Collections.max(estados.values());
        String maiorEstado = "";
        Set<Map.Entry<String, Integer>> entries2 = estados.entrySet();
        for(Map.Entry<String, Integer> entry : estados.entrySet()){
            if(entry.getValue().equals(maiorPopulacao)){
                maiorEstado = entry.getKey();
            }
        }
        System.out.println("Estado com maior população: " + maiorEstado);
        Iterator<Integer> iterator = estados.values().iterator();
        Integer soma = 0;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Soma da população: " + soma);
        System.out.println("Media dos estados: " + (soma / estados.size()));
        Iterator<Integer> iterator1 = estados.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next() < 4000000){
                iterator1.remove();
            }
        }
        System.out.println(estados);
    }
}
