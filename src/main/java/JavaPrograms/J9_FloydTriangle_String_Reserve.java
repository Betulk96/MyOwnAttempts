package JavaPrograms;

import static JavaPrograms.Utils.input;

public class J9_FloydTriangle_String_Reserve {
    public static void main(String[] args) {
//28. Print Floyd’s Triangle
        int a, b, c, num = 1;
        System.out.println("Enter the number of rows of floyd's triangle you want");
        a = input.nextInt();
        input.nextLine();
        System.out.println("Floyd's triangle :-");
        /*
        1
        2   3
        4   5   6
        7   8   9   10
        11  12  13  14  15
        */

        for (b = 1; b <= a; b++) {
            for (c = 0; c < b; c++) {
                System.out.print(num+"  ");
                num++;
            }
            System.out.println();
        }

//29. Find All substring of string

        System.out.println("Enter a string to print it's all substrings");
        String s = input.nextLine();

        String sub;
        System.out.println("Substrings of \""+s+"\" are :-");
      for (int i = 0; i <s.length() ; i++) {
          for (int j = 1; j <=s.length()-i ; j++) {
              sub=s.substring(i,i+j);
              System.out.println(sub);
          }
      }

        for (int i = 0; i <s.length() ; i++) {
            sub=s.substring(i,s.length());
            System.out.println(sub);
        }/*
        merhaba
        erhaba
        rhaba
        haba
        aba
        ba
        a
        */
//30. Print reverse string
        System.out.println("Enter a string to reverse");
        String original = input.nextLine();

        String reserve="";
        for (int i = original.length()-1; i >=0 ; i--) {
            reserve+=(original.charAt(i));
        }
        System.out.println(reserve);




    }
}
