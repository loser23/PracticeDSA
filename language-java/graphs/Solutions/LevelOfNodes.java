class Level_of_Nodes
{
    
    static int levels(ArrayList<ArrayList<Integer>> list, int start, int end)
    {
       int level  = -1;
        Queue<Integer[]> q = new LinkedList<>();
        boolean[] isVisited =new boolean[list.size()];
        q.add(new Integer[]{start,0});
        isVisited[start] = true;
        while(q.isEmpty()==false){
            Integer[] x = q.poll();
            if(x[0]==end){
                level =x[1];
                break;
            }
            for(int ele : list.get(x[0])){
                if(!isVisited[ele]){
                    isVisited[ele] = true;
                    q.add(new Integer[]{ele ,x[1]+1});
                }
            }
        }
        return level;
       
    }
   
}
