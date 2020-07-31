 int height(Node iter) 
    {
      
       if(iter==null)return 0;
        int count = 1+Math.max(height(iter.left),height(iter.right));
        return count;
     
    }
   