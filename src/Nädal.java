import java.util.Scanner;

public class Nädal {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        System.out.println("Sisestage ainepunktide arv: ");
        String AinepunktideArv = test.nextLine();
        System.out.println("Sisestage nädalate arv: ");
        String NädalateArv = test.nextLine();
        double ajakulu = (Double.parseDouble(AinepunktideArv) * 26) / Double.parseDouble(NädalateArv);
        System.out.println(Math.round(ajakulu));
    }
}

