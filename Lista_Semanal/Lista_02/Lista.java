package Lista_Semanal.Lista_02;

//Concatenar e Ordenar Lista 02 - Lista Organizada
public class Lista<T>{
  // Crie metodos/variaveis auxiliares se preferir
  private No<T> start;

  private int comparar(No<T> t1, No<T> t2) {
		int r = -1;
		if (t1 instanceof Comparable) {
			r = ((Comparable)t1).compareTo(t2);
		}
		return r;
	}

  public void add(T n) {

    No<T> newBox = new No<T>(n);

    if (start == null) {

      start = newBox;

    }
    
    else {
      No<T> aux = start;

      while (aux.proximo != null){
          
          if(comparar(newBox,aux.proximo) < 0 && aux.proximo != null){

            aux.proximo = newBox;
            aux.proximo.proximo = aux.proximo;
            return;

        }else aux = aux.proximo;

      
        aux.proximo = newBox;

        }
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
