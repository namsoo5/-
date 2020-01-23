
public class 매일190804 {

    static class BinaryTree{
        BinaryTree left;
        BinaryTree right;
        int value;

        public BinaryTree(int value){
            this.value = value;
        }

        public void add(BinaryTree node){
            if(this.value < node.value ){
                if(this.right != null){
                    this.right.add(node);
                }else{
                    this.right = node;
                }
            }else{
                if(this.left != null){
                    this.left.add(node);
                }else{
                    this.left = node;
                }
            }
        }

        public void printNode(){
            System.out.println(value);
            if(this.left != null){
                left.printNode();
            }
            if(this.right != null){
                right.printNode();
            }
        }
    }

    static BinaryTree treeSet(){
        BinaryTree root = new BinaryTree(4);
        BinaryTree node1 = new BinaryTree(1);
        BinaryTree node2 = new BinaryTree(2);
        BinaryTree node3 = new BinaryTree(3);
        BinaryTree node4 = new BinaryTree(5);
        BinaryTree node5 = new BinaryTree(6);

        root.add(node3); //3
        root.add(node1); //1
        root.add(node2); //2

        root.add(node4); //5
        root.add(node5); //6

        root.printNode();

        return root;
    }

    public static void main(String[] args) {
        BinaryTree input = treeSet();
        solution(input);
    }

    static void solution(BinaryTree root){
        decalNode(root);
        System.out.println("*********");
        root.printNode();

//        System.out.println("*********");
//        invert(root).printNode();
    }

    //답지와 횟수동일
    static void decalNode(BinaryTree node){

        System.out.println("excute");
        if(node == null){
            return;
        }
        BinaryTree temp = node.right;
        node.right = node.left;
        node.left = temp;

        decalNode(node.right);
        decalNode(node.left);
    }

    //답
    static BinaryTree invert(BinaryTree root) {
        System.out.println("excute");
        if (root == null) {
            return null;
        }
        BinaryTree right = invert(root.right);
        BinaryTree left = invert(root.left);
        root.left = right;
        root.right = left;
        return root;
    }
}
