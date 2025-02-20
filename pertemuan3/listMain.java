package pertemuan3;

public class listMain {
    public static void main(String[] args) {
        // Latihan 4
        strukturList list1 = new strukturList();
        System.out.println("Elemen latihan 4: ");
        list1.addTail(3);
        list1.addTail(4);
        list1.addTail(5);
        list1.displayElement();
        System.out.println("\n");

        // tes 1 a
        strukturList list2 = new strukturList();
        System.out.println("\nElemen Tes 1 a: ");
        list2.addTail(3);
        list2.addTail(2);
        list2.addTail(1);
        list2.displayElement();
        System.out.println("\n");

        // tes 1 b
        strukturList list3 = new strukturList();
        System.out.println("\nElemen Tes 1 b: ");
        list3.addTail(1);
        list3.addTail(4);
        list3.addTail(5);
        list3.addTail(7);
        list3.displayElement();
        System.out.println("\n");

        // tes 2
        strukturList list4 = new strukturList();
        System.out.println("Elemen Tes 2: ");
        list4.addHead(5);
        list4.addHead(4);
        list4.addHead(3);
        list4.displayElement();
        System.out.println("\n");

        // tes 3 a
        strukturList list5 = new strukturList();
        System.out.println("Elemen Tes 3 a: ");
        list5.addHead(1);
        list5.addHead(2);
        list5.addHead(3);
        list5.displayElement();
        System.out.println("\n");

        // tes 3 b
        strukturList list6 = new strukturList();
        System.out.println("Elemen Tes 3 b: ");
        list6.addHead(7);
        list6.addHead(5);
        list6.addHead(4);
        list6.addHead(1);
        list6.displayElement();
        System.out.println("\n");
    }
}
