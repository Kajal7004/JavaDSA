package ArrayProblems;

public class FindSums {
    static int[] getSum(int[] arr) {
        int positiveNo = 0;
        int negativeNo = 0;
        for(int val : arr){
            if(val >0){
                positiveNo+= val;
            }
            else if(val <0){
                negativeNo+= val;
            }
        }
        int[] res = {positiveNo, negativeNo};
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2,-4,5,4,-3};
        int[] res1 = getSum(arr);
        System.out.println("PositiveSum: "+res1[0]); 
        System.out.println("NegativeSum: "+res1[1]);
    }
}
