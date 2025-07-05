import Node;

package Trees.BST;
class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BSTLec {
    public static void main(String[] args) {
        Node root = null;
        int[] arr = { 8, 3, 10, 1, 6, 14, 4, 7, 13 };
        for (int val : arr) {
            root = insertBST(root, val);
        }

        inorder(root);
        System.out.println(search(root, 7));
        System.out.println(findMin(root));
        System.out.println(findMax(root));
    }

    static Node insertBST(Node root, int val) {
        if (root == null) {
            return root = new Node(val);
        }

        if (val < root.val) {
            root.left = insertBST(root.left, val); // ✅ fix here
        } else if (val > root.val) {
            root.right = insertBST(root.right, val); // ✅ fix here
        }

        return root;
    }

    static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }

    static boolean search(Node root, int target) {
        if (root == null) {
            return false;
        }

        if (root.val == target) {
            return true;
        }

        if (root.val < target) {
            return search(root.right, target);
        } else {
            return search(root.left, target);
        }
    }

    static int findMin(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE; // Safe default for min
        }

        int leftMin = findMin(root.left);
        return Math.min(root.val, leftMin);
    }

    static int findMax(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE; // Safe default for max
        }

        int rightMax = findMax(root.right);
        return Math.max(root.val, rightMax); // ✅ correct
    }

}
