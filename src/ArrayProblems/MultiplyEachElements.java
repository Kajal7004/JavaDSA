package ArrayProblems;

public class MultiplyEachElements {
    static int[] getMultiply(int[] arr){
        int size = arr.length;
        int newArr[] = new int[size];
        for(int i=0; i<size; i++) {
            int element = arr[i];
            int mul = element * 10;
            newArr[i]= mul; 
            //System.out.println("mul: "+mul);
        }
        return newArr;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,4};
        int newArr[] = (getMultiply(arr));
        for(int i:newArr){
            System.out.println(i);
        }
    }
}
