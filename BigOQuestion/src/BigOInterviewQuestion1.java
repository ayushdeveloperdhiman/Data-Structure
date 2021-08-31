public class BigOInterviewQuestion1 {
    public static void main(String[] args) {
        spOfArray(new int[]{1,2,3,4});
    }
    static void spOfArray(int[] array){
        int sum=0;//------------------------------------------>O(1)
        int product=1;//-------------------------------------->O(1)
        for(int i=0;i< array.length;i++){//------------------->O(N)
            sum+=array[i];//---------------------------------->O(1)
            product*=array[i];//------------------------------>O(1)
        }
        System.out.println(sum);//---------------------------->O(1)
        System.out.println(product);//------------------------>O(1)
    }
}
//Eliminating nonDominant terms
//So time complexity of this function is O(N)
