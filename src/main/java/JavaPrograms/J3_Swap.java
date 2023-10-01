package JavaPrograms;

import static JavaPrograms.Utils.input;

public class J3_Swap {

    public static void main(String[] args) {

//6. How to swap 2 no using 3rd variable

        int x, y, temp;
        System.out.println("Enter x and y :");
        x = input.nextInt();
        y = input.nextInt();

        System.out.println("Before swapping \nx : "+ x +" \ny : "+ y);

        temp = x;
        x = y;
        y=temp;

        System.out.println("After Swapping \nx : "+ x +" \ny : "+ y);

//7. How to swap 2 no without using 3rd variable

        int a,b;

        System.out.println("Enter a and b :");
        a = input.nextInt();
        b = input.nextInt();

        System.out.println("Before swapping \na : "+ a +" \nb : "+ b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After Swapping \na : "+ a +" \nb : "+ b);



    }
}
