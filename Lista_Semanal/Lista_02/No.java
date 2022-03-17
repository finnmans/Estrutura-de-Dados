package Lista_Semanal.Lista_02;

public class No<T>{

    public T data;
    public No<T> proximo;
    
   public No(T data) {
        this.data = data;
        this.proximo = null;
    }

}
