package Lista_Semanal.Lista_06_BigBigO;

public class QuickSort {

    public void printQS(int var[]){
        String s = "";
        for(int i = 0; i < var.length; i++)
             s += var[i] + " ";

            System.out.println(s);
    }

    public void quickSort(int var[], int left, int right){
        if(left >= right ) return;
        else{
            int pivo = var[right];

            int k = apart(var,left,right,pivo);
            
            quickSort(var, left, k-1);
            quickSort(var, k+1, right);

            
        }
    }

    public int apart(int var[], int left, int right, int pivo){
        int i = left -1;
        
        for(int j = left; j <= right - 1; j++){
            if(var[j] < pivo){
                i++;
                swap(var,i,j);
                printQS(var);
            }
        }
        swap(var,i+1,right);
        return i+1;
     
    }

    public void swap(int var[],int n1, int n2){

        int temp;
        temp = var[n1];
        var[n1] = var[n2];
        var[n2] = temp;

    }
}
