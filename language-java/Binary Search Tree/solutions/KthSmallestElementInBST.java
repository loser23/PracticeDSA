public class KthSmallerElementInBST{
	 // time complexity O(k)
    ArrayList<Integer> list;
    public int kthSmallest1(Node root, int k) {
        list = new ArrayList<>();
        inOrder(root , k);
        return list.get(k-1);

    }
    private void inOrder(Node root,int k){
        if(root==null)return;
        inOrder(root.left , k);
        list.add(root.data);
        if(list.size()==k){
            return;
        }

        inOrder(root.right , k);
    }
}