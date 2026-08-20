import java.sql.SQLOutput;
import java.util.*;

public class StringBasics {

    //Q-1 print all the character of string
    public static void printCharacter( ) {
        String str = "Kajal";
        int n = str.length();
        for(int i=0; i<n;i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

    //length of string without using length function
    public static void getLength() {
        String strr = "Prince";
        char[] arr = strr.toCharArray();
        int len = arr.length;
        System.out.println(len);
    }

    public static int  countVowel(String value){
        int count = 0;
        for(int i=0; i<value.length(); i++){
            char ch = value.charAt(i);
            if(!(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch == 'A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')){
                count++;
            }
        }
        return count;
    }

    //reverse string
    public static String reverseString(String value) {
        String reverse = "";
        int n = value.length();
        for(int i = n-1; i>=0; i--) {
            char ch = value.charAt(i);
            reverse += ch;
        }
        return reverse;
    }

    //palindrome string
    //original string
    //reverse string
    //compare both string if it is same then print true otherwise false

    public static Boolean isPalindrome (String value){
       // String returnedValue =reverseString(value);
//        if(value.equals(returnedValue)) {
//            return true;
//        } else {
//            return false;
//        }


        //2nd approach to check palindrome
        int n = value.length();
        int  left = 0;
        int right = n-1;
       // char[] chars = value.toCharArray();

        while (left < right) {
            if(value.charAt(left) != value.charAt(right)){
                return false;
            }

            left++;
            right--;
        }
        return true;


    }
    public static String upperCase(String value) {

        char[] chars = value.toCharArray();
        int n = value.length();
        for(int i=0; i<n; i++){
            char ch = chars[i];
            if(ch>= 'a' && ch <= 'z'){
                chars[i] = (char)(chars[i] - 32);
            }
        }
        return new String(chars);
    }
    public static int frequency(String values) {
        int[] arr = new int[26];
        int n = arr.length;
        for(int i =0; i<n; i++) {
            //System.out.println(arr[i] =0);
            arr[i] = 0;
        }
        for (int i=0; i< values.length(); i++){
//            arr [i] = (arr[i] -97) ;

            arr[ values.charAt(i) - 97 ]++;

        }

//        for(int i =0; i<n; i++) {
//           // System.out.println(arr[i]);
//            arr[i] ;
//        }
        return arr[0];
    }

    public static void main (String[] args) {


        String value = "aabbcce";
        System.out.println(frequency(value));
//        System.out.println(isPalindrome(value));
//        System.out.println(reverseString(value));
       // System.out.println(countVowel(value));
        printCharacter();
        getLength();
        String firstName = "Kajal";
        String lastName = new String("Kumari");
        System.out.println(firstName +" "+ lastName);
        System.out.println(firstName.length());
        System.out.println(firstName.charAt(2));

        // comparison string
        String n1 = "Kajal";
        String n2 = "Kajal";
        String n3 = "KAJAL";

        // using  ==
        if(n1 == n2){
            System.out.println("Both are equal");
        } else {
            System.out.println("Both are not equal");
        }

        //using .equal method
        if(n1 .equals(n3)){
            System.out.println("Both are equal. it matches values and it is case sensitive");
        } else {
            System.out.println("Both are not equal");
        }

        //using .equalIgnoreCase
        if(n1 .equalsIgnoreCase(n3)){
            System.out.println("Both are equal. its ignores case sensitive");
        } else {
            System.out.println("Both are not equal");
        }


        //String Input
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Provide input for content:");
//        String str1 = sc.nextLine();
//        System.out.println("value of nextLine: " +str1);
//
//        System.out.println("Provide input for content:");
//        String str2 = sc.next();
//        System.out.println("value of next: " +str2);

        //isEmpty method
        String str = "  kAjal  ";
        System.out.println(str.isEmpty());
        //.length
        System.out.println(str.length());
        //charAt
        System.out.println(str.charAt(4));
        //isBlank
        System.out.println(str.isBlank());
        //.trim
        System.out.println(str.trim());
        str = str.trim();
        //isUpperCase
        System.out.println(str.toUpperCase());
        //toLowerCase
        System.out.println(str.toLowerCase());

        //.subString
        String name = "My name is Kajal";
        System.out.println(name.substring(1,6));
        //.contains
        System.out.println(name.contains("Kajal"));
        //.startsWith()
        System.out.println(name.startsWith("My"));
        //.endsWith()
        System.out.println(name.endsWith("kajal"));

        // .valueof(Anytype)
        int num = 3245;
        String st = String.valueOf(num);
        System.out.println(num+1);
        System.out.println(st+1);

        //tocharArray
        String name1 = "Kajal";
        char[] ch = name1.toCharArray();

        for(char crr : ch){
            System.out.println("value of array: "+crr);
        }

        //.split
        String input = "I,am,kajal";
        String[] words = input.split(",");
        for(String stn:words){
            System.out.println(stn);
        }

        String myname = "kajal";
        myname = myname.replace('a','u');
        System.out.println(myname);
    }



}
