package ED_Listas;

public class ListaDinamica<T> implements Lists<T> {

    private NoLista<T> inicio;
    private int qtd;

    @Override
    public void print() {
       System.out.println();
       System.out.print(this);
       System.out.println();
    }

    @Override
    public String toString() {
        String s = "";
        NoLista<T> aux = inicio;
        while (aux != null) {
            s += (" -> " + aux.elemento);
            aux = aux.proximo;
        }

        return s;
    }

    @Override
    public void esvaziar() {
        inicio = null;// o garbage collector limpa tudo dps disso
        qtd = 0;
    }

    @Override
    public void inserir(T novo) {

        NoLista<T> novaCaixa = new NoLista<>(novo);

        if (inicio == null)
            inicio = novaCaixa;
        else {

            NoLista<T> aux = inicio;

            while (aux.proximo != null) {

                aux = aux.proximo;

            }

            aux.proximo = novaCaixa;
        }
        qtd++;
    }

    @Override
    public T procurarIesimo(int i) {

        if (i < qtd) {
            int j = 0;
            NoLista<T> aux = inicio;

            while (j < i) {
                aux = aux.proximo;
                j++;
            }
            return aux.elemento;
        } else
            return null;
    }

    @Override //A AULA PAROU EM 1:54 corno
    public void remover(T elemento) {
        if (inicio != null) {
            if (elemento.equals(inicio.elemento)) {
                inicio = inicio.proximo;// remover o primeiro elemento
                qtd--;
            } else {
                NoLista<T> aux = inicio;
                while (aux.proximo != null) {
                    if (aux.proximo.elemento.equals(elemento)) {
                        aux.proximo = aux.proximo.proximo;
                        qtd--;
                        break;
                    } else {
                        aux = aux.proximo;
                    }
                }
            }
        }
    }

}
