  boolean search(Node root, int x)
    {
	    if(root==null)
	        return false;
	    if(root.data==x)
	        return true;
	   else if(x<root.data)
	        return search(root.left,x);
	    return search(root.right,x);
    }