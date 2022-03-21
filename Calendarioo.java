import java.util.Scanner;

class Calendarioo {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int mes;
        
        System.out.println("Informe o mês de 1 a 12");
        mes = leitor.nextInt();

        System.out.println(
            "Nome mes (if) = " + mostrarMesIf(mes) + "\n" + "Nome mes (switch) = " + mostrarNomeMesSwitch(mes)
        );

        leitor.close();


    }

    public static String mostrarMesIf(int mes) {
        
        String nomeMes = "";

        if (mes == 1) {
            nomeMes = "Janeiro";
        } else if (mes == 2) {
            nomeMes = "Fevereiro";
        } else if (mes == 3) {
            nomeMes = "Março";
        } else if (mes == 4) {
            nomeMes = "Abril";
        } else if (mes == 5) {
            nomeMes = "Maio";
        } else if (mes == 6) {
            nomeMes = "Junho";
        } else if (mes == 7) {
            nomeMes = "Julho";
        } else if (mes == 8) {
            nomeMes = "Agosto";
        } else if (mes == 9) {
            nomeMes = "Setembro";
        } else if (mes == 10) {
            nomeMes = "Outubro";
        } else if (mes == 11) {
            nomeMes = "Novembro";
        } else if (mes == 12) {
            nomeMes = "Dezembro";
        }

        return nomeMes;
    }

    public static String mostrarNomeMesSwitch(int mes) {
        
        String nomeMes = "";
        
        switch (mes) {
            case 1:
                nomeMes = "Janeiro";
                break;
            case 2:
                nomeMes = "Fevereiro";
                return nomeMes;
            case 3:
                nomeMes = "Março";
                return nomeMes;
            case 4:
                nomeMes = "Abril";
                return nomeMes;
            case 5:
                nomeMes = "Maio";
                return nomeMes;
            case 6:
                nomeMes = "Junho";
                return nomeMes;
            case 7:
                nomeMes = "Julho";
                return nomeMes;
            case 8:
                nomeMes = "Agosto";
                return nomeMes;
            case 9:
                nomeMes = "Setembro";
                return nomeMes;
            case 10:
                nomeMes = "Outubro";
                return nomeMes;
            case 11:
                nomeMes = "Novembro";
                return nomeMes;
            case 12:
                nomeMes = "Dezembro";
                return nomeMes;
        
            default:
        }
        return nomeMes;
    }
}