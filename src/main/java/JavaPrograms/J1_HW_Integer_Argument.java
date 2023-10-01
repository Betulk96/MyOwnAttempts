package JavaPrograms;

public class J1_HW_Integer_Argument {
    public static void main(String[] args) {
      //1. Simple Java Program
        System.out.println("Hello Betül' Java Prpgrams");

      //2. Print Integer in java
        /* Using for loop to repeat instruction execution */
       int a;//bir değişken bildirmek,declaring a variable

        for( a = 1; a<= 10; a++) {
            System.out.print(a+",");
        }
        System.out.println();

      //3. Command Line Argument in java-comut satırı argumanı
        for (String b:args ) {
            System.out.println(b);
        }
      /*main metodu içinde bulunan args parametresi,
      komut satırından gelen argümanları temsil eder ve
      bu argümanları program içinde kullanmanıza olanak tanır.

       */




    }
}
