package Assignment11;
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
    void delete(int val){
        Node prev=null;
        Node cur=head;
        while(cur!=null && cur.next!=null){
            if(cur.val==val){
                prev.next=cur.next;
            }
            prev=cur;
            cur=cur.next;

        }
    }
    void removeDuplicates(){
        Node prev=head;
        Node cur=prev.next;
        while(cur!=null){
            if(prev.val!=cur.val){
                prev.next=cur;
                prev=cur;
                cur=cur.next;
            }else{
                cur=cur.next;
            }
        }
        prev.next=null;
    }
     public void deleteNode(Node node) {
         node.val=node.next.val;
         node.next=node.next.next;

     }
     public Node mergeKLists(Node[] lists) {
         if(lists==null || lists.length==0) return null;
         Node head=lists[0];
         for(int i=1;i<lists.length;i++){
             head=merge2List(head,lists[i]);
         }
         return head;
     }
     static Node merge2List(Node l1,Node l2){
         Node res=new Node(0);
         Node current=res;
         while(l1!=null && l2!=null){
             if(l1.val<=l2.val){
                 current.next=l1;
                 l1=l1.next;
             }else{
                 current.next=l2;
                 l2=l2.next;
             }
             current=current.next;
         }
         if(l1!=null) current.next=l1;
         if(l2!=null) current.next=l2;
         return res.next;
     }
}
