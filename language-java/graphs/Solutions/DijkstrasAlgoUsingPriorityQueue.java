  public static int[] dijkstras( ArrayList<ArrayList<Integer[]>> adjList , int noOfVertices,int start){
        //time comlexity O(eloge)
        // take the nearest node to source update its neighbour distance , do this until you visited all nodes
        //approach : use a priority queue which gives the shortest distant node from source which is not visited yet
        //take out the next shortest node from priority queue , mark it as visited
        // and relax all of its adjuscent nodes and only add those adjuscent
        // which are not visited and have been relaxed
        //
        int[] distance = new int[noOfVertices];
        Arrays.fill(distance , Integer.MAX_VALUE);
        distance[start] = 0;
        boolean[] isVisited = new boolean[noOfVertices];
        PriorityQueue<Integer[]> pq = new PriorityQueue<>(new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[1] - o2[1];
            }
        });
        pq.add(new Integer[]{start , 0});
        while (!pq.isEmpty()){
            Integer[] nearest =  pq.poll();
            if(isVisited[nearest[0]])continue;
            isVisited[nearest[0]] = true;
            for(Integer[] neig : adjList.get(nearest[0])){
                int z = nearest[1] + neig[1];
                if(!isVisited[neig[0]] && z<distance[neig[0]]){   //does not matter if we put condition isVisited
                    distance[neig[0]] =z;                         // here because the visited nodes are finalised
                    pq.add(new Integer[]{neig[0] ,z });           //  with minimum distance so any other path
                                                                //  of visited node gives more distance./
                }
            }
        }
        return distance;
    }
}