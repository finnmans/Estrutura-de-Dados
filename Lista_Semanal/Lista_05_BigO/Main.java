package Lista_Semanal.Lista_05_BigO;

public class Main {
    public static void main(String[] args) {
        int vet[] = {5, -5, 20, 70, 45, -10, 0, 300};
        BubbleSorte bubbles = new BubbleSorte();
       // bubbles.printData(vet);
       // bubbles.bubbleSort(vet);
       SelectionSort select = new SelectionSort();
        int vet1[] = {53, 16, -62, 75, -86, 33, -10, 7};

        select.printSelect(vet1);
        select.selectSort(vet1);
    }
}
