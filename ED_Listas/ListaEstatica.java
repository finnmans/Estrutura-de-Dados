package ED_Listas;

public class ListaEstatica<T> implements Lists<T> {

    private T[] elementos;
    private int qtd;

    public ListaEstatica() {
        elementos = (T[]) new Object[10];
    }

    @Override
    public void print() {
        for (int i = 0; i < elementos.length; i++) {
            System.out.print(" -> " + elementos[i]);
        }
        System.out.println();
    }

    @Override
    public void esvaziar() {
        elementos = (T[]) new Object[10]; // garbage collector limpa a memoria
        qtd = 0; // adicionando um novo objeto igual por cima

    }

    @Override
    public void inserir(T novo) {
        if (qtd == elementos.length)
            expandirMemoria();

        elementos[qtd] = novo;
        qtd++;

    }

    private void expandirMemoria() {
        T[] temp = (T[]) new Object[qtd * 2];
        for (int i = 0; i < qtd; i++) {
            temp[i] = elementos[i];
        }

        elementos = temp;
    }

    @Override
    public T procurarIesimo(int i) {
        if (i < qtd)
            return elementos[i];
        else
            return null;
    }

    @Override
    public void remover(T elemento) {
        int i = 0;
        while (i < qtd) {
            if (elemento.equals(elementos[i]))
                break; // encontrei o elemento para ser removido;

            i++;

        }

        if (i < qtd) {
            // remove o elemento e coloca os demais para esquerda
            while (i < qtd - 1) {
                elementos[i] = elementos[i + 1];
                i++;

            }

            elementos[i] = null;
            qtd--;

        }
    }

}
