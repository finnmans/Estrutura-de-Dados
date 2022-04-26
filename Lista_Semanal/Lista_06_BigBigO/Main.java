package Lista_Semanal.Lista_06_BigBigO;

public class Main {
    public static void main(String[] args) {
        int vet[] = {-43, 18, 83, 24, 99, -11, 64, 74, 27, 24};
        int n = vet.length - 1;
        
        QuickSort quickS = new QuickSort();

        quickS.printQS(vet);
        quickS.quickSort(vet, 0, n);
    }
}
