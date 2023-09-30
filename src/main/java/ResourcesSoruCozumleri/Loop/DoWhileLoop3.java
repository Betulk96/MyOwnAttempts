package ResourcesSoruCozumleri.Loop;

import java.util.Scanner;

public class DoWhileLoop3 {
    public static void main(String[] args) {

//Kullanıcıdan toplamak için sayı isteyin ve toplam 500'e ulaşıncaya istemeye devam edin .
// toplam 500'e ulaştığından veya geçtiğinde toplamı ve kaç sayı girildiğini yazdırın.

        Scanner input=new Scanner(System.in);
int sum=0;
int counter=0;

do {
    System.out.println("Toplamak için sayı giriniz.");
    int number=input.nextInt();
    sum+=number;
    counter++;
    if (sum>=500)break;
}while (true);
        System.out.println("Girdiğiniz sayıların toplamı: "+sum);
        System.out.println("Toplam girdiğiniz sayı : "+counter);
    }
}
