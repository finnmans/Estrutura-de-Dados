package Lista_Semanal.Lista_01_Recursividade;

public class Lista_01_Binario {
    
}

class Result {

   
    /*
     * Complete the 'mudancaBase' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER numeroDecimal as parameter.
     */
    static String binario = "";

    public static int mudancaBase(int numeroDecimal) {

    

    binario = String.valueOf(numeroDecimal%2) + binario;

    System.out.println(binario); 

    if(numeroDecimal == 0) return Integer.parseInt(binario);

    return mudancaBase(numeroDecimal/2);

    
    

}

    public static void main(String[] args) {
       

        mudancaBase(19);

       
}

}


