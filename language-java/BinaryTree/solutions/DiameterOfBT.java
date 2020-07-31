class Tree {
    /* Complete the function to get diameter of a binary tree */
    int diameter(Node root) {
      int[] arr =helpr(root);
      return arr[1];
    }
    private int[] helpr(Node iter){
          if(iter==null){
              int[] arr = new int[2];
              arr[0] = 0;
              arr[1] = 0;
              return arr;
          }
        int left[] = helpr(iter.left);
        int right[] = helpr(iter.right);
        int[] arr = new int[2];
        arr[1] = Math.max(left[0]+right[0]+1,Math.max(left[1],right[1]));
        arr[0] = Math.max(left[0],right[0])+1;
        return arr;
    }
}
