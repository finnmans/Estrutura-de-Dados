package Lista_Semanal.Lista_02.Merge_de_Listas;

public class Merge {
    
}

class Node<T> implements Comparable {
	
    public T data;
    public Node<T> proximo;

    public Node(T data) {
        this.data = data;

    }

@Override
public int compareTo(Object outro) {
      int r = -1;
      if (outro instanceof Node) {
        r = ((Comparable) this.data).compareTo(((Node) outro).data);
      }
      return r;
    }
}

class CustomList<T> {

	private T[] datas;
    private int size;

    public CustomList() {
        datas = (T[]) new Object[20];
    }

    public void add(T n){
        datas[size] = n;
        size++;
    }

    private int comparar(T t1, T t2) {
        int r = -1;
        if (t1 instanceof Comparable) {
          r = ((Comparable) t1).compareTo(t2);
        }
        return r;
      }


}

class Result {
    public static String merge(String x, String y) {

        return "";
    }
}

