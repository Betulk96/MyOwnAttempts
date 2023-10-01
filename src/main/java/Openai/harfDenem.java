package Openai;

import java.util.HashSet;

public class harfDenem {
    public static void main(String[] args) {
        String password = "Merhaba123";
        boolean containsLetters = password.matches(".*[a-zA-Z].*");

        if (containsLetters) {
            System.out.println("Veri içinde harf karakterleri bulunuyor.");
        } else {
            System.out.println("Veri içinde harf karakterleri bulunmuyor.");
        }

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }


/*
For döngüsü kullanarak aşağıdaki şekli oluşturun.

0 puan
Başlıksız Resim
 */

        System.out.println("<------->");
        for (int i = 1; i <= 5; i++) {
            System.out.println("+\t+");
            System.out.println(" +");
        }
        System.out.println("<------->");

        for (int i = 50; i < 61; i++) {
            System.out.println(i + "celsius =" + ((i * 1.8) + 32) + " fahrenheit");
        }

/* ****INTERVIEW SORUSU****
size verilen bir String'i ters ceviren kodu yaziniz.

 */
        String s = "Merhaba";
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));

        }


        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.println(i + "x" + j + "=" + i * j);
            }

        }


        for (int i = 9; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }


        String a = "America";

        for (int i = 0; i < a.length(); i++) {

            if (!(a.charAt(i) == 'c')) {
                System.out.print(a.charAt(i));

            }
            if ((a.charAt(i) == 'c')) break;
        }
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == 'c') {
                break;
            }
            System.out.print(c);
        }


        for (int i = 1; i <= 10; i++) {
            System.out.print(a);
            for (int b = 10; b > i; b--) {
                System.out.print("*");
            }
            System.out.println();
        }/*

        1*********
        2********
        3*******
        4******
        5*****
        6****
        7***
        8**
        9*
        10
*/


    }
}
