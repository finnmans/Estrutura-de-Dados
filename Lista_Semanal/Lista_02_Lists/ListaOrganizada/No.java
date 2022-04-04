package Lista_Semanal.Lista_02_Lists.ListaOrganizada;

public class No<T> implements Comparable{

    public T data;
    public No<T> proximo;
    
   public No(T data) {
        this.data = data;

    }

    public int compareTo(Object outro) {
      int r = -1;
      if (outro instanceof No) {
        r = ((Comparable) this.data).compareTo(((No) outro).data);
      }
      return r;
    }

}
