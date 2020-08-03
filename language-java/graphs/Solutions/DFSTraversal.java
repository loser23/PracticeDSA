class Traversal
{
    static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> g, int N)
    {
       boolean[] isVisited = new boolean[N];
       ArrayList<Integer> list = new ArrayList<>();
       traversal(g , list , isVisited , 0);
       return list;
    }
    private static void traversal(ArrayList<ArrayList<Integer>> g ,ArrayList<Integer> list,boolean[] isVisited , int start ){
        ArrayList<Integer> temp = g.get(start);
        isVisited[start] = true;
         list.add(start);
        for(int ele : temp){
            if(!isVisited[ele]){
               traversal(g , list , isVisited , ele);
            }
        }
    }
}
