package praktikumpemrograman1;
public class latihan1 {
    private int nilai;
    private latihan1 next;

    public latihan1(int nilai) {
        this.nilai = nilai;
    }

    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    public latihan1 getNext() {
        return next;
    }

    public void setNext(latihan1 next) {
        this.next = next;
    }
}
