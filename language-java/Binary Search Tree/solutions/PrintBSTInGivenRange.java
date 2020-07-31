class Solution
{   
	public static ArrayList<Integer> printNearNodes(Node root, int low, int high)
	{
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root  , low , high , list);
        return list;
    }
    static void inOrder(Node root , int low , int high ,ArrayList<Integer> v){
        if(root==null)return;
        inOrder(root.left , low ,high ,v);
        if(root.data>=low && root.data<=high)v.add(root.data);
        inOrder(root.right , low , high ,v);
    }
    
}