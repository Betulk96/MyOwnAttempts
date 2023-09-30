package JavaKaynakSoru;

import java.util.Scanner;

public class Kelime {
    public static void main(String[] args) {
        /*
        kullanıcının girdiği cümlede , yine kullanıcının girdiği kelimeyi arıyoruz,
        kelime yoksa "kelime yok" mesajı veriyor, kelime varsa "kelime var" yazıyor,
         ayrıca varolan kelimeden kaç adet daha olduğunu yazıyor
         */
        Scanner input = new Scanner(System.in);
        System.out.println("bir cümle giriniz");
        String cumle = input.nextLine();

        System.out.println("bir kelime giriniz");
        String kelime = input.next();

        cumle = cumle.replaceAll("[\\p{Punct}]", "");
        String[] kelimeler = cumle.split(" ");

        int counter = 0;

        for (int i = 0; i < kelimeler.length; i++) {
            if (kelimeler[i].equalsIgnoreCase(kelime)) {
                    counter++;
            }
        }
        if (counter > 0) {
            System.out.println("Cümle içinde " + counter + " adet aynı kelime bulunuyor.");
        } else {
            System.out.println("Cümle içinde aynı kelime bulunmuyor.");

        }
    }
}