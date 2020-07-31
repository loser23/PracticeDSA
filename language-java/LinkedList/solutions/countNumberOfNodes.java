 public static int getCountRecursive(Node head)
    {
        if(head==null)return 0;
        return 1+getCount(head.next);
    }
 public static int getCountIterative(Node head)
    {
        if(head==null)return 0;
        int count = 0;
	while(head!=null){
		head=  head.next;
		count++;
	}
	return count;
    }