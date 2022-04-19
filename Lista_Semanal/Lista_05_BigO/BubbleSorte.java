package Lista_Semanal.Lista_05_BigO;

public class BubbleSorte {
    
    public void printBubble(int var[]){
        String s = "";
        for(int i = 0; i < var.length; i++)

            s += var[i] + " ";

            System.out.println(s);
    }


    public void bubbleSort(int var[]){
        int temp = 0;
        
        int size = var.length - 1;

        if(var == null) return;

        for(int i = 0; i < size; i++ )
            for(int j = 0; j < size - i; j++){
                if(var[j] > var[j+1]){

                    temp = var[j];
                    var[j] = var[j+1];
                    var[j+1] = temp;

                    printBubble(var);
                }
            }
    }


}
