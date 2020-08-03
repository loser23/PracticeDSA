class Solution
{
     public static int kosaraju(ArrayList<ArrayList<Integer>> adjList ,int noOfVertices){
        Stack<Integer> st = new Stack<>();
        boolean[] isVisited = new boolean[noOfVertices];
        for(int i=0;i<noOfVertices;i++)
            if(!isVisited[i])
                dfs1(adjList , st , isVisited , i);
        ArrayList<ArrayList<Integer>>  reverse = new ArrayList<>(noOfVertices);
        for(int i = 0;i<noOfVertices;i++)reverse.add(new ArrayList<>());
        for(int i = 0;i<noOfVertices;i++)
            for(int ele : adjList.get(i))
                reverse.get(ele).add(i);
        isVisited = new boolean[noOfVertices];
        int res = 0;
        while (!st.isEmpty()){
            int ele = st.pop();
            if(isVisited[ele])continue;
            dfs2(reverse  , isVisited , ele);
            res++;
        }
       return res;

    }
    private static void dfs1( ArrayList<ArrayList<Integer>> adjList  ,Stack<Integer> st , boolean[] isVisited , int curr){
        isVisited[curr] = true;
        for(int ele : adjList.get(curr))
            if(!isVisited[ele])dfs1(adjList , st , isVisited , ele);

        st.push(curr);
    }
    private static void dfs2(ArrayList<ArrayList<Integer>> reverse , boolean[] isVisited  , int curr){
        isVisited[curr] = true;
        for(int ele : reverse.get(curr) )
            if(!isVisited[ele]){
                dfs2(reverse , isVisited , ele);
            }
    }

}
