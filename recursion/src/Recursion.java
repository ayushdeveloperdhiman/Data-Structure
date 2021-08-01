public class Recursion {
    public static void main(String[] args) {
        long var=factorial(5);
        System.out.println(var);
    }
 public static int factorial(int n){
        if(n<0){
            return -1;
        }
     if(n==0||n==1){
         return 1;
     }
     return n*factorial(n-1);
 }
}
