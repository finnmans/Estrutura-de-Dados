package Lista_Semanal.Lista_04_Stacks;

import java.io.*;
import java.util.*;

class Node<T> {
  public Node<T> next;
  public int data;

  public Node(int data){
    this.data = data;
    
  }

}

class CustomStack<T> {

    private Node<T> top;
    private int size;

  public boolean isEmpity(){
    
    if(top == null) return true;
    return false;
    
  }

  public void add(int e){
    
    Node<T> stacked = new Node<T>(e);
    if(top == null) top = stacked;
    top.next = top;
    top = stacked;
    size++;
    
    }

  public void remove(){
    
    if(isEmpity()) return;
    int removed = 0;
    removed = top.data;
    top = top.next;
    size--;

  }


    public String display() {
      
      if(isEmpity()) return "Empity";
        
      Node<T> aux = top;
      String s = "";

     while(aux != null){
      s += " " + aux.data;
      aux = aux.next;
    }
      
    return s;
      
    }
}

/*public class Solution {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        CustomStack stack = new CustomStack();

        while(scan.hasNextLine()) {
            String nextLine = scan.nextLine();

            if(nextLine.isEmpty()) {
                break;
            }
         
            Integer n = Integer.parseInt(nextLine);
            
            if (n < 0) {
                stack.remove();
                System.out.println("Remove: " + stack.display());

            } else {
                stack.add(n);
                System.out.println("Insert: " + stack.display());
            }
        }
    }
}*/