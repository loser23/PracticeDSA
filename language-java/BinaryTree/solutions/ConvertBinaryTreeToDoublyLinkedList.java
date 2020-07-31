class GfG
{   Node head;
    Node prev;
    Node bToDLL(Node root)
    {
	    head=null;
	    prev = null;
	    convert(root);
	    return head;
    }
    void convert(Node curr){
        if(curr == null)return;
        convert(curr.left );
        
        curr.left = prev;
        if(prev==null){
            head = curr;
        }else
            prev.right = curr;
        prev = curr;
        convert(curr.right);
        
    }
}