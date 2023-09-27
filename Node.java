public class Node {
    int x;
    Node next;
    public Node () {
        next = null;
    }

    //#make a stack with this linked list:
    public static void main(String args[]) {
        Node n1 = new Node();
        n1.x = 2;
        Node n2 = new Node();
        n2.x = 8;
        n2.next = n1;
        Node n3 = new Node();
        n3.x =  16;
        n3.next = n2;
        // 3 -> 2 -> 1
        System.out.println(n3.next.x);
    }
  //Stack ADT is consists of 4 methods push, pop, top, isEmpty,
}
