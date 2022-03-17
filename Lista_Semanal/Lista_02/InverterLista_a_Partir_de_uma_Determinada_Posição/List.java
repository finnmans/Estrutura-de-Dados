package Lista_Semanal.Lista_02.InverterLista_a_Partir_de_uma_Determinada_Posição;

public class List<T>{

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

        for (int i = 0; i < size; i++) {
            aux[i] = this.datas[i];
        }

        this.datas = aux;
    }
    
    public String toString(){
    	String tS = "";
        for(int i = 0; i <= size; i++){
            tS += ", " + this.datas[i];
        }
        return "Lista:[" + tS + "]";
    }


}
