package JavaKaynakSoru;

import java.util.ArrayList;
import java.util.Scanner;

public class Bakkal {
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap.
     * */
    public static void main(String[] args) {
        //1. Adım
        ArrayList<String> gunler = new ArrayList<>();
        gunler.add("Pazartesi");
        gunler.add("Salı");
        gunler.add("Çarşamba");
        gunler.add("Perşembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");
        //2. Adım
        ArrayList<Integer> gunlukKazanclar = new ArrayList<>();
        //3. Adım
        System.out.println("Lütfen Günlük Kazancınızı Giriniz");
        Scanner input = new Scanner(System.in);
        int dayCounter = 1;
        while (dayCounter < 8) {
            System.out.print(gunler.get(dayCounter - 1) + " : ");
            gunlukKazanclar.add(input.nextInt());
            dayCounter++;
        }
        //4. Adım
        double ortalamaKazanc = getOrtalamaKazanc(gunlukKazanclar);
        System.out.println("Ortalama Kazanc : " + ortalamaKazanc + "\n");

        //5. Adım
        getOrtalamaninUstundeKazancGunleri(ortalamaKazanc, gunlukKazanclar, gunler);
        System.out.println("\n");

        //6.Adım
        getOrtalamaninAltindaKazancGunleri(ortalamaKazanc, gunlukKazanclar, gunler);


    }

    private static double getOrtalamaKazanc(ArrayList<Integer> gunlukKazanclar) {
        double toplamKazanc = 0;
        for (Integer w : gunlukKazanclar) {
            toplamKazanc = w + toplamKazanc;
        }
        double ortalamaKazanc = toplamKazanc / gunlukKazanclar.size();
        return ortalamaKazanc;
    }

    private static void getOrtalamaninUstundeKazancGunleri(double ortalamaKazanc, ArrayList<Integer> gunlukKazanclar, ArrayList<String> gunler) {
        for (int i = 0; i < 7; i++) {
            if (gunlukKazanclar.get(i) > ortalamaKazanc) {
                System.out.println(gunler.get(i) + " gün ki kazancınız ortalamanın üstünde");
            }
        }
    }

    private static void getOrtalamaninAltindaKazancGunleri(double ortalamaKazanc, ArrayList<Integer> gunlukKazanclar, ArrayList<String> gunler) {
        for (int i = 0; i < 7; i++) {
            if (gunlukKazanclar.get(i) < ortalamaKazanc) {
                System.out.println(gunler.get(i) + " gün ki kazancınız ortalamanın altında");
            }
        }
    }
}
