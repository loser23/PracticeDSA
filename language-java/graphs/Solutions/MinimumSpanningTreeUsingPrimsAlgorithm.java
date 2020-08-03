class MST {
    static int spanningTree(int V, int E, ArrayList<ArrayList<Integer>> graph) {
        ArrayList<ArrayList<Integer[]>> list=  new ArrayList<>();
        for(int i=0;i<V;i++)list.add(new ArrayList<>());
        for(int i = 0;i<V;i++){
            ArrayList<Integer> neig = graph.get(i);
            for(int j = 0;j<neig.size();j++){
                int z = neig.get(j);
                if(z!=Integer.MAX_VALUE){
                    list.get(i).add(new Integer[]{j ,z });
                    list.get(j).add(new Integer[]{i , z});
                }
            }
                
        }
        return primsLazy(list , V);
    }
private static int primsLazy(ArrayList<ArrayList<Integer[]>> adjList , int noOfVertices){
        //time complexity O(e * loge) ; e = no of edges
        // approach : maintain a boolean array which keep track of elements visited so far.
        // start from any node .Mark it visited and add all its neighbour to priority queue
        // use priority queue which gives us next shortest path node which is not visited till now.
        // mark it visited and add all its neighbour to priority queue which are not visited yet,
        // do this until all nodes are visited.
        boolean[] isVisited = new boolean[noOfVertices];
        PriorityQueue<Integer[]> pq = new PriorityQueue<>(new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[1] - o2[1];
            }
        });
        isVisited[0] = true;
        for(Integer[] ele : adjList.get(0))
            pq.add(ele);
        int cost = 0;
        int count = 1;
        while (count<noOfVertices){
            while (isVisited[pq.peek()[0]])pq.poll();
            Integer[] nextNode =pq.poll();
            System.out.println(Arrays.toString(nextNode));
            cost+=nextNode[1];
            count++;
            isVisited[nextNode[0]] = true;
            for(Integer[] ele :adjList.get(nextNode[0]) )
                if(!isVisited[ele[0]])pq.add(ele);

        }
        return cost;

    }

}
