import java.util.Random;
import java.util.Scanner;

public class Õunad {
    public static void main(String[] args) {
        Scanner poialpoisside_arv = new Scanner(System.in);
        Random arv = new Random();
        System.out.println("Mitu pöialpoissi tahab õunu?: ");
        int poialpoisid = poialpoisside_arv.nextInt();
        int lumevalgekese_ounad = 14;
        int poialpoiss = 1;
        while (poialpoiss <= poialpoisid) {
            int ounad = random.nextInt(2) + 1;
            System.out.println(ounad);
            lumevalgekese_ounad -= ounad;
            poialpoiss++;
            System.out.println("Lumevalgekesele jäi " + lumevalgekese_ounad);

        }
    }
}