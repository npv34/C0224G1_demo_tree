package model;

public class MyTree {
    public Node root;

    public MyTree(Node root) {
        this.root = root;
    }

    public Node insert(int data) {
        Node newNode = new Node(data);
        Node p = this.root;
        Node c = p;

        if (this.root == null) {
            this.root = newNode;
        }

        while ( p != null ) {
            c = p;
            if (newNode.data < p.data) {
                p = p.left;
            } else if( newNode.data > p.data) {
                p = p.right;
            }
        }

        if (c.data > newNode.data) {
            c.left = newNode;
        } else {
            c.right = newNode;
        }

        return this.root;
    }

    public void readTree(Node node){
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        readTree(node.left);
        readTree(node.right);
    }

}
