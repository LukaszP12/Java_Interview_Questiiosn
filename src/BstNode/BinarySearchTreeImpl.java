package BstNode;

public class BinarySearchTreeImpl {

    private BstNode root;

    public boolean isEmpty() {

        return (this.root == null);
    }

    public void insert(Integer data) {

        System.out.print("[input: "+data+"]");
        if(root == null) {
            this.root = new BstNode(data);
            System.out.println(" -> inserted: "+data);
            return;
        }

        insertNode(this.root, data);
        System.out.print(" -> inserted: "+data);
        System.out.println();
    }

    private BstNode insertNode(BstNode root, Integer data) {

        BstNode tmpNode = null;
        System.out.print(" ->"+root.getData());
        if(root.getData() >= data) {
            System.out.print(" [L]");
            if(root.getLeft() == null) {
                root.setLeft(new BstNode(data));
                return root.getLeft();
            } else {
                tmpNode = root.getLeft();
            }
        } else {
            System.out.print(" [R]");
            if(root.getRight() == null) {
                root.setRight(new BstNode(data));
                return root.getRight();
            } else {
                tmpNode = root.getRight();
            }
        }

        return insertNode(tmpNode, data);
    }

    // min and max value
    public Integer findMinValue(){
        return minValue(this.root);
    }

    public Integer findMaxValue(){
        return maxValue(this.root);
    }

    private Integer minValue(BstNode node){
        if(node.getLeft() != null){
            return minValue(node.getLeft());
        }
        return node.getData();
    }

    private Integer maxValue(BstNode node){
        if(node.getRight() != null){
            return minValue(node.getRight());
        }
        return node.getData();
    }

    //find height
    public Integer findHeight(){
        return getNodeHeight(this.root);
    }

    private Integer getNodeHeight(BstNode node){
        if(node == null){
            return -1;
        }

        return Math.max(getNodeHeight(node.getLeft()), getNodeHeight(node.getRight()))+1;
    }

    public static void main(String a[]) {

        BinarySearchTreeImpl bst = new BinarySearchTreeImpl();
        bst.insert(10);
        bst.insert(20);
        bst.insert(21);
        bst.insert(8);
        bst.insert(6);
        bst.insert(16);
        bst.insert(23);
        System.out.println("Min value: "+bst.findMinValue());
        System.out.println("Max value: "+bst.findMaxValue());

        System.out.println("The height of the tree is: " + bst.findHeight());
    }
}