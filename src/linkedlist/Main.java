package linkedlist;

public class Main {
    public static void main(String[] args) {
        Node three = new Node();
        three.setValue(3);

        System.out.println(three.getLeft());
        Node left = new Node();
        left.setValue(2);

        three.setLeft(left);
        left.setRight(three);

        Node right = new Node();
        right.setValue(4);

        three.setRight(right);
        right.setLeft(three);

        // используем только left
        printList(left );

        MyLinkedList list = new MyLinkedList();
        list.size();
        list.addFirst(1);
        list.addLast(2);
    }

    private static void printList(Node root) {
        while(root != null) {
            System.out.println(root.getValue());
            root = root.getRight();
        }
    }
}
