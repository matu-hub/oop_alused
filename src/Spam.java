import java.util.Scanner;

public class Spam {
    public static void main(String[] args) {
        Scanner spämm = new Scanner(System.in);
        System.out.println("Kirja suurus: ");
        spämm.nextLine();
        System.out.println("Kirja pealkiri: ");
        String pealkiri = spämm.nextLine();
        System.out.println("Kas kirjaga on kaasas manus?: ");
        String manus = spämm.nextLine();
    }
}