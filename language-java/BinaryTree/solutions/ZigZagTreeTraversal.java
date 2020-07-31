class GFG
{
    // return an array containing the zig zag level order traversal of the given tree
    ArrayList<Integer> zigZagTraversal(Node root)
    {
    	Stack<Node> left= new Stack<>(); 
    	Stack<Node> right= new Stack<>();
    	ArrayList<Integer> res = new ArrayList<>();
    	if(root==null)return res;
    	left.push(root);
    	while(!left.empty()){
    	    while( ! left.empty()){
    	        Node x = left.pop();
    	        res.add(x.data);
    	        if(x.left!=null)right.push(x.left);
    	        if(x.right!=null)right.push(x.right);
    	        
    	    }
    	    while(!right.empty()){
    	        Node x =  right.pop();
    	        res.add(x.data);
    	        if(x.right!=null)left.push(x.right);
    	        if(x.left!=null)left.push(x.left);
    	        
    	    }
    	}
    	return res;
    }
}