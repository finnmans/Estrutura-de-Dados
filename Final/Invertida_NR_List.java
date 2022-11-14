import java.io.*;
import java.util.*;

class NodeLista<Integer> {
    public Integer element;
    public NodeLista<Integer> next;

    public NodeLista(Integer e) {
        element = e;
    }

    public String toString() {
        return "" + element;
    }
}

class Lista<Integer> {
    protected NodeLista<Integer> first, last;
    protected int qtd;

    public void add(Integer e) {
        NodeLista<Integer> novo = new NodeLista<Integer>(e);
        if (first == null) {
            first = last = novo;
        } else {
            last.next = novo;
            last = novo;
        }
        qtd++;
    }

    public void remove(Integer e) {

        if (first == null) {
            last = null;
            return;
        }
        if (first.element == e) {
            first = first.next;
            qtd--;
        } else {
            NodeLista<Integer> temp = first;
            while (temp.next != null) {
                if (temp.next.element == e) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        last = temp;
                    }
                    qtd--;
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public Integer search(int i) {

        int position = 0;
        NodeLista<Integer> temp = first;

        while (position < i && temp != null) {

            position++;
            temp = temp.next;

        }

        if (temp != null) {

            return temp.element;

        }

        return null;

    }

    public String toString() {
        String s = "";
        NodeLista<Integer> p = first;
        while (p != null) {
            String z = p.next == null ? "" : " ";
            s = z + p.element + s;
            p = p.next;
        }
        return s;
    }

    public boolean repeated(Integer e) {
        NodeLista<Integer> temp = first;
        int count = 0;
        while (temp != null) {
            if (temp.element == e) {
                count++;
            }
            if (count == 2) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}

class Result {
    public static Lista<Integer> novaLista(Lista<Integer> lista) {
        NodeLista<Integer> p = lista.first;
        while (p != null) {
            Integer temp = p.element;
            while (lista.repeated(temp)) {
                lista.remove(temp);
            }
            p = p.next;
        }
        return lista;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int a = Integer.parseInt(bufferedReader.readLine().trim());

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        int c = Integer.parseInt(bufferedReader.readLine().trim());

        int d = Integer.parseInt(bufferedReader.readLine().trim());

        int e = Integer.parseInt(bufferedReader.readLine().trim());

        int f = Integer.parseInt(bufferedReader.readLine().trim());

        int g = Integer.parseInt(bufferedReader.readLine().trim());

        Lista<Integer> lista = new Lista<>();
        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        lista.add(e);
        lista.add(f);
        lista.add(g);

        String result = Result.novaLista(lista).toString();
        bufferedWriter.write(result);

        bufferedReader.close();
        bufferedWriter.close();
    }
}