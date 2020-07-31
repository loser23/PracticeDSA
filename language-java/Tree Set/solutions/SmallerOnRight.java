import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while(testCase-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
           TreeSet<Integer> treeSet = new TreeSet<>();
            int count = 0 ;
            for(int i = n-1;i>=0;i--){
                treeSet.add(arr[i]);
                Set<Integer> set= treeSet.headSet(arr[i]);
                count = Math.max(count , set.size());

            }
            System.out.println(count);

        }
    }
}