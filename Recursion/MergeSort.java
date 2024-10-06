package Recursion;

public class MergeSort {

    public static void mergeSort(int[] array){
       
        int length = array.length;
        if (length<=1) return; //base case

         // 2 temp arrays if length>1
        int middle = length/2;
        int[] leftArray = new int[middle];  //0 to half
        int[] rightArray = new int[length - middle];    //midle+1 to end

        //insert element to temp arrays
        int i=0;    //pointer for main array
        int j=0;    //pointer for rightArray

        //for all element in main array
        for (; i < array.length; i++) {

            //add to left array
            if (i<middle) {
                leftArray[i] = array[i];
            }

            //add to right array
            else{
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(array, leftArray, rightArray);

    }

    private static void merge(int[] array, int[] leftArray, int[] rightArray) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'merge'");
    }
}