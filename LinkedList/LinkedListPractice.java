import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class LinkedListPractice {
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(10);
        ListNode third = new ListNode(10);
        head.next = second;
        second.next = third;
        third.next = null;
        boolean ans = hasCycle(head);
        System.out.println(ans);

    }

    public static boolean hasCycle(ListNode head) {
        ListNode temp = head;
        HashSet<ListNode> set = new HashSet<>();
        boolean flag = false;
        while (!flag && temp != null) {
            if (set.add(temp) == false) {
                flag = true;
                System.out.println(set);
                break;
            } else {
                set.add(temp);
                temp = temp.next;
            }
        }

        return flag;
    }

    public static boolean hasCycleImproved(ListNode head) {
        // Slow - fast pattern
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                // they will meet only if there is cycle
                return true;
            }
        }

        return false;

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev = new ListNode(0); // head track
        ListNode curr = prev;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            int myAdditionValueWithoutCarry = sum % 10;
            curr.next = new ListNode(myAdditionValueWithoutCarry);
            curr = curr.next;

        }
        return prev.next;

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode(0);
        ListNode curr = dummyNode;
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while (temp1 != null && temp2 != null) {
            // compare the nodes
            if (temp1.val <= temp2.val) {
                curr.next = new ListNode(temp1.val);
                temp1 = temp1.next;
            } else {
                curr.next = new ListNode(temp2.val);
                temp2 = temp2.next;
            }
            curr = curr.next;

        }

        // either l1 is null or n2 is
        // Attach remaining nodes
        while (temp1 != null) {
            curr.next = new ListNode(temp1.val);
            temp1 = temp1.next;
            curr = curr.next;
        }

        while (temp2 != null) {
            curr.next = new ListNode(temp2.val);
            temp2 = temp2.next;
            curr = curr.next;
        }

        return dummyNode.next; // head
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        // Base case
        if (head == null)
            return null;

        // Step 1: Check if there are at least k nodes ahead
        ListNode check = head;
        for (int i = 0; i < k; i++) {
            if (check == null)
                return head; // Less than k nodes: don't reverse
            check = check.next;
        }

        // Step 2: Reverse first k nodes
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        for (int i = 0; i < k && curr != null; i++) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Recursively reverse the rest and attach
        head.next = reverseKGroup(curr, k);

        return prev; // New head of this reversed group
    }

      public ListNode partition(ListNode head, int x) {
        ListNode before = new ListNode(0);
        ListNode beforeCurr = before;
        ListNode after = new ListNode(1);
        ListNode afterCurr = after;

        ListNode temp = head;
        while (temp!=null) {
            if (temp.val<x) {
                beforeCurr.next = new ListNode(temp.val);
                beforeCurr = beforeCurr.next;
            } else {
                afterCurr.next = new ListNode(temp.val);
                afterCurr = afterCurr.next;
            }
            temp = temp.next;
        }
    
        
        beforeCurr.next = after.next;

        return before.next; //head
    }
}
