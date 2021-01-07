import java.util.Scanner;

public class Jänesevanemad {
    public static void main(String[] args) {
        Scanner ringide_arv = new Scanner(System.in);
        System.out.println("Ringide arv: ");
        int RingideArv = ringide_arv.nextInt();
        int porgandid = 0;
        int ring = 1;
        while (ring <= RingideArv) {
            if (ring % 2 == 0)
                porgandid += 2;
            ring += 1;
            System.out.println("Porgandite koguarv on " + porgandid);
        }
    }
}

