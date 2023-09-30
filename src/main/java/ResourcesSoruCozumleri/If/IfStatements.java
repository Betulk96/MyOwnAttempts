package ResourcesSoruCozumleri.If;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {

    //Kullanıcıdan bir tam sayı isteyin ve sayının tek veya çift olduğunu yazdırın.

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz.");
        int a= input.nextInt();

        if (a%2==0){
            System.out.println("Girdiğiniz sayı çifttir");
        }else{
            System.out.println("Girdiğiniz sayı tektir.");
        }

    //Kullanıcıdan gün isimlerinden birinin ilk harfini isteyin ve o harfle başlayan gün isimlerini yazdırın.
        //örn :ilk harf p=pazartesi pazar perşembe

        Scanner scan =new Scanner(System.in);
        System.out.println("Gün isminin ilk harfini giriniz.");
        String b =scan.next();

        if (b.startsWith("p") || b.startsWith("P")){
            System.out.println("Pazar,Pazartesi,Perşembe");
        } else if (b.startsWith("c") ||b.startsWith("C")) {
            System.out.println("Cuma,Cumartesi");
        } else if (b.startsWith("S") || b.startsWith("s")) {
            System.out.println("Salı");
        }else if (b.startsWith("ç") || b.startsWith("Ç")){
            System.out.println("Çarşamba");
        }else {
            System.out.println("Girdiğiniz harf ile başlayan bir gün ismi yoktur.");
        }

    //Kullanıcıdan gün ismi akın ve hafta içi veya hafta sonu olduğunu yazdırın.
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir gün adı giriniz.");
        String c=scanner.next();

        boolean haftaici= c.equalsIgnoreCase("pazartesi")||c.equalsIgnoreCase("salı")||c.equalsIgnoreCase("çarşamba")||c.equalsIgnoreCase("perşembe")||c.equalsIgnoreCase("cuma");
        boolean haftasonu=c.equalsIgnoreCase("cumartesi")||c.equalsIgnoreCase("pazar");

        if (haftaici){
            System.out.println("Haftaiçi");
        }else if (haftasonu){
            System.out.println("Haftasonu");
        }else {
            System.out.println("geçerli bir gün adı giriniz.");
        }

    //Kullanıcından dikdirtgenin kenar uzunluklarını isteyin ve dikdörtgenin kara olup olmadığını yazdırın.
        Scanner input2=new Scanner(System.in);
        System.out.println("Lütfen birinci kenar uzunluğu giriniz.");
        int num= input2.nextInt();
        System.out.println("Lütfen ikinci kenar uzunluğu giriniz.");
        int num2=input2.nextInt();

       if (num==num2){
           System.out.println("Kare");
       }else {
           System.out.println("Dikdörtgen");
       }

    //cuma=müslümanlar için mübarek
    //cumartesi=yahudiler için kutsal
    //pazar=hristiyanlar için kutsal
        Scanner scan2 =new Scanner(System.in);
        System.out.println("Gün ismi giriniz.");
        String e =scan2.next();

if (e.equalsIgnoreCase("cuma")){
    System.out.println("müslümanlar için mübarek");
} else if (e.equalsIgnoreCase("cumartesi")) {
    System.out.println("yahudiler için kutsal");
} else if (e.equalsIgnoreCase("pazar")) {
    System.out.println("hristiyanlar için kutsal");
}else {
    System.out.println("normal bir gün");
}


    }
}
