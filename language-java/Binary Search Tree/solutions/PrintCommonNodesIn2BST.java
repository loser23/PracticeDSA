class BST
{
	// print a list containing the intersection of the two BSTs in a sorted order
	public static ArrayList<Integer> printCommon(Node root1,Node root2)
    {
       ArrayList<Integer> list1 = new ArrayList<>();
       ArrayList<Integer> list2 = new ArrayList<>();
       ArrayList<Integer> list = new ArrayList<>();
       inOrder(root1 , list1);
       inOrder(root2 , list2);
       int i = 0;
       int j = 0;
       while( i<list1.size() && j<list2.size()){
           if(list1.get(i).equals(list2.get(j))){
               list.add(list2.get(j));
               i++;
               j++;
           }
           else if(list1.get(i)<list2.get(j))i++;
           else j++;
       }
       //System.out.println(list1+" "+list2+" "+list);
       return list;
    }
    public static void inOrder(Node iter , ArrayList<Integer> list){
        if(iter==null)return ;
        inOrder(iter.left , list);
        list.add(iter.data);
        inOrder(iter.right , list);
    }
}
