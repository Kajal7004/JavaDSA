package ArrayProblems;

public class Count {
    static int[] getCount(int [] arr){
        int zeros =0;
        int ones =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                zeros++;
            } else {
                ones++;
            }
        }
        int[] res = {zeros, ones};
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,1,1,0,0,0};
        int[] ans = getCount(arr);
        System.out.println("zeros:"+ans[0]);
        System.out.println("zeros:"+ans[1]);
    }
}
