import java.util.Scanner;

public class StringInversa {
    public static void main(String[] args) throws Exception {

        System.out.println("Digite uma palavra ou frase que queira inverter os caracteres: ");
        Scanner ler = new Scanner(System.in);

        String original = ler.nextLine();
        
        String invertida = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }
        System.out.println("Original: " + original);
        System.out.println("Invertida: " + invertida);
    }
}