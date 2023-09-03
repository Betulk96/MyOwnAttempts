package JavaKaynakSoru;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //scanner 01
    /*  Problem Tanımı
        Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
        hesaplayan kodu yazınız.
        Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
        Buna göre 2 işçi aynı işi kaç günde yapar?
        Örnek Ekran Çıktısı
         Bir işçi işi kaç günde bitirmektedir? 10
         Toplam kaç işçi çalışacak? 2
        İşin bitme süresi 5 gündür.
    */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir işçi işi kaç günde bitirmektedir? ");
        int birIsci = input.nextInt();
        System.out.println("Toplam kaç işçi çalışacak? ");
        int kacIsci = input.nextInt();
        double isiBitirmeSuresi = (double) birIsci / kacIsci;
        System.out.println("İşin bitme süresi " + isiBitirmeSuresi + " gündür.");

//scanner 02
  /*
        TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.
   */

        Scanner input1 = new Scanner(System.in);
        System.out.println("Lütfen isim soyisim giriniz : ");
        String isimSoyIsim = input1.nextLine();
        System.out.println("Lütfen yas giriniz : ");
        int yas = input1.nextInt();
        System.out.println("Lütfen kilo giriniz(kg) : ");
        double kilo = input1.nextDouble();
        System.out.println("Lütfen boy giriniz(cm) : ");
        int boy = input1.nextInt();
        System.out.println("Lütfen devam edeceğiniz ay süresini giriniz : ");
        int aySuresi = input1.nextInt();
        int toplamUcret = 20 * aySuresi;
        System.out.println("Toplam Ucretiniz : $" + toplamUcret);

        //scanner 03
    /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz
        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */

        Scanner input2 = new Scanner(System.in);
        System.out.print("a sayısını giriniz: ");
        double a = input2.nextDouble();
        System.out.print("b sayısını giriniz: ");
        double b = input2.nextDouble();
        System.out.print("c sayısını giriniz: ");
        double c = input2.nextDouble();
        double sonuc = ((a * a) - (b * b)) / (c * 3);
        System.out.println("sonuc = " + sonuc);


        //scanner 04
    /*
    Kullanicidan kilosunu ve boyunu alip
    Vucut kitle indeksini hesaplayan bir program yaziniz.
    Ipucu : Vucut Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
    ORNEK:
    INPUT      : Kilo: 71
    Boy: 1,72
    OUTPUT  : Vucut Kitle Indeksiniz : 23
    */

            Scanner input3 = new Scanner(System.in);
            System.out.println("Kilonuzu Giriniz(kg.) : ");
            double kilo1 = input3.nextDouble();
            System.out.println("Boyunuzu Giriniz(m.) : ");
            double boy1 = input3.nextDouble();
            double vki = kilo1 / (boy1 * boy1);
            //1.Yol
            if (vki < 18.5) System.out.println("Vucut Kitle Indeksi (VKI) = " + vki + "(Zayıf)");
            else if (vki < 24.9) System.out.println("Vucut Kitle Indeksi (VKI) = " + vki + "(Normal)");
            else if (vki < 29.9) System.out.println("Vucut Kitle Indeksi (VKI) = " + vki + "(Fazla Kilolu)");
            else if (vki > 30) System.out.println("Vucut Kitle Indeksi (VKI) = " + vki + "(Obezite)");

    }
}
