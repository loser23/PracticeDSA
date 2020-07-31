class BinaryTree
{   static class data{
        int pos ; 
        Node root;
        public data(int pos , Node node){
            this.pos = pos;
            root = node;
        }
    }
    static ArrayList <Integer> verticalOrder(Node root)
    {
       Queue<data> q = new LinkedList<>();
       Map<Integer , ArrayList<Integer> > map = new HashMap<>();
       q.add(new data(0 , root));
       int left = 0;
       int right = 0;
       while(!q.isEmpty()){
           data x = q.poll();
           int pos = x.pos;
           Node iter = x.root;
           left = Math.min(left , pos);
           right = Math.max(right , pos);
           if(!map.containsKey(pos))map.put(pos , new ArrayList<>());
           map.get(pos).add(iter.data);
           if(iter.left!=null)q.add(new data(pos-1 , iter.left));
           if(iter.right!=null)q.add(new data(pos+1 , iter.right));
       }
       //System.out.println(map);
       ArrayList<Integer> list = new ArrayList<>();
       for(int i=left  ; i<=right ; i++){
           ArrayList<Integer> temp = map.get(i);
           list.addAll(temp);
       }
       return list;
    }
    
}