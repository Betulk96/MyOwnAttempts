package JavaKaynakSoru;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        /*Switch case
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme,
    çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yapmak isdediğiniz işlemi belirtiniz. " +
                "\n Güncel Bakiye Öğrenmek için 1'e basınız " +
                "\n Para Yatırmak için 2'ye basınız " +
                "\n Para Çekmek 3'e basınız " +
                "\n ÇIKIŞ yapmak için 4' basınız");
        String cevap= scan.nextLine();
        int currenAccaount=1000;

        switch (cevap.toLowerCase()){
            case "1":
                System.out.println(currenAccaount);
                break;
            case "2":
                System.out.println("Yatırmak İsteiğiniz Para Miktarını Belirtiniz.");
                int yatırma= scan.nextInt();
                System.out.println("Hesabınıza "+yatırma+"Tl yatırılmıştır." +
                        "\nGüncel bakiyeniz "+(currenAccaount+yatırma)+"TL'dir");
                break;
            case "3":
                System.out.println("Çekmek isteiğiniz para miktarını giriniz.");
                int cekme= scan.nextInt();
                System.out.println("Hesabınızdan "+cekme+"Tl çekilmiştir." +
                        "\nGüncel bakiyeniz "+(currenAccaount-cekme)+"TL'dir");
                break;
            case "4":
                System.out.println("ÇIKIŞ");
            default:
                System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");



        }















    }
}
