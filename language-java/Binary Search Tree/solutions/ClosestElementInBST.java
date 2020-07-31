class Solution
{
    static int closest ;
    static int maxDiff(Node  root, int key) 
    { 
        closest = 0;
        minDiff(root , key);
        return Math.abs(closest - key);
        
    } 
    static void minDiff(Node root , int key){
        
       if(root==null)return ;
       if(Math.abs(closest-key)>Math.abs(key - root.data))closest = root.data;
       if(root.data>key) minDiff(root.left , key);
       else minDiff(root.right , key);
        
        
    }
}

