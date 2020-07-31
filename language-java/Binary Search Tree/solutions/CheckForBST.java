public class Tree
{
    // return true if the given tree is a BST, else return false
    boolean isBST(Node root)
        {
            return check(root , Integer.MIN_VALUE , Integer.MAX_VALUE);
        }
    boolean check(Node iter , int low , int high){
        if(iter==null)return true;
        if(!(iter.data<=high && iter.data>=low))return false;
        return check(iter.left , low , iter.data-1) && 
                    check(iter.right , iter.data+1 , high);
    }
}