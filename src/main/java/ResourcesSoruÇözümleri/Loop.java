package ResourcesSoruÇözümleri;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

//1-Ekrana 10 kez Java Güzeldir yazdırın.
        for (int i = 0; i <11 ; i++) {
            System.out.println("Java Güzeldir.");
        }

//2-10 iel 30 arasındaki (10 ve 30 dahil)sayıları aralarında virgül olarak aynı satırda yazdırın.
        for (int i = 10; i <=30 ; i++) {
            System.out.print(i+",");//10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,
        }

        System.out.println("");
//3-100'den başlayarak 50 dahil olan sayıları aralarında virgül olarak aynı satırda yazdırın.
        for (int i =100; i >49 ; i--) {
            System.out.print(i+",");
        }
        System.out.println("");
//4-Kullanıcıdan 100'den küçük bir tamsayı isteyiniz.1 den başlayarak girilen sayıya kadar 3'ün katları olan sayıları yazdırın.
        Scanner a=new Scanner(System.in);
        System.out.println("100'den küçük bir tam sayı giriniz.");
        int b=a.nextInt();

        for (int i = 1; i < b ; i++) {
           if (i%3==0)
            System.out.print(i+",");
        }
        System.out.println("");
//5-Kullanıcıdan 100'den küçük bir tamsayı isteyiniz.1 den başlayarak girilen sayıya kadar 3'ün veya 5'in  katları olan sayıları yazdırın.

        for (int i = 1; i <b ; i++) {
            if (i%3==0 || i%5==0){
                System.out.print(i+",");
            }
        }
        System.out.println("");
//Kullanıcıdan 100'den küçük bir tamsayı isteyiniz.1 den başlayarak girilen sayıya  yazdırın.
        //Ancak. 3'ün katı ise "Java"
        //5'in katı ise "Güzeldir.
        //3 ve 5'in katı ise "Java güzeldir" yazdırın.

        for (int i = 1; i <b ; i++) {
            if (i%3==0){
                System.out.print("Java, ");
            }
            if (i%5==0) {
                System.out.print("Güzeldir, ");
            }
            if (i%3==0 && i%5==0){
                System.out.print("Java Güzeldir. ");
            }
        }




    }
}
