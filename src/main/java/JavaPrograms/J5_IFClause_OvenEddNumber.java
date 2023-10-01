package JavaPrograms;

import static JavaPrograms.Utils.input;

public class J5_IFClause_OvenEddNumber {
    public static void main(String[] args) {

//10. If Else clause in java
        boolean learning =true;
        if (learning) System.out.println("Perfect Java Programmer");
        else System.out.println("What are you doing !!");

//11. If Else clause in java-Program 2
        int passingMarks,marksObtained;

         passingMarks=60;

        System.out.println("Please enter marks scored by you :");
        marksObtained=input.nextInt();

        if (marksObtained>=passingMarks) System.out.println("You passed the exam");
        else System.out.println("unfortunately you failed to pass the exam ,Maybe Next Time,Time To Work");

//12. Nested If Else clause in java

        char grade;
        if (marksObtained >= passingMarks) {
            if      (marksObtained > 90)   grade = 'A';
            else if (marksObtained > 75)   grade = 'B';
            else if (marksObtained > 60)   grade = 'C';
            else grade = 'D';
            System.out.println("You passed the exam and your grade is " + grade);

        } else grade = 'F';  System.out.println("You failed and your grade is " + grade);

//13. How to check Odd and Even Number
        System.out.println("Enter an integer to check if it is odd or even ");
        int z=input.nextInt();
        if (z%2==0) System.out.println("You entered number is even number");
        else System.out.println("you entered number is odd number");





    }
}
