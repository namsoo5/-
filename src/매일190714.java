import java.util.LinkedList;

public class 매일190714 {
    static Node creatNode() {
        Node root = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        root.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        return root;
    }

    static Node creatNode2() {
        Node root = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        root.next = n2;
        n2.next = n3;

        return root;
    }

    static Node creatNode3() {
        Node root = new Node(1);

        return root;
    }

    static void printNode(Node root) {
        if(root == null){
            System.out.println("null");
            return;
        }
        Node temp = root;
        while (true) {
            temp.print();
            temp = temp.next;

            if (temp == null) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        Node n1 = creatNode();
        Node n2 = creatNode2();
        Node n3 = creatNode3();

        printNode(n1);
        System.out.println();
        printNode(solution(n1, 2));
        System.out.println();
        System.out.println("-----------");

        printNode(n2);
        System.out.println();
        printNode(solution(n2, 3));
        System.out.println();
        System.out.println("-----------");

        printNode(n3);
        System.out.println();
        printNode(solution(n3, 1));

    }

    static Node solution(Node root, int n) {

        Node temp = root;
        Node first = root;

        for (int i = 0; i < n+1; i++) {
            temp = temp.next;
            if(temp == null){
                root = root.next;
                return root;
            }
        }


        for (; ; ) {
            first = first.next;
            temp = temp.next;

            if (temp == null) {
                break;
            }
        }
        first.next = first.next.next;

        return root;
    }

}

class Node {

    Node next;
    int value;

    public Node(int value) {
        this.next = null;
        this.value = value;
    }

    void print() {
        System.out.print(this.value + " ");
    }
}
