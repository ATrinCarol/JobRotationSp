import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Informe um número para verificar se ele faz parte das primeiras 30 posições na sequência de Fibonacci");

        Scanner read = new Scanner(System.in);
        int numero = read.nextInt();

         for (int i = 0; i < 30; i++) {
            System.out.print("Posição [" + i + "]. Número da sequência: " + Fibonacci.fibo(i) + "\t");

            if (numero == Fibonacci.fibo(i)){
                System.out.println("Encontramos! O número que você informou (" + numero + ") existe nessa sequência.");
                break;
            } else {
                System.out.println("Esses são os números da sequência e o que você informou até o momento não consta aqui.");
            }
        };      
    }
}
