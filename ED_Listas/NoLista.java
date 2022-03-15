package ED_Listas;

public class NoLista<T> {
    public T elemento;
    public NoLista<T> proximo;

    public NoLista(T elemento) {
        this.elemento = elemento;
    }

    @Override
    public String toString() {
        return "" + elemento;
    }
}
