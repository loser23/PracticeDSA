	int intersectPoint(Node headA, Node headB)
	{
         int len1 = 0;
        int len2 = 0;
        Node iter1 = headA;
        while(iter1!=null){
            len1++;
            iter1=iter1.next;
        }
        Node iter2 = headB;
        while(iter2!=null){
            len2++;
            iter2 = iter2.next;
        }
        if(len1>=len2){
            int x = len1-len2;
            iter1=headA;
            while(x-->0)iter1=iter1.next;
            iter2 = headB;
        }else{
            int x = len2-len1;
            iter2 = headB;
            while(x-->0)iter2 = iter2.next;
            iter1 = headA;
        }
        while(iter1!=null && iter2!=null){
            if(iter1==iter2)return iter1.data;
            iter1=iter1.next;
            iter2 = iter2.next;
        }
        return -1;
	}