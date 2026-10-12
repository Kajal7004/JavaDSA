package ArrayProblems;

public class FindAverage {

       //2nd approach
    public static double getAverage( int[] arr) {
        double sum = 0;
        for(int val:arr) {
            sum+= val;
        }
        int size = arr.length;
        double avg = sum/size;
        return avg;
    }
    public static void main(String[] args) {
        // int arr[] = {3,5,7,4,2};
        // int n = arr.length;
        // int sum = 0;
        // double avg;
        // for(int i=0; i<n; i++) {
        //     sum += arr[i];    
        // }
        // avg = sum/n;
        // System.out.println("Average: "+avg);


        int arr[] = {5,2,3,5,4};
        System.out.println(getAverage(arr));
    

 
}
    
}
