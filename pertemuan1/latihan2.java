package praktikumpemrograman1;
import praktikumpemrograman1.latihan1;

public class latihan2 {
    public static void main(String[]args) {
        latihan1 l1 = new latihan1(5);
        latihan1 l2 = new latihan1(7);
        
        l1.setNext(l2);

        latihan1 L = l1;
        while (L != null) {
            System.out.println(L.getNilai());
            L = L.getNext();
        }
    }
}
