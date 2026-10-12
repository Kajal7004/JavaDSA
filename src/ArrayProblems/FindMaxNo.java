package ArrayProblems;

public class FindMaxNo {
    static int getMax(int[] arr) {
        int max = arr[0];
        for(int i=0; i<arr.length; i++) {
            //1st approach
            // if(arr[i]>max){
            //     max=arr[i];
            // }
            
            //2nd Approach
            max=Math.max(max,arr[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {32,4,3,63,54};
        System.out.println(getMax(arr));
    }
}
