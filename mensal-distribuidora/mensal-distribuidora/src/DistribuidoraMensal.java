import java.util.HashMap;
import java.util.Map;

public class DistribuidoraMensal {
    public static void main(String[] args) throws Exception {

      Map <String, Double> faturamentoMensal = new HashMap<>();

      faturamentoMensal.put("SP", 67836.43); 
      faturamentoMensal.put("RJ", 36678.66); 
      faturamentoMensal.put("MG", 29229.88); 
      faturamentoMensal.put("ES", 27165.48); 
      faturamentoMensal.put("Outros", 19849.53); 

      for (Map.Entry<String, Double> valoresEntry : faturamentoMensal.entrySet()) {
         System.out.printf("\nEstado: %s\nValor: %f\n_________\n", valoresEntry.getKey(), valoresEntry.getValue()); 
      }

      Double totalMensal = faturamentoMensal.values().stream().mapToDouble(Double::doubleValue).sum();

      Double faturamentoSP = faturamentoMensal.get("SP");
      Double faturamentoRJ = faturamentoMensal.get("RJ");
      Double faturamentoMG = faturamentoMensal.get("MG");
      Double faturamentoES = faturamentoMensal.get("ES");
      Double faturamentoOutros = faturamentoMensal.get("Outros");

      Double percentualSP = (faturamentoSP / totalMensal) * 100;
      Double percentualRJ = (faturamentoRJ / totalMensal) * 100;
      Double percentualMG = (faturamentoMG / totalMensal) * 100;
      Double percentualES = (faturamentoES / totalMensal) * 100;
      Double percentualOutros = (faturamentoOutros / totalMensal) * 100;

      double sp = (double) Math.round(percentualSP);
      double rj = (double) Math.round(percentualRJ);
      double mg = (double) Math.round(percentualMG);
      double es = (double) Math.round(percentualES);
      double outros = (double) Math.round(percentualOutros);

      System.out.println("\n\n**Percentuais equivalentes aos Estados**\n SP: " + sp + "%\n RJ: " + rj + "%\n MG: " + mg + "%\n ES: " + 
      es + "%\n Outros: " + outros + "%");

   }
}


