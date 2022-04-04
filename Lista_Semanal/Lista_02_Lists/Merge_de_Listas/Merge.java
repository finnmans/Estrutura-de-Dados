package Lista_Semanal.Lista_02_Lists.Merge_de_Listas;

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

    public int getSize() {
        return size;
    }

    public void add(T n) {
        datas[size] = n;
        size++;
    }

    public T search(int i) {
        if (i < size)
            return datas[i];
        else
            return null;
    }

    public String print(){
        return this.toString();
    }

    @Override
    public String toString() {
        
        return super.toString();
    }

    private int comparar(T t1, T t2) {
        int r = -1;
        if (t1 instanceof Comparable) {
            r = ((Comparable) t1).compareTo(t2);
        }
        return r;
    }

}

class Result<T> {
    
    private static int comparar(Object object, Object object2) {
        int r = -1;
        if (object instanceof Comparable) {
          r = ((Comparable) object).compareTo(object2);
        }
        return r;
      }

    public static String merge(String x, String y) {

        CustomList xPoint = new CustomList<>();
        CustomList yPoint = new CustomList<>();
        CustomList finalPoint = new CustomList<>();

        String s = "";

        if(x != null)
        for (int i = 0; i < x.length(); i++) {

            if (x.charAt(i) == ' ') {

                xPoint.add(s);
                // aux.add(s);
                s = "";

            }
            if (x.charAt(i) != ' ')
                s += x.charAt(i);
        }
        xPoint.add(s);
        s = "";
        if(y != null){
            for (int i = 0; i < y.length(); i++) {

                if (y.charAt(i) == ' ') {
    
                    yPoint.add(s);
                    // aux.add(s);
                    s = "";
    
                }
                if (y.charAt(i) != ' ')
                    s += y.charAt(i);
            }
        }

        yPoint.add(s);
        
       
        
        return s;
    }
}
