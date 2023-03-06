public class Fibonacci {

    static long fibo(int numeroInicio) {
        int numeroAtual = 0;     
        int numeroAnterior = 0;   

        for (int i = 1; i <= numeroInicio; i++) {

            if (i == 1) {
                numeroAtual = 1;
                numeroAnterior = 0;
            } else {
                numeroAtual += numeroAnterior;
                numeroAnterior = numeroAtual - numeroAnterior;
            }
        }

        return numeroAtual;
    }
 }
    
