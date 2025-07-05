package Trees.PriortiyQueues;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQuesLec {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int arr[] = { 1, 3, 5, 8, 9, 2 };
        for (int val : arr) {
            minHeap.offer(val);
        }

        // poll
        System.out.println(minHeap.poll());

        // peek

        System.out.println(minHeap.peek());

        // size
        System.out.println(minHeap.size());

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int val : arr) {
            maxHeap.offer(val);
        }

        // poll
        System.out.println(maxHeap.poll());

        // peek

        System.out.println(maxHeap.peek());

        // size
        System.out.println(maxHeap.size());
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (a, b) -> freq.get(a) - freq.get(b));

        for (int key : freq.keySet()) {
            pq.offer(key);
            if (pq.size() > k)
                pq.poll();
        }

        List<Integer> result = new ArrayList<>();
        while (!pq.isEmpty())
            result.add(pq.poll());
        return result;
    }

}
