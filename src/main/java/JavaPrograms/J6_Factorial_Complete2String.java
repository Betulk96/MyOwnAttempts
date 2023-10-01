package JavaPrograms;

import java.math.BigInteger;

import static JavaPrograms.Utils.input;

public class J6_Factorial_Complete2String {
    public static void main(String[] args) {
//14. Find factorial for given no
        System.out.println("Enter an integer to calculate it's factorial :");
        int a = input.nextInt();

        int factorial = 1;
        if (a < 0) System.out.println("Number should be non-negative.");
        else if (a > 0) {
            for (int i = a; i > 0; i--) {
                factorial *= i;
            }
            System.out.println(a + "!= " + factorial);
        } else System.out.println(0 + "!= " + 1);

        ////Calculate factorial for large No
        int n, c;
        BigInteger inc = new BigInteger("1");
        BigInteger fact = new BigInteger("1");

        System.out.println("Input an integer");
        n = input.nextInt();
        input.nextLine();
        for (c = 1; c <= n; c++) {
            fact = fact.multiply(inc);
            inc = inc.add(BigInteger.ONE);
        }
        System.out.println(n + "! = " + fact);

//15. How to complete 2 string
        String s1, s2;
        System.out.println("Enter the first string :");
        s1 = input.nextLine();
        System.out.println("Enter the second string :");
        s2 = input.nextLine();

        if ( s1.compareTo(s2) > 0 )
            System.out.println("First string is greater than second.");
        else if ( s1.compareTo(s2) < 0 )
            System.out.println("First string is smaller than second.");
        else
            System.out.println("Both strings are equal.");














    }


}

