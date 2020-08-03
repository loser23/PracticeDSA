public class TopologicalSort {
    //time complexity O(v+e)
    //approach , we use inDegree array  to hold indegrees ( parents) for each node(index is node value).
    // if indegree of a node is 0 then it means that node is not dependent on any other node
    //we take a queue in which we only add those nodes whose indegree is 0
    // we poll from queue and reduce the indegree of all it neighbour(child)
    // we add only those neighbour whose indegree is 0
    static int[] topoSort(ArrayList<ArrayList<Integer>> adj, int v) {
        int[] inDegree = new int[v];
        for(ArrayList<Integer> list : adj){
            for(int ele : list)
                inDegree[ele]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0;i<v;i++)
            if(inDegree[i]==0)
                q.add(i);
        int[] res = new int[v];
        int i = 0;
        while(!q.isEmpty()){
            int x = q.poll();
            res[i++] = x;
            for(int ele : adj.get(x)){
                inDegree[ele]--;
                if(inDegree[ele]==0)q.add(ele);
            }

        }
        return res;
    }
}
