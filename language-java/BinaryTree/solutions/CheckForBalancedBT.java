class Tree
{
    
     /* This function should return tree if passed  tree 
     is balanced, else false. */
    boolean isBalanced(Node root)
    {
    	if(root==null)return true;
  
        int a  =  helpr(root);
         if(a==-1)return false;
         return true;
    }
    int  helpr(Node root){

       if(root==null){
          
           return 0;
       }
       int left = helpr(root.left);
       int right = helpr(root.right);
       
       if(left==-1 || right==-1 || Math.abs(left-right)>1)return -1;
       return 1+Math.max(left,right);
   
    }
}

