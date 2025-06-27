package PipeLinesTrees.BinaryTrees;
class BinaryNode {
    int data;
    BinaryNode left, right;

    BinaryNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}


public class BinaryTrees {
    public static void main(String[] args) {
        BinaryNode root = new BinaryNode(1);
        root.left = new BinaryNode(2);
        root.right = new BinaryNode(3);
        root.right.left = new BinaryNode(4);
        root.right.right = new BinaryNode(5);

        System.out.println("In-order Traversal:");
        inOrder(root);
    }

    // In-order Traversal (Left - Root - Right)
    public static void inOrder(BinaryNode node) {
        if (node == null) return;

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }
}
