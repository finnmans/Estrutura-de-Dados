package ED_Lista02;

public class ListaEstatica<T> implements Lists<T>{

    private T[] elementos;
    private int qtd;


    public ListaEstatica(){
        elementos = (T[]) new Object[10];
    }

    @Override
    public void print() {
       for(int i = 0; i<qtd; i++){
           System.out.print(" -> " + elementos[i]);
       }
        System.out.println();
    }

    @Override
    public void esvaziar() {
        elementos = (T[]) new Object[10]; //garbage collector limpa a memoria
        qtd = 0;                          // adicionando um novo objeto igual por cima
        
    }

    @Override
    public void inserir(T novo) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public T procurarIesimo(int i) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void remover(T elemento) {
        // TODO Auto-generated method stub
        
    }

    
    
}
