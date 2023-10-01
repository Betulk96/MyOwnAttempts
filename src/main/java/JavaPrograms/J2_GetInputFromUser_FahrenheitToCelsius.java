package JavaPrograms;

import java.util.Scanner;

import static JavaPrograms.Utils.input;

public class J2_GetInputFromUser_FahrenheitToCelsius {

    public static void main(String[] args) {
//4. How to get Using input using Scanner Program in java
  //      int i;
  //      double d;
  //      String s;
//

//
  //      System.out.println("Enter Integer :");
  //      i=input.nextInt();
  //      input.nextLine();//dummy code
  //      System.out.println("Your Integer : "+ i);
//
  //      System.out.println("Enter Decimal Number : ");
  //      d=input.nextDouble();
  //      input.nextLine();//dummy code
  //      System.out.println("Your Decimal Number : "+ d);
//
  //      System.out.println("Enter word or sentence : ");
  //      s=input.nextLine();
  //      System.out.println("Your Enter : "+s);
//
//

//5. How to convert Fahrenheit to Celsius

        System.out.print("Pleas enter Temperature in Fahrenheit : ");
        double temperature= input.nextDouble();

        temperature=(temperature-32)*5/9;
        System.out.println("Temperature in Celsius = "+ temperature);

        System.out.println("***");
            //celcius to Fahrenheit
        for (int i = 50; i < 61; i++) {
            System.out.println(i + "celsius =" + ((i * 1.8) + 32) + " fahrenheit");
        }




    }
}
