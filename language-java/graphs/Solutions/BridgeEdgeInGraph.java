class Solution {

    public boolean isBridge(Graph adj, int s, int e) {
        Set<Integer> set = new HashSet<>();
        dfs(adj,s,set,s,e);
       return !set.contains(e);
        
    }
    private void dfs(Graph g, int curr , Set<Integer> set , int s,int e){
        set.add(curr);
        for(int ele : g.edges[curr]){
            if((s==curr && e==ele)||(s==e && ele==curr))continue;
            else if(!set.contains(ele))
                dfs(g,ele,set,s,e);
        }
    }
}