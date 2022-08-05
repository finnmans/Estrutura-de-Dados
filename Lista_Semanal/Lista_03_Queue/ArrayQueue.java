package Lista_Semanal.Lista_03_Queue;

public class Queue<T>{
    private int tail,front;
    private int size, capacity;
    private T fila[];
    
    public Queue( int capacity){
        
        this.front = this.size = 0;
        this.capacity = capacity;
        tail = capacity - 1;
        fila = (T[]) new Object[capacity];
        
    }

    public void enqueue(T i){
    
        tail = position(tail);
        fila[tail] = i;
        size++;
        System.out.println(i + "na fial");

    }

    public T dequeue(){
        size--;
        T i = fila[front];
        fila[front] = null;
        front = position(front);
        return i;

    }

    public int position(int i){
        return i = ++i % capacity;
    }
}
