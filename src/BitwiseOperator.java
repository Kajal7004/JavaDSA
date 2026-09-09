public class BitwiseOperator {
    public static void main(String[] args) {
        
    
    int a = 5;
    int b = 6;

    System.out.println(a & b);
    System.out.println(a | b);
    System.out.println(a ^ b);
    System.out.println( ~ b);


    //Left shift (multiply by 2 )
    int n =5;
    for (int i=1; i<=32; i++){
        n = n <<1;
        System.out.println(n);
        System.out.println();
    }

    //Right shift (Divide by 2 )
     int n =100;
    for (int i=1; i<=10; i++){
        n = n >> 1;
        System.out.println(n);
        System.out.println();
    }

    //Odd Even
    int n = 4;
    if((n&1) == 0) {
        System.out.println("Even");
    } else {
        System.out.println("Odd");
    }

   // Power of 2
    int n = 5;
    int count = 0;
    while ( n != 0 ){
        if ((n&1) != 0) {
        count++;
    }
    n = n>>1;
    }
    System.out.println("Set bit: "+count);

    //2nd approach of power of 2
    int n=32;
    if((n& (n-1)) == 0){
        System.out.println("It is power of 2");
    } else {
        System.out.println("It is nor power of 2");
    }

    

    }
}
