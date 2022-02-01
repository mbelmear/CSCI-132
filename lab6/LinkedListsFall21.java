package lab6;

public class LinkedListsFall21 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        System.out.println("adding");
        ll.add(5);
        ll.add(7);
        ll.add(9);
        ll.add(10);
        ll.print();
        ll.search(7);
        ll.search(99);
        System.out.println(ll.deleteNode(11));
        ll.printBackwards();
        System.out.println();
        ll.print();
    }
}