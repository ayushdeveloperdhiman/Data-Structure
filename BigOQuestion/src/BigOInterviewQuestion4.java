import java.util.Arrays;

public class BigOInterviewQuestion4 {
    public static void main(String[] args) {
        reverseArray(new int[]{1, 2, 3, 4});
        reverseArray(new int[]{1, 2, 3, 4, 5});
    }

    static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {//----------------->O(N/2)
                int other = array.length-i-1;//------------------------>O(1)
                int temp=array[i];//----------------------------------->O(1)
                array[i]=array[other];//------------------------------->O(1)
                array[other]=temp;//----------------------------------->O(1)
        }
        System.out.println(Arrays.toString(array));//------------------>O(1)
    }//Time complexity of this function is O(N)
}
