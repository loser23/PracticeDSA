class Adjacency 
{
    static void printGraph(ArrayList<ArrayList<Integer>> adjList, int noOfVertices)
	{
	     for(int i = 0; i<noOfVertices ; i++){
	            ArrayList<Integer> list = adjList.get(i);
	            System.out.print(i);
	            for(int j = 0 ; j<list.size();j++)System.out.print("-> "+list.get(j));
	            System.out.println();
	        }
	}
}