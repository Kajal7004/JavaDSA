package ArrayProblems;

import java.util.Arrays;

public class SwapAlternateElements {
    public static int[] getSwapEle(int[] arr){                    
        for(int i=0; i<arr.length; i+=2){
            int temp = arr[i];
             arr[i]= arr[i+1];
             arr[i+1] = temp;
        }
        return arr; 
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] swappedArray = getSwapEle(arr);
        System.out.println(Arrays.toString(swappedArray));
    }
}
