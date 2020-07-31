class Tree
{       int min;
        int max ;
        int count;
        public int verticalWidth(Node root)
        {    count = 0;
            if(root==null)return 0;
             min = 0;
             max = 0;
            find(root,0);
            return count+1;
        }
         void find(Node iter ,int curr){
            if(iter==null)return;
            if(curr<min){
                min=curr;
                count++;
            }
             if(curr>max){
                max = curr;
                count++;
            }
            find(iter.left , curr-1);
            find(iter.right,curr+1);
        }
    

}