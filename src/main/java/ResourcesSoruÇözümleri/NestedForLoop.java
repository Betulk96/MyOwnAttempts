package ResourcesSoruÇözümleri;

import java.util.Scanner;

public class NestedForLoop {
    public static void main(String[] args) {

//Kullanıcıdan pozitif bir rakam girmesiniisteyin ve girilen rakama göre aşağıdaki şekli çizdirin.
/*
*
* *
* * *
* * * *
 */
        Scanner a=new Scanner(System.in);
        System.out.println(" bir tam sayı giriniz.");
        int b=a.nextInt();

        for (int i = 1; i <=b ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");//her satırı alt alta yazsın diye yukarıda print yazmıştık.
        }


//Kullanıcının girdiği rakama göre çarpım tablosunu oluşturun
        /*
        örn   1 2 3
              2 4 6
              3 6 9
     */
        int sonuç=1;
        for (int i =1; i <=b ; i++) {//i=satır j= sütun
            for (int j = 1; j <=b ; j++) {//i kadar artmasını istediğimiz zaman i yazıyoruz.ama ilk satırda b kadar yazdırdın  istediğimiz için b yazdık-satırı dolduruyoruz
                System.out.print((i * j) + " " );
            }
         System.out.println("");
    }

/*\t, kaçış karakterlerinden biridir ve bir metin içinde "sekme" karakterini temsil eder. Sekme karakteri,
 metinde bir hücrenin veya bölümün bir sonraki sekme duraklamasına yer açmak için kullanılır.
  Özellikle metin tablosu oluştururken veya metni düzenlemek için biçimlendirme yaparken kullanışlıdır.
Örnek olarak, bir çıktıda \t kullanılarak sekme karakterleri eklenirse:

 */
        System.out.println("Bu\tbir\tornektir.");//Bu	bir	ornektir.

//yukarıda örnekte \t yazmasak
        /*  123
            246
            369
    bitişik yazar
         */



    }
}
