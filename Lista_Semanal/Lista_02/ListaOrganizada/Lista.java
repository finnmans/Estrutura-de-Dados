package Lista_Semanal.Lista_02.ListaOrganizada;

//Concatenar e Ordenar Lista 02 - Lista Organizada
public class Lista<T> {
  // Crie metodos/variaveis auxiliares se preferir
  private No<T> start;

  private int comparar(T t1, T t2) {
    int r = -1;
    if (t1 instanceof Comparable) {
      r = ((Comparable) t1).compareTo(t2);
    }
    return r;
  }

  public void add(T n) {

    No<T> newBox = new No<T>(n);

    if(comparar((T) start,(T) newBox) > 0 && start != null){
      No<T> valorMenor = newBox;
      newBox = start;
      start = valorMenor;
      
    }

    if (start == null) {

      start = newBox;

    }

    else {
      No<T> aux = start;
      No<T> valorMenor;

      while (aux.proximo != null) {
         if (comparar( (T) newBox,(T) aux.proximo) < 0) {

          valorMenor = newBox;
          newBox = aux.proximo;
          aux.proximo = valorMenor;

        } else
            aux = aux.proximo;

      }

      aux.proximo = newBox;
    }
  }

  public String toString() {
    // Crie o metodo para retornar a lista ordenada em formato de String aqui!
    String s = "";
    No<T> aux = start;
    while (aux != null) {
      s += (aux.data + " ");
      aux = aux.proximo;
    }

    return s;
  }

}
