package Openai;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

/*
Ödev: Faktöriyel hesaplayan bir Java programı yazın.
 Kullanıcıdan bir sayı girmesini isteyin ve girilen sayının faktöriyelini hesaplayarak ekrana yazdırın.
Faktöriyel, bir pozitif tam sayının kendisi ile 1 arasındaki tüm pozitif tam sayıların çarpımıdır.
Örneğin, 5 faktöriyeli (5!) şu şekildedir: 5 * 4 * 3 * 2 * 1 = 120.
Programınız aşağıdaki adımları takip edebilir:
1-Kullanıcıdan bir tamsayı girişi alın.
2-Bir döngü kullanarak girilen sayının faktöriyelini hesaplayın.
3-Sonucu ekrana yazdırın.


 */
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        int num=input.nextInt();

        int faktoriyel=1;
        for (int i = num; i >0 ; i--) {
            faktoriyel = faktoriyel * i;

        }

        System.out.println(faktoriyel);



//kullanıcaıdan 100'den küçük bir tamsayı isteyiniz.
//  1den başlayarak girilen sayıya kadar 3 veya 5 in katı olanları yazdırınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 100den küçük bir sayı giriniz.");
        int a=scan.nextInt();


        for (int i = 1; i < a ; i++) {

            if (i%3==0 || i%5==0){
                System.out.println(i);
            }
        }

//
        for (int i = 1; i < a ; i++) {
            System.out.println(i);
            if (i%3==0 || i%5==0){
                System.out.println("Java Güzeldir.");
            }
            if (i%3==0 ){
                System.out.println("Java ");
            }
            if ( i%5==0){
                System.out.println(" Güzeldir");
            }
        }


// Bir Java programı yazmanızı isteyelim.
// Program, kullanıcının girdiği bir kelimenin içinde kaç tane sesli harf (a, e, i, o, u) bulunduğunu hesaplayarak ekrana yazdırsın.


        Scanner word=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String b= word.next();

        String c="";
        for (int i = 0; i <b.length() ; i++) {
            char ch =b.charAt(i);

            if (ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){

                c+=b.charAt(i);


            }

        }
        System.out.println("sesli harf sayısı = "+c.length());





    }
}
