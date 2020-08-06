class Solution {
      boolean[] isVisited;
     int timer;
     int[] lowValue;
    int [] visitTime ; 
    public List<List<Integer>> criticalConnections(int noOfVertices , List<List<Integer>> graph){
        List<List<Integer>> list = new ArrayList<>(noOfVertices);
        for(int i=0;i<noOfVertices;i++)list.add(new ArrayList<>());
        for(List<Integer> ele : graph){
            int x = ele.get(0);
            int y = ele.get(1);
            list.get(x).add(y);
            list.get(y).add(x);
        }
        return helpr(noOfVertices,list);
    }
    public List<List<Integer>> helpr(int noOfVertices, List<List<Integer>> graph) {
        timer = 0;
        isVisited = new boolean[noOfVertices];
        lowValue = new int[noOfVertices];
        visitTime = new int[noOfVertices];
        int start = 0;
       List<List<Integer>> artiPoints = new ArrayList<>();
        dfs2(graph, start, -1, artiPoints);
        return artiPoints;
    }
     private  void dfs2(List<List<Integer>> graph, int curr, int parent, List<List<Integer>> artiPoints) {
        isVisited[curr] = true;
        timer++;
        lowValue[curr] = timer;
         visitTime[curr] = timer;
        for (int ele : graph.get(curr)) {
            if (!isVisited[ele])
                dfs2(graph, ele, curr, artiPoints);
            if (ele == parent )
                continue;
            if (lowValue[ele]>visitTime[curr]){
                List<Integer> temp = new ArrayList<>();
                temp.add(curr);
                temp.add(ele);
                artiPoints.add(temp);
            }
            lowValue[curr] = Math.min(lowValue[curr], lowValue[ele]);

        }
    }
}