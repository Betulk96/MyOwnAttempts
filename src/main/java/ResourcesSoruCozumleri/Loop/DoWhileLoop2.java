package ResourcesSoruCozumleri.Loop;

import java.util.Scanner;

public class DoWhileLoop2 {
    public static void main(String[] args) {

//Kullanıcıdan toplamak üzere pozitif sayılar isteyin,işlemi bitirmek için 0'a basmasını söyleyin.
//Kullanıcı yanlışlıkla negatif sayı girerese o sayıyı dikkate almayın ve negatif sayı giremezsinniz yazdırıp başa dönün.
//Kullanıcı 0'a bastığında toplam kaç pozitif sayı girdiğini ve girdiği pozitif sayıların toplamını ve
// yanlışlıkla kaç negatif sayı girdiğini yazdırınyazdırın.

        Scanner input=new Scanner(System.in);


        int sum=0;
        int pozitifSayac=0;
        int negatifSayac=0;


        do {
            System.out.println("Toplamak üzere pozitif sayılar giriniz.Bitirmek için 0'a basınız.");
            int sayılar=input.nextInt();
            if (sayılar<0){
                System.out.println(" negatif sayı giremezsinniz ");
                negatifSayac++;

            } else if (sayılar>0) {
                    sum+=sayılar;
                    pozitifSayac++;
            }else break;


        }while (true);
        System.out.println(pozitifSayac+" Pozitif sayı girdiniz.Girdiğiniz sayıların toplamı: "+sum);
        System.out.println("Girilen negatif sayısı: "+negatifSayac);


//Kullanıcıdan bir şifre isteyin.Girilen şifreyi aşağıdaki şartlara göre kontol edin ve şifredeki hataları yazdırın.
    /*
    Kullanıcı geçerli bir şifre girinceye kadar bu işlemi tekrar edin
    ve geçerli şifre girdiğinde Şifreniz kabul edilmiştir.yazdırın
    Şifre küçük harf içermelidir.
    Şifre büyük harf içermelidir.
    Şifre özel karakter içermelidir.
    Şifre en az 8 karakter olmalıdır.
    */
        Scanner scan=new Scanner(System.in);




        do {
            System.out.println("Şifrenizi belirleyiniz.");
            String password=scan.nextLine();
             boolean kücükHarf=password.replaceAll("[^a-z]","").length()>0;
             boolean büyükHarf=password.replaceAll("[^A-Z]","").length()>0;
             boolean specialChar=password.replaceAll("\\w","").length()>0;
            boolean şifreKabul=kücükHarf && büyükHarf && specialChar;

            if (şifreKabul==false){
                if (password.length()<8) System.out.println("Şifreniz en az 8 karakter olmalıdır.");
                if (!kücükHarf) System.out.println("Şifrenizde en az 1 küçük karf olmalıdır. ");
                if (!büyükHarf) System.out.println("Şifrenizde en az 1 büyük karf olmalıdır. ");
                if (!specialChar) System.out.println("Şifrenizde en az 1 tane özel karakter bulunmalıdır.");

            }else if (şifreKabul=true){
                System.out.println("Şifreniz kabul edilmiştir");
                break;
            }

        }while (true);



    }
}
