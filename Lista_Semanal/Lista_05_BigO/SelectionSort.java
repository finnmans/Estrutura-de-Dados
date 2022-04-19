package Lista_Semanal.Lista_05_BigO;

public class SelectionSort {
    
    public void printSelect(int var[]){ //print
        String s = "";
        for(int i = 0; i < var.length; i++)

            s += var[i] + " ";

            System.out.println(s);
    }

    public void selectSort(int var[]){
        int temp,min;
        

        for(int i = 0; i < var.length; i++){

            min = i;//organizacao do vetor por loop

            for(int j = i+1; j < var.length; j++){
                if(var[j] < var[min]) //armazena a posicao do menor valor
                min = j;
            }

            temp = var[min]; //troca de valores
            var[min] = var[i];
            var[i] = temp;

            printSelect(var);//print apos todas as trocas
        }
    }
}


