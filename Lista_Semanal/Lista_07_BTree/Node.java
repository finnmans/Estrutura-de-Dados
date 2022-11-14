package Lista_Semanal.Lista_07_BTree;

public class Node<T> {

    T data;
    Node<T> right,left;

    Node(T data){
        this.data = data;
        right = left = null;
    }
}
