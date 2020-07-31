
//approach : make a min heap of first k elements , then from i+1 to n elements if the current element is greater than minimum element in heap ,
// pop and add current element in heap
// finally we we have kth maximum element in heap
public static int KthLargest(int arr[], int n, int k) {
       PriorityQueue<Integer> pq = new PriorityQueue<>(k);
       for(int i = 0;i<k;i++)pq.add(arr[i]);
       for(int i = k;i<n;i++){
           if(pq.peek()<arr[i]){
               pq.poll();
               pq.add(arr[i]);
           }
       }
       return pq.poll();
    }