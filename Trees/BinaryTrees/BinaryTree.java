package PipeLinesTrees.BinaryTrees;
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
        BinaryTreeNode node6 = new BinaryTreeNode(6);
        BinaryTreeNode node7 = new BinaryTreeNode(7);

        root.left = node2;
        root.right = node3;
        node3.left = node4;
        node3.right = node5;
        node2.left = node6;
        node2.right = node7;

        // printBinaryTreePreorder(root);
        // printBFSLevelOrder(root);
        // System.out.println(countNodes(root));
        // System.out.println(height(root));
        // System.out.println(countSumDFS(root));
        //System.out.println(search(root, 7));

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

    static void printBFSLevelOrder(BinaryTreeNode root) {
        // edge
        if (root == null) {
            return; // nothing to print
        }

        Queue<BinaryTreeNode> q = new ArrayDeque<>();
        q.offer(root);

        while (!q.isEmpty()) {
            BinaryTreeNode currentNode = q.poll();
            System.out.println(currentNode.val);

            // do u have a child?
            if (currentNode.left != null) {
                q.offer(currentNode.left);
            }

            if (currentNode.right != null) {
                q.offer(currentNode.right);
            }
        }
    }

    static int countNodes(BinaryTreeNode root) {
        // recursion - base - recursive case - kaam

        if (root == null) {
            return 0; // kya hi count karu
        }

        int leftSubtreeKaCount = countNodes(root.left);
        int rightSubtreeKaCount = countNodes(root.right);

        return leftSubtreeKaCount + rightSubtreeKaCount + 1;
    }

    static int height(BinaryTreeNode root) {
        // recursion - base - recursive case - kaam

        if (root == null) {
            return 0; // kya hi height hai teri
        }

        int leftSubtreeKaHeight = height(root.left);
        int rightSubtreeKaHeight = height(root.right);

        int maximumOfTwo = Math.max(leftSubtreeKaHeight, rightSubtreeKaHeight);

        return maximumOfTwo + 1; // +1? - root
    }

    static int countSumBFS(BinaryTreeNode root) {
        // edge
        if (root == null) {
            return 0; // nothing to print
        }

        Queue<BinaryTreeNode> q = new ArrayDeque<>();
        q.offer(root);
        int count = 0;

        while (!q.isEmpty()) {
            BinaryTreeNode currentNode = q.poll();
            count += currentNode.val;

            // do u have a child?
            if (currentNode.left != null) {
                q.offer(currentNode.left);
            }

            if (currentNode.right != null) {
                q.offer(currentNode.right);
            }
        }

        return count;
    }

    static int countSumDFS(BinaryTreeNode root) {
        // recursion - base - recursive case - kaam

        // if (root == null) {
        // return 0; // kya hi height hai teri
        // }

        // int leftSubtreeKaSum = height(root.left);
        // int rightSubtreeKaSum = height(root.right);

        // return leftSubtreeKaSum + rightSubtreeKaSum + root.val; // +1? - root

        if (root == null)
            return 0;
        return root.val + countSumDFS(root.left) + countSumDFS(root.right);
    }

    static boolean search(BinaryTreeNode root, int target) {
        if (root == null) {
            return false; // null hai to false
        }

        if (root.val == target) {
            return true; // root h target hai
        }

        // recursion - left mein dhudho right me dhduni

        boolean leftMeinHaiKya = search(root.left, target);
        boolean rightMeinHaiKya = search(root.right, target);

        return leftMeinHaiKya || rightMeinHaiKya;
    }
}
