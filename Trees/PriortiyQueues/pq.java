package Trees.PriortiyQueues;
import java.util.PriorityQueue;

public class pq {

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode list : lists) {
            if (list != null){
                System.out.println(list);
                pq.offer(list); //array of list is pushed [].[],[]
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (!pq.isEmpty()) {
            ListNode min = pq.poll();
            curr.next = min;
            curr = curr.next;
            if (min.next != null) //last node nahi hai
                pq.offer(min.next);
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.
    }
}
