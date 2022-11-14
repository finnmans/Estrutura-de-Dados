import java.io.*;
import java.util.*;

import javax.lang.model.element.Element;

class No<Integer>{
public No<Integer> next;
public Integer element;

public No (Integer e){
    this.element = e;
}
public String toString() {
    return "" + element;
    }
}

class Fila<T>{
    public No<Integer> first, last;
    public int size;

    public void enqueue(int value){
        No<Integer> newNode = new No<Integer>(value);

        if(first == null) first = last = newNode;
        else{
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public Integer dequeue(){
        if(first == null) {
            last = null;
            return null;
        }
            int holder = first.element;
            first = first.next;
            size--;

        if(first == null){
            last = null;
        }

        return holder;
    }

    public boolean HasASanduiche (int e){
        No<Integer> temp = first;
        while(temp != null){
            if(temp.element == e){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

}

class Result {

    public static int contarEstudantes(Fila<Integer> estudantes, Fila<Integer> sanduiches){

        No<Integer> temp = estudantes.first;
        while(temp != null){
            if(temp.element == sanduiches.first.element){
                estudantes.dequeue();
                sanduiches.dequeue();
            }
            else if(sanduiches.HasASanduiche(temp.element)){
                estudantes.enqueue(estudantes.dequeue());
            }
            else{
                break;
            }
            temp = temp.next;
        }

        return sanduiches.size;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine().trim());

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        int c = Integer.parseInt(bufferedReader.readLine().trim());

        int d = Integer.parseInt(bufferedReader.readLine().trim());

        int e = Integer.parseInt(bufferedReader.readLine().trim());

        int f = Integer.parseInt(bufferedReader.readLine().trim());
        
        int g = Integer.parseInt(bufferedReader.readLine().trim());
        
        int h = Integer.parseInt(bufferedReader.readLine().trim());
        
        int i = Integer.parseInt(bufferedReader.readLine().trim());
        
        int j = Integer.parseInt(bufferedReader.readLine().trim());

        Fila<Integer> estudantes = new Fila<>();
        
        Fila<Integer> sanduiches = new Fila<>();
        
        estudantes.enqueue(a);
        estudantes.enqueue(b);
        estudantes.enqueue(c);
        estudantes.enqueue(d);
        estudantes.enqueue(e);
        
        sanduiches.enqueue(f);
        sanduiches.enqueue(g);
        sanduiches.enqueue(h);
        sanduiches.enqueue(i);
        sanduiches.enqueue(j);
        
        int resultado = Result.contarEstudantes(estudantes, sanduiches);
        
        System.out.println(resultado);

        bufferedReader.close();
    }
}