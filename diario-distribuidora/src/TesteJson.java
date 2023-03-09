import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class TesteJson {

    public static void main(String[] args){

        Map <String, Double> faturamentoDiario = new HashMap<>();

        faturamentoDiario.put("dia: 1", 22174.1664); 
        faturamentoDiario.put("dia: 2", 24537.6698); 
        faturamentoDiario.put("dia: 3", 26139.6134); 
        faturamentoDiario.put("dia: 4", 0.0);
        faturamentoDiario.put("dia: 5", 0.0);
        faturamentoDiario.put("dia: 6", 26742.6612); 
        faturamentoDiario.put("dia: 7", 0.0);
        faturamentoDiario.put("dia: 8", 42889.2258); 
        faturamentoDiario.put("dia: 9", 46251.174); 
        faturamentoDiario.put("dia: 10", 11191.4722);
        faturamentoDiario.put("dia: 11", 0.0);
        faturamentoDiario.put("dia: 12", 0.0);
        faturamentoDiario.put("dia: 13", 3847.4823);
        faturamentoDiario.put("dia: 14", 373.7838);
        faturamentoDiario.put("dia: 15", 2659.7563);
        faturamentoDiario.put("dia: 16", 48924.2448); 
        faturamentoDiario.put("dia: 17", 18419.2614);
        faturamentoDiario.put("dia: 18", 0.0);
        faturamentoDiario.put("dia: 19", 0.0);
        faturamentoDiario.put("dia: 20", 35240.1826); 
        faturamentoDiario.put("dia: 21", 43829.1667); 
        faturamentoDiario.put("dia: 22", 18235.6852);
        faturamentoDiario.put("dia: 23", 4355.0662);
        faturamentoDiario.put("dia: 24", 13327.1025);
        faturamentoDiario.put("dia: 25", 0.0);
        faturamentoDiario.put("dia: 26", 0.0);
        faturamentoDiario.put("dia: 27", 25681.8318); 
        faturamentoDiario.put("dia: 28", 1718.1221);
        faturamentoDiario.put("dia: 29", 13220.495);
        faturamentoDiario.put("dia: 30", 8414.61);

        int totalDias = faturamentoDiario.size();

        Double maiorValor = 0.0, menorValor = 0.0;
        for (Map.Entry<String, Double> valoresEntry : faturamentoDiario.entrySet()) {
             System.out.printf("Chave: %s\nValor: %f\n_________\n", valoresEntry.getKey(), valoresEntry.getValue()); 
              Double valores = valoresEntry.getValue();
                 if(valores > maiorValor){
                     maiorValor = valores;
                }
                 if(valores < menorValor){
                menorValor = valores;
                }
        }
        System.out.println("Total de dias: " + totalDias);

        List<Map.Entry<String, Double>> valoresValidos = faturamentoDiario.entrySet().stream().filter((elemento) -> elemento.getValue() != 0.0).collect(Collectors.toList());
        int diasValidos = valoresValidos.size();

        Double soma = faturamentoDiario.values().stream().mapToDouble(Double::doubleValue).sum();
        Double mediaMensal = soma / diasValidos;

        int numeroDias = 0;
        for (double valor : faturamentoDiario.values()) {
            if (valor > mediaMensal) {
                numeroDias++;
            }
        }

        System.out.println("Os dias válidos a serem considerados na média mensal são: " + diasValidos + " dias");
        System.out.println("O maior valor é: " + maiorValor);
        System.out.println("O menor valor é: " + menorValor);
        System.out.println("A média mensal é: " + mediaMensal);
        System.out.println("O número de dias em que o valor de faturamento diário foi superior à média mensal são " + numeroDias + " dias"); 
   
   }
}

