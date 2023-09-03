package QuestionBank;

import java.util.Scanner;

public class SoruDenemeleri {
    public static void main(String[] args) {

        System.out.println("ali ");
        System.out.print("can");//print ifadesi bir alttaki sout cümlesi ile birleşik yazar.
        System.out.println("kaç");

        int num = 12;
        num=num-2;//doğru
        num-=2;//doğru
        //num-=; yanlış
        //num-2=num; yanlış

        //System.out.println(2+3=5);(2+3==5 olmalı

        Scanner scan = new Scanner(System.in);
        System.out.println("Kare'n!n b!r kenar uzunlugunu g!r!n!z");
        double kenar = scan.nextDouble();
        double alan = kenar*kenar;
        System.out.println("Alan: " + alan);


        int a=1563;
        System.out.println(a % 10);//3
        System.out.println(a % 100);//63
        System.out.println(a % 1000);//563



    }
}
