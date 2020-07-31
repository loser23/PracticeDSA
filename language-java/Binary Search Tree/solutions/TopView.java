class View
{   static class data{
        int pos ;
        Node temp;
        public data(int position ,Node node){
            pos = position;
            temp = node;
        }
    }
    static int left;
    static int right;
    static Queue<data> q;
    static LinkedList<Integer> list;
    static void topView(Node root)
    {
        left = 0;
         right = 0;
        q = new LinkedList<>();
        list = new LinkedList<>();
        q.add(new data(0 , root));
        list.add(root.data);
        while(q.size()>0){
            data x = q.poll();
            int pos = x.pos;
            Node iter = x.temp;
            if(pos<left){
                list.addFirst(iter.data);
                left = pos;
            }
            if(pos>right){
                list.addLast(iter.data);
                right = pos;
            }
            if(iter.left!=null)q.add(new data(pos-1 , iter.left));
            if(iter.right!=null)q.add(new data(pos+1 , iter.right));
            
        }
        for(int ele: list)System.out.print(ele+" ");
       
    }
   
}