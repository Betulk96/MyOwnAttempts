package ResourcesSoruÇözümleri;

import java.util.*;

public class doWhileLoop {
    public static void main(String[] args) {

//9'dan 190'a kadar 7'in katı olan tamsayıları ekrana yazdırın.

int i=9;
do {
    if (i%7==0) System.out.print(i+",");
i++;
}while (i<190);
        System.out.println();
//'m' harfinden başlayarak 'c' harfine kadar tüm harfleri yazdırın.

        char c='m';
        do {
            System.out.print(c+",");
         c--;
        }while (c>'b');

        System.out.println();

//Kullanıcıdan toplamak üzere pozitif sayılar isteyin,işlemi bitirmek için 0'a basmasını söyleyin.
        //Kullanıcı 0'a bastığında toplam kaç pozitif sayı girdiğini ve girdiği pozitif sayıların toplamını yazdırın.

        Scanner scanner=new Scanner(System.in);

     int sum=0;
     int sayaç=0;
        System.out.println("Toplama işlemi için pozitif sayılar giriniz.bitirmek için 0'a basınız.");
    do {

        int number=scanner.nextInt();
            if (number>0){
                sum+=number;
                sayaç++;
            }
            if (number==0){
            break;
        }


    }while (true);
        System.out.println("Toplam pozitif satısı: "+sayaç);
        System.out.println("Pozitif sayıların toplamı: " +sum);










    }
}
