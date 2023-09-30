package ResourcesSoruCozumleri.Loop;

import java.util.Scanner;

public class WhileLoop2 {
    public static void main(String[] args) {
        //KUllanıcıdan bir rakam alın ve bu rakam için çarpım tablosunu ekrana yazdırın
        //Örn:3x1=3
        //3x2=3

        int i=1;
        while (i<11){
            System.out.println(3+"X"+i+"="+(3*i));

            i++;
        }


//Kullanıcıdan bir sayı alın ve bu sayıyı tam bölen sayıları ve toplam kaç tane olduklarını ekranda yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        int a=scan.nextInt();

        int sayaç=0;

        int k=1;
        while (k<a){
            if(a%k==0) {
                System.out.println(k);
                sayaç++;
            }

            k++;
        }
        System.out.println("toplam bölen sayısı:"+sayaç);



//Kullanıcıdan bir sayı alın ve bu sayının rakamları toplamını yazdırın.
        System.out.println("Lütfen bir tam sayı giriniz.");
        int b=scan.nextInt();

        int sum=0;
        int m=b;
        while (m>0){
            sum+=m%10;
            m/=10;
        }
        System.out.println(sum);























    }
}

