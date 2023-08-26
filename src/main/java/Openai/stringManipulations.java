package Openai;

import java.util.Arrays;
import java.util.Scanner;

public class stringManipulations {
    public static void main(String[] args) {

        //Kullanıcıdan bir metin girişi alın.
        Scanner input=new Scanner(System.in);
        String text=input.nextLine();

        //Girilen metni ters çevirin ve sonucunu yazdırın.
        String ters ="";
        for (int i = text.length()-1 ; i >=0 ; i--) {

           ters=ters+text.charAt(i);
        }
        System.out.println(ters);//abahrem

       // Girilen metni büyük harfe çevirin ve sonucunu yazdırın.
        String buyuk=text.toUpperCase();
        System.out.println(buyuk);//MERHABA

        //Metindeki kelimeleri ayırın, her bir kelimeyi ters çevirin ve kelimeleri tersten sıralayın. Sonuçları yazdırın.

        String a[]=text.split(" ");
        System.out.println(Arrays.toString(a));//[merhaba]



        for (int i = 0; i <a.length ; i++) {
            String ters1="";
            for (int j = a[i].length()-1; j>=0  ; j--) {
                ters1=ters1+a[i].charAt(j);
            }
            a[i]=ters1;
        }
        Arrays.sort(a);
        System.out.println("Kelimeleri Ters Çevrilmiş ve Sıralanmış Metin: "+Arrays.toString(a));//abahrem










    }
}
