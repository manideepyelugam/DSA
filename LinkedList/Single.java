class SingleLinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.next = null;
            this.data = data;
        }
    }

    private Node head;

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtPosition(int data, int pos) {
        Node newNode = new Node(data);

        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;

        for (int i = 0; i < pos - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Position is out of bounds");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void deleteANodeByItsPosition(int pos) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (pos == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        for (int i = 0; i < pos - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Position is out of bounds");
            return;
        }

        current.next = current.next.next;
    }

    public void removeByValue(int value) {
        if (head == null) return;

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == value) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public boolean searchForNode(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void print() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int length() {
        Node current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void middle() {
        int length = length();
        if (length == 0) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        for (int i = 0; i < length / 2; i++) {
            current = current.next;
        }
        System.out.println("Middle element: " + current.data);
    }

    public static void compare(SingleLinkedList list,SingleLinkedList list2){
        if(list.length() == list2.length()){
            System.out.println("equal");
        }else{
            System.out.println("no");
        }
    }

    public static SingleLinkedList merge(SingleLinkedList list,SingleLinkedList list2){
        if(list.head == null) return list2;
        if(list2.head == null) return list;

        Node current = list.head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = list2.head;

        return list;


    }
    
}

public class Single {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.print(); // Output: 1 -> 2 -> 3 -> null
        
        SingleLinkedList list2 = new SingleLinkedList();
        list2.add(4);     
        list2.add(4);
        list2.add(4);
        list2.print();

        SingleLinkedList.compare(list,list2);
        SingleLinkedList.merge(list, list2).print();

      
    }
}
