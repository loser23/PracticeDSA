 int tour(int petrol[], int distance[])
    {
	    int n = distance.length;
	    long prevPet = 0L;
	    long currPet = 0L;
	    int start = 0;
	    for(int i=0;i<n;i++){
	        currPet+=petrol[i]-distance[i];
	        if(currPet<0){
	            prevPet+=currPet;
	            start = i+1;
	            currPet = 0L;
	        }
	    }
	    if(prevPet+currPet>=0)return start;
	    return -1;
      
    }