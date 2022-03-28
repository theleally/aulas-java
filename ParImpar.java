import java.util.Scanner;

public class ParImpar {

    public static String verificarParImpar(int n) {
        if (n % 2 == 0) {
            return "Par";
        } else {
            return "Ímpar";
        }
    }

    public static int lerNumero() {
        Scanner leitor = new Scanner(System.in);
        int n;
        do {
            System.out.println("Digite um número inteiro.");
            n = leitor.nextInt();
            leitor.close();
            return n;
        } while (n >= 0);
    }

    public static void main(String[] args) {
        System.out.println(verificarParImpar(lerNumero()));
    }
}