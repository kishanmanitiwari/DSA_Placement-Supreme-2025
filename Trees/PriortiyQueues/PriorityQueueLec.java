package Trees.PriortiyQueues;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueLec {

     public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (var elem : nums) {
            minHeap.offer(elem);
            if (minHeap.size()>k) {
                minHeap.poll(); //AT any give you store K largest element only rest goes out
            }
        }
        return minHeap.peek();   
    }
    //Top K ELements / Top Small Elements - Brambhastra
    public static void main(String[] args) {

     



        PriorityQueue<Integer> minPq = new PriorityQueue<>();
        // offer - poll - peek
        minPq.offer(10);
        minPq.offer(8);
        minPq.offer(2);
        minPq.offer(6);
        minPq.offer(12);

        System.out.println(minPq.poll()); //2
        System.out.println(minPq.poll()); // 6

        System.out.println(minPq.peek()); //8

        System.out.println("Iske neeche maxPQ ka ans hai");
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Comparator.reverseOrder());
        // offer - poll - peek
        maxPq.offer(10);
        maxPq.offer(8);
        maxPq.offer(2);
        maxPq.offer(6);
        maxPq.offer(12);

        System.out.println(maxPq.poll()); //12
        System.out.println(maxPq.poll()); //10 

        System.out.println(maxPq.peek()); //8

    }
}
