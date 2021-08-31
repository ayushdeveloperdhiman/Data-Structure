public class BigOInterviewQuestion2 {
    public static void main(String[] args) {
        printPair(new int[]{1,3,4,5});
    }
    static void printPair(int[] array){
        for(int i=0;i< array.length;i++){//-------------------------------->O(N)
            for(int j=0;j< array.length;j++){//---------------------------->O(N)
                System.out.println(array[i]+","+array[j]);//--------------->O(1)
            }
        }
    }//Time complexity of this function is O(N^2)
}
