import javax.swing.tree.TreeNode;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class BinarySearchTreeLec {
    public static void main(String[] args) {
        Node root = null;
        // root = insertInBST(root, 10);
        // root = insertInBST(root, 8);
        // root = insertInBST(root, 12);

        // inorderBST(root);

        // System.out.println(searchInBST(root, 18));
        // System.out.println(findMinimum(root)); // 8
        // System.out.println(findMaximum(root)); // 12
        // System.out.println(findMinItr(root)); // 8
        // System.out.println(findMaxItr(root)); // 12

        int bt[] = { 5, 3, 10, 2, 4, 8, 6, 9, 12, 14 };
        for (int i : bt) {
            root = insertInBST(root, i);
        }
        System.out.println("Before deletinon");
        inorderBST(root);

        root = delete(root, 8);
        System.out.println("After deletion");
        inorderBST(root);
    }

    static Node insertInBST(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        // data > root.Val - right
        // data <root.val - left subtree

        if (data < root.val) {
            root.left = insertInBST(root.left, data);
        }

        if (data > root.val) {
            root.right = insertInBST(root.right, data);
        }

        return root;
    }

    static void inorderBST(Node root) {
        if (root == null) {
            return;
        }

        inorderBST(root.left);
        System.out.println(root.val);
        inorderBST(root.right);

    }

    static boolean searchInBST(Node root, int target) {
        if (root == null) {
            return false;
        }

        if (root.val == target) {
            return true;
        }

        if (target < root.val) {
            return searchInBST(root.left, target);
        } else {
            return searchInBST(root.right, target);
        }
    }

    static int findMinimum(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        int leftSubTreeMin = findMinimum(root.left);

        return Math.min(leftSubTreeMin, root.val);
    }

    static int findMaximum(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        int rightSubTreeMax = findMinimum(root.right);

        return Math.max(rightSubTreeMax, root.val);
    }

    static int findMinItr(Node root) {
        if (root == null) {
            System.out.println("Root is null");
            return -1;
        }

        while (root.left != null) {
            root = root.left;
        }

        return root.val;
    }

    static int findMaxItr(Node root) {
        if (root == null) {
            System.out.println("Root is null");
            return -1;
        }

        while (root.right != null) {
            root = root.right;
        }

        return root.val;
    }

    static Node delete(Node root, int target) {
        if (root == null) {
            return null;
        }

        // rec case
        if (target < root.val) {
            root.left = delete(root.left, target);
        } else if (target > root.val) {
            root.right = delete(root.right, target);
        } else {
            // root - Jisko delete
            // case1 : no children
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2 : 1 children

            if (root.left == null) {
                return root.right;
            }

            if (root.right == null) {
                return root.left;
            }

            // case 3: child
            // 1) inorder sucessor
            int inorderSucessor = findMinItr(root.right);
            root.val = inorderSucessor;
            root.right = delete(root.right, inorderSucessor);
        }

        return root;
    }

    public boolean isValidBST(Node root) {
        return isValidBSTHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidBSTHelper(Node root, long minValue, long maxValue) {
        if (root == null) {
            return true;
        }

        if (root.val >= maxValue || root.val <= minValue) {
            return false;
        }

        boolean leftSearchTreeResult = isValidBSTHelper(root.left, minValue, root.val);
        boolean rightSearchTreeResult = isValidBSTHelper(root.right, root.val, maxValue);

        return leftSearchTreeResult && rightSearchTreeResult;

    }

     public Node lowestCommonAncestor(Node root, Node p, Node q) {
        if (root == null) {
            return null;
        }

        if(p.val < root.val && q.val <root.val){
            root = root.left;
        }else if(p.val > root.val && q.val > root.val){
            root = root.right;
        }else{
            // either same either it is not diverging

            return root;
        }

        return root;
    }
}
