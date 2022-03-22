import java.util.Random;

public class Sorteio {

    public static void main(String[] args) {
        
        Random gerador = new Random();
        int c = 1;
        int num;

        // while (c <= 1000) {
        //     num = 1 + gerador.nextInt(100);
        //     System.out.println(num);
        //     c++;
        // }

        for (c = 1; c <= 1000; c++) {
            num = 1 + gerador.nextInt(100);
            System.out.println(num);
            c++;
        }
    
    }

}