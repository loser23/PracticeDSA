/**
     *
     * time complexity o(v+e)...requires 1 dfs traversal only.
     * Disclaimer : don't check for low value of neighbour are equal, it only works when
     * there is no cross edge, it fails when there are cross edges present.
     * (cross edge : when a node points to a node which is not ancestor of it).
     *approach :
     * make use of lowValue and visit time arrays.
     * also make a stack that contains the nodes which are currently visited while doing dfs.
     * while doing dfs , add node u to stack and when all neighbours v of it are visited ,
     * update the low of u with all v only if v is present in stack.(this will look after cross edge)
     * then if the visit time of u is = low value of u then it means ,it is a start of
     * SCC(strongly connected components), so pop all elements from stack until we find u.
     *do this for all nodes which are not visited yet.
     *
     */
class Solution
{   
    boolean[] isVisited;
     Stack<Integer> currStack;
     Set<Integer> stackElements;
     int[] visitTime;
     int[] lowValue;
     int timer;
    StringBuilder sb ; 
    public void find(ArrayList<ArrayList<Integer>> graph, int noOfVertices)
    {
        timer =0;
        isVisited = new boolean[noOfVertices];
        currStack = new Stack<>();
        visitTime = new int[noOfVertices];
        lowValue = new int[noOfVertices];
        stackElements = new HashSet<>();
        sb =new StringBuilder();
        for(int i=0;i<noOfVertices;i++)
            if(!isVisited[i])
                dfs(graph ,i );
        System.out.print(sb);
    }
    private  void dfs(ArrayList<ArrayList<Integer>> graph,int curr){
        isVisited[curr] = true;
        currStack.push(curr);
        stackElements.add(curr);
        timer++;
        visitTime[curr] = timer;
        lowValue[curr] =timer;
        for(int ele : graph.get(curr)){
            if(!isVisited[ele])
                dfs(graph,ele);
            if(stackElements.contains(ele))
                lowValue[curr] = Math.min(lowValue[curr],lowValue[ele]);
        }
        if(lowValue[curr]==visitTime[curr]){
            
            while ( currStack.peek()!=curr){
                int x = currStack.pop();
                stackElements.remove(x);
                sb.append(x).append(" ");
            }
            int x = currStack.pop()  ;
            stackElements.remove(x);
            sb.append(x).append(",");
            
        }
    }
}