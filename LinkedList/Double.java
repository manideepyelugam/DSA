package LinkedList;
class DoubleLinkedList{
    class Node{
        int data;
        Node prev;
        Node next;
    
    
        Node(int data){
                this.data = data;
                this.next = null;
                this.prev = null;
        }
    }


    private Node head;

    public void InsertAtBegining(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }


    public void InsertAtEnd(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }else{
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
            newNode.prev = current;
        }
    }


    public void InsertByPos(int data,int pos){
        Node newNode = new Node(data);

       if(pos == 0){
        InsertAtBegining(data);
       }

       Node current = head;

       for (int i = 0; i < pos-1 && current != null; i++) {
            current = current.next;
       }

       if(current == null){
        System.out.println("Position is out of bounds.");
        return;
       }

       newNode.next = current.next;
       newNode.prev = current;

       if(current.next != null){
          current.next.prev = newNode;
       }

       current.next = newNode;


    }



    public void deleteByValue(int value){

        if(head == null){
            return;
        }

        Node current = head;

        while(current.next != null){
            if(current.data == value){
                if(current.prev != null){
                    current.prev.next = current.next;
                }else{
                    head = current.next;
                }

                if(current.next != null){
                    current.next.prev = current.prev;
                }
                return;
            }

            current = current.next;
        }
    }


    public void deleteHead(){
        if(head == null)return;

        Node current = head;
        
        if(head.next != null){
            head = current.next;
            head.prev = null;
        }else{
            head = null;
        }
    }


    public void deleteAtEnd(){
        if(head == null)return;

        if(head.next ==null){
            head = null;
            return;
        }

        Node current = head;
        while(current.next != null){
            current = current.next;
        }

        current.prev.next = null;

    }
   
    public void printForward(){
        if(head == null)return;
        
        Node current = head;
        while(current.next != null){
            System.out.println(current.data+"<->");
            current = current.next;
        }
        System.out.println("null");
    }


    public void printBackward(){
        if(head == null)return;

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        while (current != null) {
            System.out.println(current.data+"<->");
            current = current.prev;
        }
        System.out.println("null");
    }


    public boolean search(int value){
            if(head == null) return false;
            
            Node current = head;
            while (current.next != null) {
                if(current.data == value){
                    return true;
                }
                current = current.next;
            }
            return false;

    }

    public DoubleLinkedList merge(DoubleLinkedList list1,DoubleLinkedList list2){
        if(list1.head == null)return list2;
        if(list2.head == null)return list1;

        Node current = list1.head;

        while (current.next != null) {
            current = current.next;
        }
        current.next = list2.head;
        list2.head.prev = current;
        return list1;
    }
}

public class Double {
    public static void main(String[] args) {
        
    }
}
