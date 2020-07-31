class Solution{
    
    // The function returns the root of the BST (currently rooted at 'root') 
    // after inserting a new Node with value 'Key' into it. 
    Node insert(Node node, int data)
    {
        if(node==null){
            node  = new Node(data);
            return node;
        }
        if(node.data>data && node.left==null)node.left = new Node(data);
        else if(node.data<data && node.right==null)node.right = new Node(data);
        else if(node.data>data) insert(node.left,data);
        else insert(node.right,data);
        return node;
    }
 
}