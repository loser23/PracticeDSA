class Solution{
    // Return a integer of integers having all the nodes in both the BSTs in a sorted order.
    public List<Integer> merge(Node root1,Node root2)
    {
      List<Integer> list = new ArrayList<>();
      ArrayList<Integer> list1 = new ArrayList<>();
      ArrayList<Integer> list2 = new ArrayList<>();
      inOrder(root1 , list1);
      inOrder(root2 ,list2);
      List<Integer> res = new ArrayList<>();
      mergeList(list1 , list2 , res);
      return res;
        
    }
    private void mergeList(ArrayList<Integer> list1,ArrayList<Integer> list2, List<Integer> res){
        int i = 0;
        int j = 0;
        while(i<list1.size() && j<list2.size()){
            if(list1.get(i)<=list2.get(j)){
                res.add(list1.get(i));
                i++;
            }
            else{
                 res.add(list2.get(j));
                 j++;
            }
                
        }
        while(i<list1.size())
            res.add(list1.get(i++));
        while(j<list2.size())
            res.add(list2.get(j++));
    }
    private void inOrder(Node root , ArrayList<Integer> list){
        if(root==null)return;
        inOrder(root.left, list);
        list.add(root.data);
        inOrder(root.right , list);
    }
}
