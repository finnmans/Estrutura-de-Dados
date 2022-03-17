package Lista_Semanal.Lista_02.InverterLista_a_Partir_de_uma_Determinada_Posição;

class Node<T>{
    public T data;
    public Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}

class List<T>{

    private T[] datas;
    private int size;

    public List(){
        this.datas = (T[]) new Object[10];
    }

    public void add(T n){
        if(size == datas.length ) expand();

        this.datas[size] = n;
        size++;
    }

    public void expand(){

        T[] aux = (T[]) new Object[size * 2];

        for (int i = 0; i <= size; i++) {
            aux[i] = this.datas[i];
        }

        this.datas = aux;
    }
    
    public String toString(){
    	String tS = "";
        for(int i = 0; i <= size; i++){
            tS += this.datas[i];
        }
        return "Lista:[" + tS + "]";
    }


}
}
class Result<T> extends List<T> {

    static List aux = new List<>();

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
                if (componentes.charAt(i) == ' ') {
                    aux.add(s);
                    s = "";
                }

            }

            return aux.toString();

        }
        return aux.toString();
    }
}

