package ResourcesSoruCozumleri.Loop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
  //1)while Loop kullanarak 3'den 13'e kadar tüm tek sayıları ekrana yazdırın.

       int i=3;
        while ( i<14) {
            if (i%2==1) System.out.print(i+",");
         i++;
        }//3,5,7,9,11,13,

        //forloop ve while Loop kullanarak 3 basamaklı sayılardan 15,20,90 na tam bölünenebilen sayıları yazdırın.

        Scanner scanner=new Scanner(System.in);
        System.out.println("\nLütfen 3 basamaklı bir sayı giriniz");
        int a=scanner.nextInt();

        for (int j = 0; j <a ; j++) {
            if (j%15==0 && j%20==0 && j%90==0) System.out.print(j+",");

        }

        int k=0;
        while (k<a){
            if (k%15==0 && k%20==0 && k%90==0) System.out.print(k+",");
        k++;
        }

//Kullanıcıdan başlangıç ve bitiş değerlerini alın.
// Başlangıç değeri ve bitiş değeri dahil aralarındaki tüm çift sayıları while loop kullanarak ekrana yazdırın.

System.out.println("\nLütfen başlangıç değeri giriniz.");
int başlangıc=scanner.nextInt();
System.out.println("Lütfen bitiş değeri giriniz.");
int bitiş=scanner.nextInt();

int l=başlangıc;
while (l<bitiş){
    if (l%2==0) System.out.print(l+",");
l++;
}








    }
}
