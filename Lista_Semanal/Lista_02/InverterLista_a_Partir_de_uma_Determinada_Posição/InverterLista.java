package Lista_Semanal.Lista_02.InverterLista_a_Partir_de_uma_Determinada_Posição;

import java.sql.Savepoint;

class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}

class List<T> {

    private T[] datas;
    private int size;

    public List() {
        this.datas = (T[]) new Object[10];
    }

    public int getSize() {
        return size;
    }

    public void add(T n) {
        if (size == datas.length)
            expand();

        this.datas[size] = n;
        size++;
    }

    public void expand() {

        T[] aux = (T[]) new Object[size * 2];

        for (int i = 0; i < size; i++) {
            aux[i] = this.datas[i];
        }

        datas = aux;
    }

    public T search(int i) {
        if (i < size)
            return datas[i];
        else
            return null;
    }

    public String toString() {
        String tS = "";
        int salve = 0;
        for (int i = 0; i < size - 1; i++) {
            if (i == size)
                tS += this.datas[i];
            tS += this.datas[i] + ", ";
            salve = i;
        }
        return "Lista:[" + tS + this.datas[salve + 1] + "]";
    }

}

class Result<T> extends List<T> {

    static List aux = new List<>();
    static List savePoint = new List<>();
    
    public static String reverseList(String componentes, int posicao) {

        String s = "";

        // condicional para facilitar
        if (posicao < 0)
            posicao = 0;

        if (posicao > componentes.length())
            return componentes;

        if (componentes != null) {
            
            for (int i = 0; i < componentes.length(); i++) {
                if (componentes.charAt(i) != ' ')
                    s += componentes.charAt(i);
                if (componentes.charAt(i) == ' ' && s != null) {
                    savePoint.add(s);
                    // aux.add(s);
                    s = "";
                }
                
            }
            savePoint.add(s);

            if (posicao != 0) {
                for (int i = 0; i < posicao; i++) {
                    if(savePoint.search(i) != null)
                    aux.add(savePoint.search(i));
                }
            }
            for (int j = savePoint.getSize(); j >= posicao; j--) {
                if(savePoint.search(j) != null)
                aux.add(savePoint.search(j));
            }

            return aux.toString();

        }
        return componentes;
    }
}