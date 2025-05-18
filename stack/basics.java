import java.util.*;
public class basics {

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class stack{
        static Node head;
        static ArrayList<Integer> list = new ArrayList<>();


        public static boolean isEmptyArraylist(){
            return list.size() == 0;
        }

        public static void pushArryalist(int data){
            list.add(data);
        }

        public static int popArraylist(){
            if(isEmptyArraylist()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public static int peekArraylist(){
            if(isEmptyArraylist()){
                return -1;
            }

            return list.get(list.size()-1);
        }

       public static boolean isEmpty(){
           return head == null;
       }


       public static void push(int data){
           Node newNode = new Node(data);
           if(isEmpty()){
               head = newNode;
               return;
           }

           newNode.next = head;
           head = newNode;
       }


       public static int pop(){
           int top = head.data;
           head = head.next;
           return top;
       }


       public static int peek(){
        if(isEmpty()){
            return -1;
        }
           return head.data;
       }
    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(3);
        s.push(3);
        s.push(3);
 
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}