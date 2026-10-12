package ArrayProblems;

public class UnsortedElement {
    public static int getSortedElement(int[] arr){
       
        for(int i=0; i<arr.length; i++){
            if(arr[i+1]<=arr[i]){
                return arr[i+1];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,9,5,12};
        System.out.println(getSortedElement(arr));
    }
}
