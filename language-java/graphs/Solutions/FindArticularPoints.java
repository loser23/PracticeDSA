class ArticularPoints{
   /* efficient approach
    * time complexity O(v+e)
    * data requires:
    * a) boolean isVisited array to keep track of visited nodes so far
    * b) a timer which will increments when we visit new node
    * c) an array to store visit time of each node
    * d) an lowValue array to store the minimum of low values of current node and its neighbour nodes
    * e)number of independent children of starting  node
    * f) parent node
    * procedure:
    * a)do dfs from any node
    * b) for every new node we visit in dfs , update the timer and
    *   store visit time and low value as timer
    * c) if the visit time of current node <= low value of any neighbour ,
    *  then it will be a articular point.(Don't check with parent node)
    * d) update the low value with its neigh low values,if updated,then it means there is a back edge found
    * e)Don't do above approach for starting node.For starting node ,
    * if there are >=2 independent children then root node is a articular point
    *
    * significance of low value
    * (low value of a node is the lowest time required to visit that node from
    * root of graph assuming parallel traversal or lowest discovery time reachable
    *  from back edges or tree edges).
    * in easy means: if there is a node and from its children  we can not go to ancestors then
    * removing that node will disconnects its children.
    *
     */
    static boolean[] isVisited;
    static int timer;
    static int[] visitTime;
    static int[] lowValue;
    static int origin;
    static int parentChilds;
    public static Set<Integer> articulationPointEfficient(ArrayList<ArrayList<Integer>> graph , int noOfVertices){
        timer =0;
        visitTime = new int[noOfVertices];
        isVisited = new boolean[noOfVertices];
        lowValue = new int[noOfVertices];
        int start = 0;
        parentChilds =0;
        origin = start;
        Set<Integer> artiPoints = new HashSet<>();
        dfs2(graph  ,start,-1,artiPoints);
        if(parentChilds >1)artiPoints.add(origin);
        return artiPoints;
    }
    private static void dfs2(ArrayList<ArrayList<Integer>> graph , int curr,int parent , Set<Integer> artiPoints ){
        isVisited[curr] = true;
        timer++;
        visitTime[curr] = timer;
        lowValue[curr] = timer;
        for(int ele : graph.get(curr)){
            if(!isVisited[ele]){
                if(curr==origin) parentChilds++;
                dfs2(graph,ele,curr,artiPoints);
            }
            if(ele==parent || curr==origin)
                continue;
            if(visitTime[curr]<=lowValue[ele])
                artiPoints.add(curr);
            lowValue[curr] = Math.min(lowValue[curr], lowValue[ele]);

        }
    }
}