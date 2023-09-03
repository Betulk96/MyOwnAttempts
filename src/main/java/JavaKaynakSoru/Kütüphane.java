package JavaKaynakSoru;

import java.util.*;

public class Kütüphane {
    public static void main(String[] args) {

  /*
        - Bir kütüphane yönetimi uygulaması geliştiriyorsunuz.
        - Kullanıcılar, kütüphaneye yeni kitap ekleyebilmeli, kitapları sıralayabilmeli ve
        - kitapları kütüphaneden silebilmelidir.
        - Ayrıca, kullanıcılara kütüphaneyi tamamen sıfırlama seçeneği de sunmanız isteniyor.
        */

    //kütüphane listesi oluşturma
        List <String> japonKlsk=new ArrayList<>();
        japonKlsk.add("Yeni Bir Hamlet");
        japonKlsk.add("Gölgeye Övgü");
        japonKlsk.add("Şeytanın Çırağı");
        japonKlsk.add("Yaban Kazım");

     //kullanıcıdan alınann bilgiyi kütüphaneye ekleme
        Scanner input=new Scanner(System.in);
        System.out.println("Kütüphaneye eklemek istediğiniz Kitap ismini giriniz.");
        String kitap= input.nextLine();
        japonKlsk.add(kitap);
        System.out.println(japonKlsk);

    // Kütüphanedekinleri sıralama
        System.out.println("Kütüphanedeki kitapları alfabetik olarak sıralamak ister misiniz. True/False");
        String sıralama=input.nextLine();
        if (sıralama.equalsIgnoreCase("True")){
            Collections.sort(japonKlsk);
            System.out.println(japonKlsk);
        }else if (sıralama.equalsIgnoreCase("False")){
            System.out.println(japonKlsk);
        }
    //Kütüphaneden kitap çıkarma
        System.out.println("Hangi kitabı kütüphanenizden çıkarmak istersiniz.");
        String çıkarma=input.nextLine();
        japonKlsk.remove(çıkarma);
        System.out.println(japonKlsk);


    //Kütüphaneyi sıfırlama
        System.out.println("kütüphane listesini tamamen silmek istiyor musunuz. True/False");
        String temizleme=input.nextLine();
        if (temizleme.equalsIgnoreCase("true")){
            japonKlsk.clear();
            System.out.println("Kütüphaneniz de kitap bulunmamaktadır."+japonKlsk);
        } else if (temizleme.equalsIgnoreCase("false")) {
            System.out.println("Kütüphanede bulunan mevcut kitaplarınız"+japonKlsk);
        }


















    }















}
