import java.util.Scanner;

public class Array {
    public  static void main() {
//        int arr[];
//        arr = new int [5];
//        Scanner sc = new Scanner(System.in);
//        int x = arr.length;
//        for (int i = 0; i<=x-1; i++) {
//            System.out.println("provides input for array " +i);
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("array contains:");
//        for (int val : arr) {
//            System.out.println(val);
//        }
//


        int brr[] = {12,32,43};
        int  sum = 0;
        int mul = 1;

       int  n = brr.length;
       System.out.println("Accessing elements of array using For loop");
        for (int index = 0; index <= n-1; index++) {
            System.out.println(brr[index]);
            sum += brr[index];
            mul *= brr[index];

//            System.out.println("Sum of array: " +sum);
        }
        System.out.println("Sum of array: " +sum);
        System.out.println("Multiplication of array: " +mul);

        System.out.println("Accessing elements of array using For each loop");
        for ( int val : brr) {
            System.out.println(val);
        }

        int arr1[] = {2,43,-9,54,5};
        int maxValue = arr1[0];
        int minValue = arr1[0];
        int n1 = arr1.length;

        for (int i = 0; i<=n1-1; i++){
            if(arr1[i] > maxValue){
                maxValue = arr1[i];
            }
            if(arr1[i] < minValue) {
                minValue =arr1[i];
            }
        }
        System.out.println("max value in array: " +maxValue);
        System.out.println("min value in array: " +minValue);
//        System.out.println("value of 0 index: " +brr[0]);
//        System.out.println("value of 1 index: " +brr[1]);
//        System.out.println("value of 2 index: " +brr[2]);

        //2D Array>>>>>
        //declaration
        int [][] arr2;
        //allocation
        arr2 = new int [3] [4];
        //initilization
         int [][] arr3 = {
                    {2,4},
                    {5,6,4,4,5,6,},
                    {7,8,6,7,9},
                    {3,1,3,}
                };
         int sum1 = 0;
         int mul1 = 1;
         int maxValue2D = arr3[0][0];
         int minValye2D = arr3[0][0];
        int rowLength = arr3.length;
        //int colLength = arr3[0].length;// if rows and cols are same

        for (int rowIndex=0; rowIndex <= rowLength-1; rowIndex++){
            int colLength = arr3[rowIndex].length; //if each rows has diff cols
            for (int colIndex = 0; colIndex <= colLength-1; colIndex++) {
                System.out.print(arr3[rowIndex][colIndex] + " ");
                int value = arr3[rowIndex][colIndex];
                sum1 += value;
                mul1 *= value;

                //max value
                if( arr3[rowIndex][colIndex] > maxValue2D) {
                    maxValue2D = arr3[rowIndex][colIndex];
                }

                //min Value
                if( arr3[rowIndex][colIndex] < minValye2D) {
                    minValye2D = arr3[rowIndex][colIndex];
                }

            }
            System.out.println();
        }
        System.out.println("Sum of 2D array: " +sum1);
        System.out.println("Multiplication of 2D array: " +mul1);

        //max value
        System.out.println("Max Value in 2D Array: " + maxValue2D);
        System.out.println("Max Value in 2D Array: " + minValye2D);

        //user input of 2D array
        int arrInput [][] = new int [2] [3];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<arrInput.length; i++){
            for (int j=0; j<arrInput[i].length; j++) {
                System.out.println("provides input for row" + i + " column" +j );
                arrInput[i][j] = sc.nextInt();
            }

        }
        System.out.println("2D Array Contains");
        for (int rowIndex=0; rowIndex <= arrInput.length-1; rowIndex++){
            for (int colIndex = 0; colIndex <= arrInput[rowIndex].length-1; colIndex++) {
                System.out.print(arrInput[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }

    }
}
