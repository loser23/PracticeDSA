class GFG {

    static void inOrder(Node root, ArrayList<Integer> list) {
            if (root == null) return;
            inOrder(root.left, list);
            list.add(root.data);
            inOrder(root.right, list);
            
        }
    static boolean findPair(Node root, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root , list);
        int left = 0;
        int right = list.size()-1;
        while(right-left>0){
            if(sum==list.get(left)+list.get(right))return true;
            if(sum>list.get(left)+list.get(right))left++;
            else right--;
        }
        return false;
    }
}
