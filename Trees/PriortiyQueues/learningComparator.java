package Trees.PriortiyQueues;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

public class learningComparator {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for (int val : nums) {
            hmap.put(val, hmap.getOrDefault(val, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for (var x : hmap.entrySet()) {
            minHeap.offer(x);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        ArrayList<Integer> al = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            al.add(minHeap.poll().getKey());
        }

        // Optional: reverse if order matters
        Collections.reverse(al);
        int ans[] = new int[al.size()];
        for(int i=0;i<al.size();i++){
            ans[i] = al.get(i);
        }
        return ans;

    }

    public static void main(String[] args) {

    }
}
