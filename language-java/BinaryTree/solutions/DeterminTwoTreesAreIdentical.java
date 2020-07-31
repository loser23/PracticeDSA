	boolean isIdentical(Node root1, Node root2)
	{

        if(r1==null && r2==null)return true;
        if(r1==null && r2!=null || r1!=null && r2==null)return false;
        if(r1.data!=r2.data)return false;
        return isIdentical(r1.left,r2.left) && isIdentical(r1.right,r2.right);
    }