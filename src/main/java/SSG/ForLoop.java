package SSG;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

     //100'e(dahil) kadar olan tek ve çift sayıları iki ayrı düngü ile yazdırın.


        for (int i = 0; i <101 ; i++) {
            if (i%2==0) System.out.print(i+",");
        }
        System.out.println();
        for (int j = 0; j <101 ; j++) {
            if (j%2!=0) System.out.print(j+",");
        }
        System.out.println("*".repeat(42));
        for (int k = 0; k <101; k++) {
            if (k%2==0) System.out.print(k+" | ");
            else System.out.println(k+" ");
        }

        System.out.println();
//Belirlenen sayının 1den 10 a kadar çarğım sonuçlarını yapan kod yaz.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Çarpım tablosuna girmek istediğiniz sayıyı giriniz.");
        int num= scanner.nextInt();

        for (int i = 0; i <11 ; i++) {
            System.out.println(num + " X "+i+" = "+(num*i));
        }

//Kullanıcıdan 100den küçük bir tam sayı isteyiniz.
// 1'den başlayarak girilen sayıya kadar(istenen sayı dahil )^ün katı olan sayıları yazdırın.

        System.out.println("Lütfen 100den küçük bir değer giriniz.");
        int num1=scanner.nextInt();

        if (num1>0 && num1<101){
            for (int i = 1; i <=num1 ; i++) {
                if (i%3==0){
                    System.out.print(i+",");
                }
            }

        }else System.out.println("belirtilen aralıkta değer giriniz.");
        System.out.println();
//Kullanıcan 100'den küçük bir tamsayı isteyin.
        /*
        1'den başlayarak girilen sayıya kadar tüm sayıları yazdırın .ancak;
        sayı 3'ün katı ise sayı yerine "Java yazdırın.
        sayı 5'in katı ise sayı yerine "Güzeldir.yazdırın.
        sayı hem 3 hemde 5'in katı ise "Java Güzeldir yazdrın.
         */

        System.out.println("Lütfen 100den küçük bir değer giriniz.");
        int num2=scanner.nextInt();

        if (num1>0 && num1<101){
            for (int i = 1; i <=num2 ; i++) {

                if (i % 3 ==0 && i % 5 == 0) {
                    System.out.print(" 35Java Güzeldir, ");
                }else if (i % 5 == 0) {
                        System.out.print(" 5Güzeldir, ");
                }else if (i % 3 == 0) {
                    System.out.print(" 3Java, ");
                } else  System.out.print(i + " , ");

            }

        }else System.out.println("belirtilen aralıkta değer giriniz.");

/*
 for (int i = 1; i <b ; i++) {
            if (i%3==0){
                System.out.print("Java, ");
            }
            if (i%5==0) {
                System.out.print("Güzeldir, ");
            }
            if (i%3==0 && i%5==0){
                System.out.print("Java Güzeldir. ");
            }
        }bu şekilde yaabilirdir ama i yi yazdırmıyor.
 */
















            }
        }







