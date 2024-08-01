package Basic;

public class RecursiveFibonacci {

    //Fibonacci bulan metot
    static int fib(int n){
        if (n == 1 || n == 2){  //Fibonacci ilk 2 elemanını burada yazıyoruz
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {

        System.out.println(fib(8));
    }
}
