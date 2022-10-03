package br.com.dio.lists;

import java.util.*;

public class TemperaturaMedia {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        List<TemperaturaMes> temperaturas = new ArrayList<>();
        do{
            String mes;
            double temperatura;
            System.out.println("Qual o mês?");
            mes = ent.next();
            System.out.print("Temperatura média do mês: ");
            temperatura = ent.nextDouble();
            temperaturas.add(new TemperaturaMes(mes, temperatura));
        }while(temperaturas.size() < 6);
        ent.close();
        Iterator<TemperaturaMes> iterator = temperaturas.iterator();
        double total = 0.0;
        while(iterator.hasNext()){
            total += iterator.next().getTemperatura();
        }
        double media = total / temperaturas.size();
        System.out.println("Média semestral: " + media);
        System.out.println("Meses acima da média: ");
        for(TemperaturaMes mes : temperaturas){
            if(mes.getTemperatura() > media){
                System.out.println(mes.getMes());
            }
        }
    }
}

class TemperaturaMes{
    private final String mes;
    private final Double temperatura;
    public TemperaturaMes(String mes, Double temperatura) {
        this.mes = mes;
        this.temperatura = temperatura;
    }
    public String getMes() {
        return mes;
    }
    public Double getTemperatura() {
        return temperatura;
    }
}
