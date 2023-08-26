package ResourcesSoruÇözümleri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
//Kullanıcıdan Gün ismini yazmasını isteyin.
        // Girilen isim geçerli bir gün ise isminin 1,2,3 harflerini ilk harf büyük diğer ikisi küçük olarak yazdırn
        //Gün ismi geçerli değilse "Geçerli gün ismi giriniz yazdırın.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir gün ismi girin: ");
        String gunIsmi = scanner.nextLine();


       boolean a=gunIsmi.equalsIgnoreCase("pazartesi") || gunIsmi.equalsIgnoreCase("salı") || gunIsmi.equalsIgnoreCase("çarşamba") ||
               gunIsmi.equalsIgnoreCase("perşembe") || gunIsmi.equalsIgnoreCase("cuma") || gunIsmi.equalsIgnoreCase("cumartesi") ||
               gunIsmi.equalsIgnoreCase("pazar");


        if (a) {

            String ilkHarf = gunIsmi.substring(0, 1).toUpperCase();
            String digerHarfler = gunIsmi.substring(1, 3).toLowerCase();
            String sonuc = ilkHarf + digerHarfler;
            System.out.println("Sonuç: " + sonuc);
        } else {
            System.out.println("Geçerli bir gün ismi giriniz.");
        }




}
}
