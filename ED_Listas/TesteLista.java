package ED_Listas;

public class TesteLista {
    public static void main(String[] args) {
        Lists<Integer> lista = new ListaDinamica<Integer>();
        lista.inserir(4);
        lista.inserir(2);
        lista.inserir(5);
        lista.inserir(7);
        lista.inserir(1);
        lista.print();
        lista.remover(5);
        lista.print();
    }
}
