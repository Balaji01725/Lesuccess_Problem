package doublyLinkedList;
class Node{
    int val;
    Node prev;
    Node next;
    Node(int val){
        this.val=val;
        this.prev=null;
        this.next=null;
    }
}
 class linkedList {
    Node head;
   void add(int val){
       Node newNode=new Node(val);
       if(head==null){
           head=newNode;
       }else{
           Node ptr=head;
           while(ptr.next!=null){
               ptr=ptr.next;
           }
           ptr.next=newNode;
           newNode.prev=ptr;
       }
   }
   void traverse(){
       Node ptr=head;
       while(ptr!=null){
           System.out.print(ptr.val+"->");
           ptr=ptr.next;
       }
       System.out.print("null");
   }
   void reverse(){
       Node temp=head;
       while(temp.next!=null){
           temp=temp.next;
       }
       while(temp!=null){
           System.out.print(temp.val+"->");
           temp=temp.prev;
       }
       System.out.println("null");
   }
}
