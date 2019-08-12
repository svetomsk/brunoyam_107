package linkedlist;

public class MyLinkedList {
    private Node head;
    private int size = 0;

    // 5
    public int get(int index) {
        // for(int i = 0; i < index; i++) {
        return 0;
    }

    // 6
    public void set(int index, int value) {
//         for(int i = 0; i < index; i++) {
//         node.setValue(value);
    }

    // 1
    public int size() {
        return size;
    }

    // 3
    public void addFirst(int value) {
        Node node = new Node(); // 1
        node.setValue(value);   // 1
        if(head != null) {
            node.setRight(head);    // 2
            head.setLeft(node);     // 3
        }
        head = node;
    }

    // 4
    public void addLast(int value) {
        // получить последний элемент, начиная с head
        // добавить новый элемент за последним
    }

    // 7
    public void remove(int index) {

    }

    // 2
    public void printList() {
        Node root = head;
        while(root != null) {
            System.out.print(root.getValue() + " ");
            root = root.getRight();
        }
    }
}

//
//package linkedlist;
//
//public class MyLinkedList {
//    private Node head;
//    private int size = 0;
//
//    // 5
//    public int get(int index) {
//        return 0;
//    }
//
//    // 6
//    public void set(int index, int value) {
//
//    }
//
//    // 1
//    public int size() {
//        return size;
//    }
//
//    // 3
//    public void addFirst(int value) {
//
//    }
//
//    // 4
//    public void addLast(int value) {
//
//    }
//
//    // 7
//    public void remove(int index) {
//
//    }
//
//    // 2
//    public void printList() {
//        Node root = head;
//        while(root != null) {
//            System.out.print(root.getValue() + " ");
//            root = root.getRight();
//        }
//    }
//}
