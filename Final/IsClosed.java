import java.io.*;
import java.util.*;

class NoLista {
    public char element;
    public NoLista next;

    public NoLista(char e) {
        element = e;
    }
}

class Stack {

    public NoLista top;
    public int size;

    public void push(char e) {
        NoLista novo = new NoLista(e);

        if (top == null) {
            top = novo;
        } else {
            novo.next = top;
            top = novo;
        }
        size++;
    }

    public char pop() {
        char res = ' ';
        if (top != null) {
            res = top.element;
            top = top.next;
            size--;
        }
        return res;
    }


}

class Result {
    public static int calcularArvore(String expressao){
        Stack solve = new Stack();
        Stack expression = new Stack();
    	for(int i = 0; i < expressao.length(); i++){
            if(expressao.charAt(i) != ' '){
                if(expressao.charAt(i) == '('){
                    solve.push(expressao.charAt(i));
                }
                else if(expressao.charAt(i) == ')'){
                    solve.pop();
                }
            }
            
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String expressao = bufferedReader.readLine();

        int result = Result.calcularArvore(expressao);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}