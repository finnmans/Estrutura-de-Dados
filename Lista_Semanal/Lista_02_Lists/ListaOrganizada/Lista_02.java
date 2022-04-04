package Lista_Semanal.Lista_02_Lists.ListaOrganizada;

public class Lista_02 {

    public static void main(String[] args) {
        Lista lista = new Lista<Integer>();
        
        lista.add(8);
        lista.add(2);
        lista.add(1);
        lista.add(7);
        lista.add(4);
        lista.add(-1);

        System.out.println(lista.toString());
    }
}
