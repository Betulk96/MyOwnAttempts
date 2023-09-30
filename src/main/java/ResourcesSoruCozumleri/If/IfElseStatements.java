package ResourcesSoruCozumleri.If;

import java.util.Scanner;

public class IfElseStatements {
    public static void main(String[] args) {

//2-Kullanıcıdan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadığını yazdırın.

    Scanner input=new Scanner(System.in);
    System.out.println("Bir karakter giriniz.");
    String a=input.next();
    //char a2=a.charAt(0); böyle yapıp yapaz zekanının if i gibide yabılabilir.

    boolean a1= a.replace("[^a-zA-z]","").length()>0;

        if (a.length()==1 && a1){
            System.out.println("girdiğiniz karakter harf");
        }else if (a.length()>1){
            System.out.println("birden fazla char girdiniz.");
        }else {
            System.out.println("bir harf char'ı girmediniz.");
        }

//ChatGpt-ama 2 ab şeklinde değer girebiliyoruz.birden fazla girdiğimizde ilk charı alıyor.ama charda birden fazla da giremeyiz.
        Scanner input1 = new Scanner(System.in);
        System.out.print("Bir karakter girin: ");
        char ch = input1.next().charAt(0);//sadece ilk harfi 0 indexini alır.

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {//bu kısımda sadece charda oluyor.
            System.out.println(ch + " bir harf.");
        } else {
            System.out.println(ch + " bir harf değil.");
        }

    //3-Kullanıcıya yaşını sorun 65den küçük ise "emekli olamazsın,çalışmalısın"
        //65'den büyük ise "emekli olabilirsin" yazdırın

    Scanner scanner=new Scanner(System.in);
        System.out.println("Yaşınızı giriniz.");
        int age= scanner.nextInt();

        if (age<65){
            System.out.println("emekli olamazsın,çalışmalısın");
        }else {
            System.out.println("emekli olabilirsin");
        }

    //4-Kullanıcıdan bir üçgenin üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise
        // ekrana "eşkenar üçgen " yazdırın. diğer durumlarda "Eşkenar değil".yazdırın.

        Scanner scanner1=new Scanner(System.in);
        System.out.println("Üç kenar Uzunluğu giriniz.");
        int num= scanner1.nextInt();
        int num2= scanner1.nextInt();
        int num3= scanner1.nextInt();

        if ((num==num2)&&(num3==num2)){
            System.out.println("eşkenar üçgen ");
        }else {
            System.out.println("Eşkenar değil");
        }






    }
}
