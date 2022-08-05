package Lista_Semanal.Lista_03_Queue;

public class ListQueue<T> {

    Node<T> first;
    Node<T> last;
    int size = 0;

    public void add(T data){
        Node<T> newOne = new Node<T>(data);

        if(first == null) first = last = newOne;
        else{
             last.next = newOne;
             last = newOne;
        }
        size++;
    }

    public T dequeue(){
        T r = null;
        if(first != null){
            r = first.data;
            first = first.next;
            if(first == null)  last = null;
              size--;
        }
        return r;
    }
    public T head() {
		T r = null;
		if (first != null) {
			r = first.data;
		}
		return r;
	}

	public int length() {
		return size;
	}


}
