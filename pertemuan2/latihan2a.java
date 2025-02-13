/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpemrograman1;

/**
 *
 * @author Ramad
 */
public class latihan2a {
    public static void main(String[]args) {
        latihan1 l1 = new latihan1(5);
        latihan1 l2 = new latihan1(7);
        latihan1 l3 = new latihan1(9);
        latihan1 l4 = new latihan1(8);
        latihan1 l5 = new latihan1(2);
        latihan1 l6 = new latihan1(3);

        l1.setNext(l2);
        l2.setNext(l3);
        l3.setNext(l4);

        latihan1 L1 = l1;
        while (L1 != null) {
            System.out.printf("%d ", L1.getNilai());
            L1 = L1.getNext();
        }
    }
}
