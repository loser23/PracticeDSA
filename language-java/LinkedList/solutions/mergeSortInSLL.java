class LinkedList
{
    static Node mergeSort(Node head)
    {   if(head==null || head.next==null)return head;
       Node left,right;
       Node slow=head,fast=head.next;
       while(true){
           if(fast==null || fast.next==null)break;
           fast=fast.next.next;
           slow=slow.next;
       }
       Node nextMiddle=slow.next;
       slow.next=null;
       left=mergeSort(head);
       right=mergeSort(nextMiddle);
       return merge(left,right);
    }
    public static Node merge(Node left,Node right){
        Node result;
        if(left.data<right.data){
            result=new Node(left.data);
            left=left.next;
            
        }else{
            result=new Node(right.data);
            right=right.next;
        }
        Node iter=result;
        while(left!=null && right!=null){
            if(left.data<right.data){
            iter.next=new Node(left.data);
            left=left.next;
            
            }else{
                iter.next=new Node(right.data);
                right=right.next;
            }
            iter=iter.next;
        }
        while(left!=null){
            iter.next=new Node(left.data);
            iter=iter.next;
            left=left.next;
        }
        while(right!=null){
            iter.next=new Node(right.data);
            iter=iter.next;
            right=right.next;
        }
        return result;
    }
}


