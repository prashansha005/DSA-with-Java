public class Factorial {
    static int fact(int n){
        if(n == 1 || n == 0){ // Base condition
            return 1;
        }
        return n * fact(n-1); //Recursive call
    }

    public static void main(String[] args){
        int n = 3;
        int result = fact(n);
        System.out.println("Factorial:" + result);
    }
}
