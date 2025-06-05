package llinkedList;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
 class linedList {
    Node head;
    void add(int val){
        Node newNode =new Node(val);
        if(head==null){
            head=newNode;
        }else{
            Node ptr=head;
            while(ptr.next!=null){
                ptr=ptr.next;
            }
            ptr.next=newNode;
        }
    }
    void traversal(){
        Node ptr=head;
        while(ptr!=null){
            System.out.print(ptr.val+"->");
            ptr=ptr.next;
        }
        System.out.print("null");
    }
}
