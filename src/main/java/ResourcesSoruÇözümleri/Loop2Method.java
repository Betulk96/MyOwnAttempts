package ResourcesSoruÇözümleri;

import java.util.Scanner;

public class Loop2Method {
    public static void main(String[] args) {

//Kullanıcıdan bir String isteyin ve Stringi tersen yazdırın.
        Scanner input = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String a = input.next();

        String sum = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            sum = sum + a.charAt(i);

        }
        System.out.println(sum);
//Kullanıcıdan bir String isteyin ve Stringi tersine çeviren bir method yazdırın.

//method Creation kapsamında main metdoun dışına yazıyoruz.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin girin: ");
        String metin = scanner.nextLine();

        String tersMetin = tersCevir(metin);
        System.out.println("Metinin ters çevrilmiş hali: " + tersMetin);
    }
//bu kısım method oşluturma
    public static String tersCevir(String metin) {//tersCevir methodu yapıyoruz.
        StringBuilder tersMetin = new StringBuilder();

        for (int i = metin.length() - 1; i >= 0; i--) {
            tersMetin.append(metin.charAt(i));//appened eklemek
        }

        return tersMetin.toString();//return methodun olduğu yere geri dön demek




}

}
