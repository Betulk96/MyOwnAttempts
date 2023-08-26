package Openai;

import java.util.Scanner;

public class if01 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir tam sayı giriniz");
        int num= input.nextInt();


        if (num>0){
            System.out.println("Girdiğiniz sayı pozitiftir.");
        } else if (num<0) {
            System.out.println("Girdiğiniz sayı negatiftir.");
        }else {
            System.out.println("girdiğiniz sayı nötrdür.sıfırdır.");
        }


    }
}
