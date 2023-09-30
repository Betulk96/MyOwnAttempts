package ResourcesSoruCozumleri;

import java.util.Scanner;

public class Operatorler {
    public static void main(String[] args) {

        //Kullanıcıdan 4 basamaklı bir sayı alın ve rakamlar toplamını bulup yazdırın.

        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen 4 haneli bir sayı giriniz.");
        int a= input.nextInt();

        int sum=0;
        for (int i = a; i >0 ; i=i/10) {//içeri kısımda hep i üzerinden işelm yapıyoruz.
            sum+=i%10;

        }
        System.out.println(sum);





















    }
}
