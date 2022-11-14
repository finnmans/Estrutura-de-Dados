package Lista_Semanal.Lista_07_BTree;

public class BTree implements Comparable{
    Node root;

    @Override
   public int compareTo(Object o) {
    // TODO Auto-generated method stub
    return 0;
}

   public <T> void add(T newLeaf){

    Node<T> newNode = new Node<T>(newLeaf);

    if(root == null) root = newNode;

    if(newNode instanceof Comparable){

    }

   }

}
