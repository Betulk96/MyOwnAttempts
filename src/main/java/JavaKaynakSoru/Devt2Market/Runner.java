package JavaKaynakSoru.Devt2Market;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    /* Basarili Market alış-veriş programı.
         *
         * 1. Adım: Urunler ve fiyatları içeren listeleri oluşturunuz.
         *          No     Ürün           Fiyat
                   ====  =======        =========
                    00   Domates         2.10 TL
                    01   Patates         3.20 TL
                    02   Biber           1.50 TL
                    03   Soğan           2.30 TL
                    04   Havuç           3.10 TL
                    05   Elma            1.20 TL
                    06   Muz             1.90 TL
                    07   Çilek           6.10 TL
                    08   Kavun           4.30 TL
                    09   Üzüm            2.70 TL
                    10   Limon           0.50 TL
         * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
         * 3. Adım: Kaç kg satın almak istediğini sorunuz.
         * 4. Adım: Alınacak bu ürünü sepete ekleyiniz ve Sepeti yazdırınız.
         * 5. Başka bir ürün alıp almak istemediğini sorunuz.
         * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına yönlendiriniz.
         * 7. Eğer bitirmek istiyorsa ödemeyi kontrol edip para ustu hesaplayarak  programı bitirinzi.
         * */
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        ProductService productService = new ProductService();
      //  List<Product> prlist=new ArrayList<>();
        List <Double> sepet=new ArrayList<>();
        boolean tekrar;
        do {

        System.out.println("Ürün kodunu seçiniz");
        Scanner input = new Scanner(System.in);
        int kod = input.nextInt();
        System.out.println("Ürün kg seçiniz");
        double kg = input.nextDouble();

        sepet.add(kod,kg);
        System.out.println("Başka bir ürün ister misiniz.T/F");
        String cevap=input.next();

        if (cevap.equalsIgnoreCase("T"))tekrar=true;
        else tekrar=false;


    }while (tekrar);

 // 7. Eğer bitirmek istiyorsa ödemeyi kontrol edip para ustu hesaplayarak  programı bitirinzi.
        System.out.println("Parayı Giriniz.");
        Scanner scanner=new Scanner(System.in);
        int money=scanner.nextInt();
        System.out.println(sepet);




    }
}
