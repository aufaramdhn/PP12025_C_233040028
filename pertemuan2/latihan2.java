package praktikumpemrograman1;
import praktikumpemrograman1.latihan1;

public class latihan2 {
    public static void main(String[]args) {
        latihan1 l1 = new latihan1(5);
        latihan1 l2 = new latihan1(7);

        l1.setNext(l2);

        latihan1 L1 = l1;
        while (L1 != null) {
            System.out.printf("%d ", L1.getNilai());
            L1 = L1.getNext();
        }
    }
}
