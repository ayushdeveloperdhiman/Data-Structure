public class BigOInterviewQuestion3 {
    public static void main(String[] args) {
        printPair(new int[]{1,3,4,5});
    }
    static void printPair(int[] array){
        for(int i=0;i< array.length;i++){
            for(int j=i+1;j< array.length;j++){
                System.out.println(array[i]+","+array[j]);
            }
        }
    }//Time complexity of this function is O(N^2)
}
