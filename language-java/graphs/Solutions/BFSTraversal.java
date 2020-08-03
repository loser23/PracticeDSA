class Traversal {
    static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adjList, int N) {
        int start = 0;
        Queue<Integer> q = new LinkedList<>();
        boolean[] arr = new boolean[N];
        q.add(start);
        arr[start] = true;
        ArrayList<Integer> list = new ArrayList<>();
        while(!q.isEmpty()){
            int x = q.poll();
            list.add(x);
            ArrayList<Integer> temp = adjList.get(x);
            for(int ele : temp){
                if(!arr[ele]){
                    arr[ele] = true;
                    q.add(ele);
                }
            }
        }
        return list;
        
    }
}
