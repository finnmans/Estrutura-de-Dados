class main{


    public static int fibonacci(int position) {
            if(position <= 1) return position;
                return fibonacci(position - 1) + fibonacci(position - 2);

        }

    public static void main(String[] args) {
       System.out.println(fibonacci(4));
    }

}