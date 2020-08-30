public class Tree {

    public static void main(String[] args) {
        Node root=new Node(5);
        insert(root,2);
        insert(root,4);
        insert(root,6);
        insert(root,8);
        insert(root,3);
        insert(root,9);
        insert(root,5);
        System.out.println("Traversing tree in order");
        traverseInOrder(root);
        System.out.println(isPresent(root,1));
    }
    static class Node{

        int value;
        Node left, right;

        Node(int value){
            this.value=value;
            left=null;
            right=null;
        }
    }
    public static void insert(Node node, int value){
    if(value < node.value){
        if(node.left != null){
            insert(node.left,value);
        }else{
            System.out.println("insert"+value+"to left of"+node.value);
            node.left=new Node(value);
        }
        }else if(value> node.value){
        if(node.right != null){
            insert(node.right,value);
        }else{
            System.out.println("insert"+value+"to right of"+node.value);
            node.right= new Node(value);
        }
    }
    }

    public static void traverseInOrder(Node node){

        if(node != null){
            traverseInOrder(node.left);
            System.out.println(" "+node.value);
            traverseInOrder(node.right);
        }

    }

    public static boolean isPresent(Node root, int x){

        if(root != null){

            if(root.value== x){
                return  true;
            }else{
                return isPresent(root.left,x) || isPresent(root.right,x);
            }
        }
        return false;

    }
}
