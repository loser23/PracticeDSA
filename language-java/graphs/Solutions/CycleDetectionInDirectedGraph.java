class DetectCycle
{
    static boolean isCyclic(ArrayList<ArrayList<Integer>> adjList, int V)
    {  
              boolean[] isVisited = new boolean[V];
              for(int i =0;i<V;i++){
                  if(!isVisited[i]){
                      boolean[] presentStack = new boolean[isVisited.length];
                      boolean ans = checkCycle(adjList , i , isVisited , presentStack);
                      if(ans)return  ans;
                  }
              }
              return false;
    }
    static boolean checkCycle(ArrayList<ArrayList<Integer>> adjList,int start ,boolean[] isVisited , boolean[] presentStack ){
        isVisited[start] = true;
        presentStack[start] = true;
        for(int ele : adjList.get(start)){
            if(presentStack[ele])return true;
            if(!isVisited[ele]){
                isVisited[ele] = true;
                boolean ans =checkCycle(adjList , ele , isVisited , presentStack);
                if(ans)return ans;
            }
        }
        presentStack[start] = false;
        return false;
    }
}