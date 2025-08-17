import java.util.*;
class Node {
    int val;     
    Node next;   

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class Day18{
    public static Node swapPair(Node head) {
        if (head==null||head.next==null) {
            return head;
        }
        Node dummy=new Node(0);
        dummy.next=head;
        Node prev=dummy;
        while(head!=null&&head.next!=null){
            Node first=head;
            Node second=head.next;

            prev.next=second;
            first.next=second.next;
            second.next=first;

            prev=first;
            head=first.next;

        }
        return dummy.next;
    }
    public static void main(String[] args){
    Node head=new Node(1);
    head.next=new Node(2);
    head.next.next=new Node(3);
    head.next.next.next=new Node(4);
    Node result=swapPair(head);
    while(result!=null){
        System.out.print(result.val+"");
        result=result.next;
    }
    }
}