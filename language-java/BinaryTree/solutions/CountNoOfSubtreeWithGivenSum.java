class Tree
{   int count ;
    int findSum(Node iter ,int X){
        if(iter==null)return 0;
        int leftSum = findSum(iter.left , X);
        int rightSum = findSum(iter.right ,X);
        int sum = leftSum+rightSum+iter.data;
        if(sum == X)count++;
        return sum ;
    }
    int countSubtreesWithSumX(Node root, int X)
    {   count = 0;
	   findSum(root , X);
	    return count;
    }
}
