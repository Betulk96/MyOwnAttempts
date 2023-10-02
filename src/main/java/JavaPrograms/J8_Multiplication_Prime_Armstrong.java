package JavaPrograms;

import static JavaPrograms.Utils.input;

public class J8_Multiplication_Prime_Armstrong {
    public static void main(String[] args) {
        //25. Print Multiplication table
        int a, i;

        System.out.println("Enter an integer to print it's multiplication table :");
        a = input.nextInt();

        for (i = 0; i < 11; i++) {
            System.out.println(a + "x" + i + "=" + (a * i));
        }

//For Any Number
        for (int j = 1; j < 11; j++) {
            for (int k = 0; k < 11; k++) {
                System.out.println(j + "x" + k + "=" + (k * j));
            }
        }
//26. Print prime no-firdt n prime number-prime number =2,3,5,7,9,11,13,17,19
        int n, status = 1, num = 3;
        System.out.println("Enter the number of prime numbers you want");
        n = input.nextInt();

        if (n >= 1)
        {
            System.out.println("First "+n+" prime numbers are :-");
            System.out.println(2);
        }
        for ( int count = 2 ; count <=n ; ) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                System.out.println(num);
                count++;
            }
            status = 1;
            num++;
        }
//27. Check no is Armstrong or not,(4^3)+ (0^3)+(7^3) = 64+0+343 = 407
        int m, sum = 0, temp, remainder, digits = 0;

        System.out.println("Input a number to check if it is an Armstrong  number");
                m = input.nextInt();
        temp = m;
// Count number of digits
        while (temp != 0) {
            digits++;
            temp = temp/10;
        }
        temp = m;
        while (temp != 0) {
            remainder = temp%10;
            sum = sum + power(remainder, digits);
            temp = temp/10;
        }
        if (m == sum)
            System.out.println(m + " is an Armstrong number.");
        else
            System.out.println(m + " is not an Armstrong number.");
    }
    static int power(int m, int r) {
        int c, p = 1;
        for (c = 1; c <= r; c++)
            p = p*m;
        return p;






    }
}
