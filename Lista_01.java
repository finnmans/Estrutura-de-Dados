class main{


    public static int fibonacci(int position) {
        if(position <= 1) return position;
           else return fibonacci(position - 1) + fibonacci(position - 2);

 }


 public static Integer factorial(Integer value) {

    if(value <= 1) return value;
       return value  * factorial(value - 1);

  }
  public static String toString(Integer inputValue, Integer result) {
    return inputValue + "! = "  + result;
  }

    public static void main(String[] args) {

       System.out.println(factorial(3));
    }

}