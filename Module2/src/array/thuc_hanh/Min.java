package array.thuc_hanh;

public class Min {
    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minArray(arr);
        System.out.println("The smallest element in the array is: " +index);

    }

    public static int minArray(int[] array) {
        int min = array[0];
        for(int i=1;i <array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;


    }
}
