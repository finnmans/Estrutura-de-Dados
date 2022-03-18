package Lista_Semanal.Lista_02.InverterLista_a_Partir_de_uma_Determinada_Posição;

 class List<T>{

    private T[] datas;
    private int size;

    public List(){
        this.datas = (T[]) new Object[10];
    }

    public int getSize() {
        return size;
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

       datas = aux;
    }

    public T search(int i) {
        if (i < size)
            return datas[i];
        else
            return null;
    }
    
    public String toString(){
        String tS = "";
        int salve = 0;
        for(int i = 0; i < size-1; i++){
            if(i == size) tS += this.datas[i];
            tS += this.datas[i] + ", ";
            salve = i;
        }
        return "Lista:[" + tS + this.datas[salve+1] +"]";
    }


}
