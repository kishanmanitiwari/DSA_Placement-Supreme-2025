package Trees.GenericTrees;
import java.util.ArrayList;

class TreeNode {
    int val;
    ArrayList<TreeNode> children;

    TreeNode(int val) {
        this.val = val;
        this.children = new ArrayList<>();
    }
}

public class GenericTreeLec {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);

        root.children.add(node2);
        root.children.add(node3);
        root.children.add(node4);
        node3.children.add(node5);
        node3.children.add(node6);

        printTree(root,0);

    }

    static void printTree(TreeNode node, int level){
         System.out.println(node.val + " Level - "+ level);

        for (TreeNode child : node.children) {
            printTree(child, level + 1);
        }

    }
    
}

