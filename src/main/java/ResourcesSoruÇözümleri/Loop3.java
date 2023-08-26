package ResourcesSoruÇözümleri;

import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {

//9-Kullanıcıdan bir String isteyin girdiği Stringin palindrome olup olmadığını kontol edin.tersindend eaynımı
        Scanner input=new Scanner(System.in);
        System.out.println("Bir Kelime Giriniz.");
        String a= input.next();

        String a1="";
        for (int i = a.length()-1 ; i >=0 ; i--) {
            a1=a1+a.charAt(i);
        }
        System.out.println(a1);

        if (a1.equalsIgnoreCase(a)){
            System.out.println("Girdiğiniz kelime Palindromedir.");
        }else {
            System.out.println("Palindrome değildir.");
        }
//Kullanıcıdan iki sayı isteyiniz.Girilen sayılar ve aralarındaki tüm sayıları toplayıp,sonucu yazdırın.
Scanner scan=new Scanner(System.in);
        System.out.println("birinci sayı giriniz");
        int x= scan.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        int y= scan.nextInt();

        int sum=0;
        if (x>y){
       for (int i = y; i <=x ; i++) {
           sum+=i;
       }
            System.out.println(sum);
   }
       if (y>x){
           for (int i = x; i <=y ; i++) {
              sum+=i;
           }
           System.out.println(sum);
       }

//Cgatgpt yapımı
        int toplam=0;
        for (int i = Math.min(x,y); i <= Math.max(x, y); i++) {
            toplam += i;
        }

        System.out.println("Aralıktaki sayıların toplamı: " + toplam);


//Kullanıcıdan 10'dn küçük bir tamsayı isteyin ve girilen sayının faktoriyelini bulun.

Scanner scanner=new Scanner(System.in);
        System.out.println("10'dan küçük bir tam sayı giriniz.");
        int k=scanner.nextInt();

        int fak=1;
        if (0<k && k<10){
            for (int i = k; i >0 ; i--) {
                fak=fak*i;
            }System.out.println(k+"sayısının faktoriyeli ="+fak);
        }


        if (0>k || k>10){
            System.out.println("10 ve 0 aradında bir sayı giriniz.");
        }










    }
}
