class LinkedList
{
    Node sortedMerge(Node headA, Node headB) {
     Node result;
     if(headA.data<headB.data){
         result=new Node(headA.data);
         headA=headA.next;
     }else{
           result=new Node(headB.data);
         headB=headB.next;
     }
     Node iter=result;
     while(headA!=null && headB!=null){
         if(headA.data<headB.data){
             iter.next=new Node(headA.data);
             headA=headA.next;
         }else{
               iter.next=new Node(headB.data);
                headB=headB.next;
         }
         iter=iter.next;
     }
     while(headA!=null){
          iter.next=new Node(headA.data);
             headA=headA.next;
             iter=iter.next;
     }
     while(headB!=null){
          iter.next=new Node(headB.data);
                headB=headB.next;
                iter=iter.next;
     }
     return result;
   } 
}
