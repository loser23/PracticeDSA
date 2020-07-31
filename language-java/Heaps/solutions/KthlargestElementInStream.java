package Heap;

import java.util.ArrayList;
import java.util.PriorityQueue;
public class KthlargestElementInStream {
    public void kthLargest(int arr[], int n, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        int[] res = new int[n];

        for(int i=0;i<n ; i++){
            if(i<k){
                pq.add(arr[i]);
                res[i] = -1;
                if(i==k-1)res[i] = pq.peek();
            }
            else{
                if(pq.peek()<arr[i])
                {
                    pq.poll();
                    pq.add(arr[i]);
                }
                res[i] = pq.peek();
            }

        }
        for(int ele : res)System.out.print(ele+" ");
    }
}
