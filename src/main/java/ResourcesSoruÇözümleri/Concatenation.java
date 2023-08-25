package ResourcesSoruÇözümleri;

public class Concatenation {
    public static void main(String[] args) {

       String str1="Java";
       String str2="Güzel";
       int sayi1=5;
       int sayi2=4;

    // Java Güzel 54
        System.out.println(str1+" "+str2+" "+sayi1+sayi2);

    // Java 5 Güzel
        System.out.println(str1+" "+5 +" "+str2);

    // Java 94
        System.out.println(str1+" "+(sayi1+sayi2)+sayi2);

    // Java 19
        System.out.println(str1+" "+(sayi1-sayi2)+(sayi1+sayi2));

    // 54 Güzel
        System.out.println(""+sayi1+sayi2+" "+str2);






    }
}
