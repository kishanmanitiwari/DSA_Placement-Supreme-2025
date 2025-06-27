import java.util.ArrayDeque;
import java.util.Queue;

class BinaryTreeNode {
    int val;
    BinaryTreeNode left;
    BinaryTreeNode right;

    BinaryTreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        BinaryTreeNode node2 = new BinaryTreeNode(2);
        BinaryTreeNode node3 = new BinaryTreeNode(3);
        BinaryTreeNode node4 = new BinaryTreeNode(4);
        BinaryTreeNode node5 = new BinaryTreeNode(5);

        root.left = node2;
        root.right = node3;
        node3.left = node4;
        node3.right = node5;

        bfsLevelWise(root);

        System.out.println(countNodes(root));

        System.out.println(height(root));

        System.out.println(sum(root));

        System.out.println(search(root, 3));


        // printBinaryTreePostorder(root);

    }

    static boolean search(BinaryTreeNode root, int target) {
    if (root == null) return false;
    if (root.val == target) return true;
    return search(root.left, target) || search(root.right, target);
}


    static int sum(BinaryTreeNode root) {
    if (root == null) return 0;
    return root.val + sum(root.left) + sum(root.right);
}

    static int countNodes(BinaryTreeNode root) {
    if (root == null) return 0;
    int leftNodes = countNodes(root.left);
    int rightNodes = countNodes(root.right);

    return leftNodes+rightNodes + 1;
    
}

    static int height(BinaryTreeNode root) {
    if (root == null) return 0;
    int maxBetweenLeftnRight = Math.max(height(root.left), height(root.right));
    return 1 + maxBetweenLeftnRight;
}

    static void printBinaryTreeInorder(BinaryTreeNode node) {
        // recursively

        // base case
        if (node == null) {
            return;
        }

        // reccursive case
        printBinaryTreeInorder(node.left);
        System.out.println(node.val);
        printBinaryTreeInorder(node.right);
    }

    static void printBinaryTreePreorder(BinaryTreeNode node) {
        // recursively

        // base case
        if (node == null) {
            return;
        }

        // reccursive case
        System.out.println(node.val);
        printBinaryTreePreorder(node.left);
        printBinaryTreePreorder(node.right);
    }

    static void printBinaryTreePostorder(BinaryTreeNode node) {
        // recursively

        // base case
        if (node == null) {
            return;
        }

        // reccursive case
        printBinaryTreePostorder(node.left);
        printBinaryTreePostorder(node.right);
        System.out.println(node.val);
    }

    static void bfsLevelWise(BinaryTreeNode root) {
        if (root == null) {
            return; // edge case
        }

        Queue<BinaryTreeNode> q = new ArrayDeque<>();
        q.add(root);

        while (!q.isEmpty()) {
            BinaryTreeNode current = q.poll();
            System.out.println(current.val + " ");

            if (current.left != null)
                q.add(current.left);
            if (current.right != null)
                q.add(current.right);

        }

    }
}
