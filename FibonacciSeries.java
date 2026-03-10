public class FibonacciSeries {
    public static int fibo(int n){
        if(n <=1) { //Base condition
            return n;
        }

        return fibo(n-1) + fibo(n-2); //Recursive call
    }

    public static void main(String[] args) {
        int n = 7;
        for(int i=0; i<n; i++){
            System.out.println(fibo(i) + " ");
        }
    }
}