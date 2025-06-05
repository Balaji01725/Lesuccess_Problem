package Assignment12;
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
    Node tail;
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
     public void insertAtPosition(int data, int position) {
         Node newNode = new Node(data);

         if (position <= 1 || head == null) {
             newNode.next = head;
             if (head != null) head.prev = newNode;
             head = newNode;
             if (tail == null) tail = newNode;
             return;
         }

         Node current = head;
         int i = 1;

         while (i < position - 1 && current.next != null) {
             current = current.next;
             i++;
         }

         newNode.next = current.next;
         newNode.prev = current;

         if (current.next != null) {
             current.next.prev = newNode;
         } else {
             tail = newNode;
         }

         current.next = newNode;
     }
     void deleteFirstNode(){
       head=head.next;
       head.prev=null;
     }
     void insertBegining(int val){
       Node newNode=new Node(val);
       newNode.next=head;
       head.prev=newNode;
       newNode.prev=null;
       head=newNode;
     }
     void deleteLast(){
       Node temp=head;
       while(temp.next!=null){
           temp=temp.next;
       }
       temp.prev.next=null;

     }
     void InsertEnd(int val){
       Node newNode=new Node(val);
       Node temp=head;
       while(temp.next!=null){
           temp=temp.next;
       }
       temp.next=newNode;
       newNode.prev=temp;
     }
     void deleteMiddle(){
       Node slow=head;
       Node fast=head;
       while(fast.next!=null && fast.next.next!=null){
           slow=slow.next;
           fast=fast.next.next;
       }
       slow.prev.next=slow.next;
     }
     void insertKPosition(int val){
       Node newNode=new Node(val);
         Node slow=head;
         Node fast=head;
         while(fast.next!=null && fast.next.next!=null){
             slow=slow.next;
             fast=fast.next.next;
         }
         Node slowPrev=slow.prev.next;
         slowPrev=newNode;
         newNode.next=slow.prev;
         slow.prev=newNode;
         newNode.prev=slow.prev;
     }
}
