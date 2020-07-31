class Tree
{
    int left;
    int right;
    
    public ArrayList <Integer> bottomView(Node root)
    {   left =0;
        right = 0;
        Map<Integer ,Integer> map = new HashMap<>();
        view(root ,0, map);
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=left ; i<=right ; i++)list.add(map.get(i));
        return list;
    }
    private void view( Node root , int pos , Map<Integer , Integer> map){
        if(root==null)return;
        left = Math.min(left ,  pos);
        right = Math.max(right ,pos);
        map.put(pos , root.data);
        view(root.left ,pos-1 , map);
        view(root.right , pos+1 ,map);
        
    }
}