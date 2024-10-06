package Recursion;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = {4,3,1,5,8,3,9,0,7,7,3};
        mergeSort(array);

        //print elements
        for (int i : array) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

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
        
        //cache the array sizes
        int leftSize = array.length/2;
        int rightSize = array.length - leftSize;

        //pointer variables
        int i=0,l=0,r=0; //index for  mergedArray leftArray rightArray
       
        //compare elements of both arrays and put em in merged array
        while (l<leftSize && r<rightSize) {
            
            //compare 2 elements
            if (leftArray[l]<rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else{
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        //for remaining elements

        //if left was bigger
        while (l<leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }

        //if right was bigger
        while (r<rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }


    }
}