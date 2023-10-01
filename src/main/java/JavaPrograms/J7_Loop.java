package JavaPrograms;

import static JavaPrograms.Utils.input;

public class J7_Loop {
    public static void main(String[] args) {
//23. Print all alphabet using for loop
        for (char harf = 'a'; harf <= 'z'; harf++) {
            System.out.print(harf + ", ");
        }

        System.out.println();
//16. Simple For Loop
        for (int i = 0; i <11 ; i++) {
            System.out.print(i+",");
        }
        System.out.println();
//17-18. Print Star console using Loop
        /*

         *
         **
         ***
         ****
         *****
         ******
         *******
         ********
         *********
         **********

         */

        int row, numberOfStars;
        for (row = 1; row <= 10; row++)
        {
            for(numberOfStars = 1; numberOfStars <= row; numberOfStars++)
            {
                System.out.print("*");
            }
            System.out.println(); // Go to next line
        }
//19. While loop Program

        int n,counter=0;
        System.out.println("Input an integer :"+"\n!!Exist Loop press 0!!");

        while ((n = input.nextInt()) != 0)
        {
            System.out.println("You entered " + n);
            System.out.println("Input an integer :");
            counter++;
        }
        System.out.println("You entere number of integer : "+counter);
        System.out.println("Out of loop");

//20. Print Reverse number
        int k, reverse = 0;
        System.out.println("Enter the number with more than two digits to reverse :" );

        k = input.nextInt();
        while( k != 0 )
        {
            reverse = reverse * 10;
            reverse = reverse + k%10;
            k = k/10;
        }
        System.out.println("Reverse of entered number is "+reverse);

//21. While loop using break

        while (true) {
            System.out.println("Input an integer");
           int x = input.nextInt();
            if (x == 0) {
                break;
            }
            System.out.println("You entered " + x);
        }
//22. While loop using break and continue

        while (true) {
            System.out.println("Input an integer");
            n = input.nextInt();
            if (n != 0) {
                System.out.println("You entered " + n);
                continue;
            } else {
                break;
            }

            }
//24. Enhance loop-Array to normal output
        int primes[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        for (int t: primes) {
            System.out.print(t+",");//2,3,5,7,11,13,17,19,23,29
        }
        System.out.println();
//For String-Array to normal output

        String languages[] = { "C", "C++", "Java", "Python", "Ruby"};
        for (String sample: languages) {
            System.out.print(sample+",");//C,C++,Java,Python,Ruby
        }

    }
}
