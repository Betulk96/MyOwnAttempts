package JavaPrograms;

import java.math.BigInteger;

import static JavaPrograms.Utils.input;

public class J4_AddTwoNumber_FindLargestNo {
    public static void main(String[] args) {
//8. How to add two number
        int x, y;
        System.out.println("Enter two integers to calculate their sum ");

        x = input.nextInt();
        y = input.nextInt();

        System.out.println("Sum of entered integers = " + (x + y));

        //For Large Number
        /*
         BigInteger String kullanır.
        Java'da BigInteger sınıfı, büyük tamsayıları işlemek için kullanılan bir sınıftır.
        Bu sınıf, int veya long türlerinin sınırlarını aşan büyük tamsayılarla çalışmanıza olanak tanır.
        BigInteger, rasyonel sayılar, kesirler ve çok büyük veya çok küçük tamsayılar gibi özel durumları ele almak için de kullanışlıdır.
         */
        String number1 ="9876543210123456789012345678901234567890";
        String number2 ="1234567890123456789012345678901234567890";

        BigInteger first = new BigInteger(number1);
        BigInteger second = new BigInteger(number2);

        //Toplama, Çıkarma, Çarpma ve Bölme İşlemleri:
        BigInteger sum=first.add(second);
        BigInteger difference=first.subtract(second);
        BigInteger multiply=first.multiply(second);
        BigInteger division=first.divide(second);

        System.out.println("Result of addition = " + sum);
        System.out.println("Result of diffrence = " + difference);
        System.out.println("Result of multiply = " + multiply);
        System.out.println("Result of division = " + division);

        BigInteger modArit=first.mod(second);
        System.out.println("modArit = " + modArit);

        int compare=first.compareTo(second);
        // Sonuç negatifse büyükSayı1 < büyükSayı2
        // Sonuç pozitifse büyükSayı1 > büyükSayı2
        // Sonuç sıfırsa büyükSayı1 = büyükSayı2

//9. Find Largest no

        int a,b,c;
        System.out.println("Enter three integers ");
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();

        if (a>b && a>c) System.out.println("First number "+a+" is largest");
        else if (b>a && b>c) System.out.println("First number "+b+" is largest");
        else if (c>b && c>a) System.out.println("First number "+c+" is largest");
        else System.out.println("Entered numbers are not distinct.");//the numbers are not different


    }
}
