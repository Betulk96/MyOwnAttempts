package JavaKaynakSoru;

import java.util.Scanner;

/* Iki kisinin oynayacagi bir kelime oyunu uretelim
 * Kurallar
 * 1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
 *
 * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
 *      * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
 *        ve 3.adima gecin
 *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun
 *        kazandigini yazip oyunu bitirin
 *
 * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
 *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
 *          basa mi sona mi ekleyecegini sorun
 *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
 *
 *      *   Devam etmek istemezse
 *          "Oyun bitti" yazin
 *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
 */
public class KelimeUretme {
    public static void main(String[] args) {

        System.out.println("**Oyunumuza Hoşgeldiniz.Toplam 10 hamleniz Vardır**");
        Scanner input=new Scanner(System.in);
        System.out.print("1.Oyuncu \nBir Kelime Giriniz: ");
        String kelime= input.nextLine();

        int counter=0;
        int P1=0;
        int P2=0;
            do {
                System.out.print("Girdiğiniz Kelime : " + kelime + "\n2.Oyuncu:\nGirilen kelimeyi Kabul Ediyor Musunuz? T / F\n");
                String c1 = input.nextLine();
                if (c1.contains("t") || c1.contains("T")) {

                     if (counter % 2 == 0) P1 += kelime.length();
                        else P2 += kelime.length();
                        counter++;

                    // System.out.print("Oyuna Devam Etmek İstiyor Musunuz? T/F\n");
                    //String c2 = input.nextLine();

                    //if (c2.contains("t") || c2.contains("T")) {
                        System.out.print("Yeni Eklemek İstediğiniz Kelimeyi Giriniz:\n");
                        String kelime2 = input.nextLine();
                        System.out.print("Kelimeyi Başa Eklemek İçin '1' , Sonuna Eklemek İçin '2'yi Seçiniz.");
                        char k4 = input.next().charAt(0);
                        if (k4 == '1') {
                            System.out.print(" "+kelime2 + " " + kelime);
                            kelime=kelime2+" "+kelime;
                        } else {
                            System.out.print(" "+kelime + " " + kelime2);
                            kelime=kelime+" "+kelime2;
                            }
                }else {
                        System.out.print("Geçersiz Kelime\n1.Oyuncu Kazandı");
                    break;
                }
                System.out.println("\nKalan Hamle Sayınız: "+(10-counter));
            }while (counter<=10);

        System.out.println("Oyun Bitti");

        if (P1>P2) System.out.print("1.Oyuncu Kazandı.Tebrikler");
        else System.out.print("2.Oyuncu Kazandı.Tebrikler");













    }
}
