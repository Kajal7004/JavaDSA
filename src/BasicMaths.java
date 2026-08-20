public class BasicMaths {
    //print digits
    static void printdigits(int digit) {

        while(digit != 0) {
            int num = digit % 10;
            System.out.println(num);

            digit = digit / 10;
        }

    }
    //count digits
    static int countdigits(int digit) {
        int count = 0;
        while(digit !=0){
            int num = digit % 10;
            count++;
            digit = digit/10;

        }
        return count;
    }

    //sum of all digit
    static int sumdigit(int digit) {
        int sum = 0;
        while(digit != 0) {
            int num = digit % 10;
            sum += num;
            digit = digit/10;

        }
        return sum;
    }

    //reverse of all digit
    static int reversedigit (int digit) {
        int rev = 0;
        while (digit != 0) {
            int num = digit % 10;

            rev = rev*10+num;

            digit = digit/10;
        }
        return rev;
    }

    //palindrome num
    static boolean ispalindrome(int digit) {
        int currNum = digit;
        int revNum = reversedigit(digit);
        if(currNum == revNum) {
            return true;
        } else {
            return false;
        }
    }

    //prime no.
    static boolean isprime(int digit) {
        for(int i=2; i<digit; i++){
            if(digit % i == 0){
                return false;
            }
        }

        //2nd approach
        for (int i=2; i*i<digit; i++) {
            if(digit % i == 0){
                return false;
            }
        }
        return true;
    }

    //fing gcd
    static int getgcd(int a, int b) {
        while(b != 0) {
            int oldValueofb = b;
            b = a%b;
            a = oldValueofb;
        }
        return a;
    }

    //find LCM
    static int getlcm (int a, int b) {
        int gcd = getgcd(a,b);
        int prod = a*b;
        int lcm = prod / gcd;
        return  lcm;
    }

    //find armstrong no
    static boolean isArmstrongNo(int digit) {
        int originalNo = digit;

        int sum = 0;
        while ( digit !=0 ) {
            int num = digit % 10;
            int cube = num*num*num;
            sum = sum+cube;

            digit = digit/10;

        }
        if(originalNo == sum) {
            return true;
        } else {
            return false;
        }
    }

    //check perfect number
    static boolean isperfectnum(int digit) {
        int sum =1;
        for (int i = 2; i * i<digit; i++) {
            if(digit % i == 0 ){
                int firstfactor = i;
                int secondfactor = digit/i;
                sum = sum +firstfactor +secondfactor;
            }
        }
        if(sum == digit) {
            return true;
        } else {
            return false;
        }
    }

    //print all prime number
    static void printPrimeNo(int n) {
       for(int digit =2; digit <= n; digit++) {
           boolean isPrime = isprime(digit);
           if(isPrime == true) {
               System.out.println(digit);
           }
       }

    }
     static void main() {
        int digit = 6;
         printPrimeNo(9);
        // System.out.println(isperfectnum(digit));
//         System.out.println(isArmstrongNo(digit));
//         System.out.println(getlcm(18,12));
//         System.out.println(getgcd(18,12));
//         System.out.println(isprime(digit));
//         System.out.println(ispalindrome(digit));
//         System.out.println(reversedigit(digit));
        // System.out.println(sumdigit(digit));
//        printdigits(digit);
//         System.out.println(countdigits(digit));
    }
}
