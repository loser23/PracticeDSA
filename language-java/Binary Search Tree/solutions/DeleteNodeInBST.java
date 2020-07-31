class Tree
{
    // Return the root of the modified BST after deleting the node with value X
	public static Node deleteNode(Node root, int ele)
	{   if(root==null)return null;
	    if(root.data==ele && root.left==null && root.right==null)return null;
	    else if(root.data==ele && root.left!=null){
	        Node iter = root;
	        int temp = findMax(root.left);
	        root.data = temp;
	        root.left = deleteNode(root.left , temp);
	        return root;
	    }
	    else if(root.data==ele){
	        Node iter = root ;
	        int temp = findMin(root.right);
	        root.data = temp;
	        root.right =deleteNode(root.right , temp);
	        return root;
	    }
	    else if (root.data>ele)root.left = deleteNode(root.left , ele);
	    else root.right = deleteNode(root.right,ele);
	    return root;
	}
	private static int findMin(Node iter){
	    while(iter.left!=null)iter =iter.left;
	    return iter.data;
	}
	private static int findMax(Node iter){
	    while(iter.right!=null)iter =iter.right;
	    return iter.data;
	}
}	