class main{

//Fibonacci Recursivo
    public static int fibonacci(int position) {
        if(position <= 1) return position;
           else return fibonacci(position - 1) + fibonacci(position - 2);

 }

//Factorial Recursivo
 public static Integer factorial(Integer value) {

    if(value == 1) return value;
        else if(value < 1) return value = 1;
     return value  * factorial(value - 1);

  }


  public static String toString(Integer inputValue, Integer result) {
    return inputValue + "! = "  + result;
  }

  //Substituição em String por Recursividade

  public static String recursiveSwap(String s) {

        String pi = "3.14";
         s = s.toLowerCase();     
          s = s.replace(" ","");
            s = s.replace(",","");
              s = s.replace(".","");
              
         if(!s.contains("pi")) return s;
          else if(s.charAt(0) == 'p' && s.charAt(1) == 'i'){

           return pi + recursiveSwap(s.substring(2));
         }
            
            return s.charAt(0) + recursiveSwap(s.substring(1));
        
         /*for(int i = 0; i != s.length(); i++){'
        
          if(s.charAt(i) == 'p' && s.charAt(i+1) == 'i'){
            i++;
            novaS = novaS + pi;
          }
           else novaS += s.charAt(i);
      }*/
      

        
   
}//https://docs.oracle.com/javase/tutorial/java/data/manipstrings.html
    public static void main(String[] args) {

       System.out.println(recursiveSwap("pitopilomeu"));
       System.out.println(recursiveSwap("ApIa"));
       System.out.println(recursiveSwap(" a  , p .. i a"));
    }

}