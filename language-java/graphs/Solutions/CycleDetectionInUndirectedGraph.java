class DetectCycle
{
    static boolean isCyclic(ArrayList<ArrayList<Integer>> adjList, int V)
    {  
        boolean[] isVisited = new boolean[V];
        for(int i=0;i<V;i++){
            if(!isVisited[i]){
                 boolean ans = helpr(adjList , isVisited , i);
                if(ans)return ans;
            }
           
        }
        return false;
    }
    static boolean helpr(ArrayList<ArrayList<Integer>> adjList , boolean[] isVisited,int start){
        Stack<Integer[]> st = new Stack<>();
  
       isVisited[start] = true;
       st.push(new Integer[]{start , -1});
       while(!st.isEmpty()){
           Integer[] x = st.pop();
           ArrayList<Integer> neig = adjList.get(x[0]);
           for(int ele :neig ){
               if( ele!= x[1] && isVisited[ele])return true;
              if(!isVisited[ele]){
                  isVisited[ele] = true;
                  st.push(new Integer[]{ele ,x[0]});
                  
              }
           }
       }
       return false;
    }
}