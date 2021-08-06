public class PowerOfNumber {
    public static void main(String[] args) {
        System.out.println(power(2,4));
    }
    public static int power(int base,int exp){
        if(exp<0){
            return -1;
        }
        if(exp==1||exp==0){
            return base;
        }
        return base*power(base,exp-1);
    }
}
