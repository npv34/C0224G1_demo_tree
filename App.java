import model.MyTree;
import model.Node;


public class App {
    public static void main(String[] args) {
         Node node = new Node(15);
         MyTree myTree = new MyTree(node);

         myTree.insert(10);
         myTree.insert(30);
         myTree.insert(24);
         myTree.insert(35);
         myTree.insert(14);


         myTree.readTree(myTree.root);



    }
}
