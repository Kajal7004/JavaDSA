package ArrayProblems;

public class LinearSearch {
    
    static boolean getElement(int[] arr,int target) {
        
        for(int i=0; i<arr.length; i++) {
            int ele =  arr[i];
            if(ele == target) {
                return  true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,7,4};
        boolean ans = getElement(arr, 3);
        System.out.println(ans);
    }
}
