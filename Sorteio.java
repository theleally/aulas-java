import java.util.Random;

public class Sorteio {

    public static void main(String[] args) {
        
        Random gerador = new Random();
        int c = 1;
        int num;
        int soma = 0;
        double media = 0;
        int maxValue;
        int minValue;

        // while (c <= 1000) {
        //     num = 1 + gerador.nextInt(100);
        //     soma += num;
        //     System.out.println(num);
        //     c++;
        // }

        // media = soma / 1000;
        // System.out.println( "Média: " + media);

        for (c = 1; c <= 1000; c++) {
            num = 1 + gerador.nextInt(100);
            soma += num;
            System.out.println(num);
            c++;
        }
        
        media = soma / 1000;
        System.out.println( "Média: " + media);
    }

}