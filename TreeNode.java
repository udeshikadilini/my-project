public class TreeNode {

    public static void main(String[] args) {
        Node root = new Node(5);
        System.out.println("Binary Tree Example");
        System.out.println("Building tree with root value " + root.value);
        insert(root, 2);
        insert(root, 4);
        insert(root, 8);
        insert(root, 6);
        insert(root, 7);
        insert(root, 3);
        insert(root, 9);
        System.out.println("Traversing tree in order");

//        deleteRecursive(root,8);
        traverseInOrder(root);
        System.out.println(isPresent(root,1));
    }

    static class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    public static void insert(Node node, int value) {
        if (value < node.value) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                System.out.println(" Inserted " + value + " to left of " + node.value);
                node.left = new Node(value);
            }
        } else if (value > node.value) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                System.out.println("  Inserted " + value + " to right of "
                        + node.value);
                node.right = new Node(value);
            }
        }
    }

    public static void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }

//    private static Node deleteRecursive(Node root, int value) {
//        if(root == null) return root;
//
//        if(data < root.getData()) {
//            root.setLeft(deleteNode(root.getLeft(), data));
//        } else if(data > root.getData()) {
//            root.setRight(deleteNode(root.getRight(), data));
//        } else {
//            // node with no leaf nodes
//            if(root.getLeft() == null && root.getRight() == null) {
//                System.out.println("deleting "+data);
//                return null;
//            } else if(root.getLeft() == null) {
//                // node with one node (no left node)
//                System.out.println("deleting "+data);
//                return root.getRight();
//            } else if(root.getRight() == null) {
//                // node with one node (no right node)
//                System.out.println("deleting "+data);
//                return root.getLeft();
//            } else {
//                // nodes with two nodes
//                // search for min number in right sub tree
//                Integer minValue = minValue(root.getRight());
//                root.setData(minValue);
//                root.setRight(deleteNode(root.getRight(), minValue));
//                System.out.println("deleting "+data);
//            }
//        }
//
//        return root;
//    }

    public static boolean isPresent(Node root, int x) {
        if (root != null) {

            // check if current node has the element we are looking for
            if (root.value == x) {
                return true;
            } else {
                // check if the sub trees
                return isPresent(root.left, x) || isPresent(root.right, x);
            }
        }

        return false;
    }
}
