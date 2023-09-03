package KodlamaVakti;

import java.util.Scanner;

public class EmpDriver {
    public static void main(String[] args) {

  /*  5. toString methodu, çalışan hakkında bir bilgilerini girmesini isteyelim

        Örnek:
         İsim: kemal
         Maaş: 2000.0
         Çalışma Saatleri: 45
         İşe Alınma Tarihi: 1993
*/
        //Kullanıcıdan bilgilerini alalım
        Scanner scanner =new Scanner(System.in);

        System.out.print("İsim Soyisim :");
        String name=scanner.nextLine();

        System.out.print("Maaşınızı Giriniz : ");
        double maas=scanner.nextDouble();

        System.out.print("Haftalık Toplam Çalışma Saatini : ");
        int calışmaSaati=scanner.nextInt();

        System.out.print("İşe Başlama Yılınızı Giriniz : ");
        int basYıl=scanner.nextInt();


        System.out.println("*".repeat(30));

        //Employe clasından emloyee adında bir obje üretiyoruz.bunu parametrelerni kullanıcıdan alıyoruz.
        Employee employee1 = new Employee(name,maas,calışmaSaati,basYıl);
                                        //Kullanıcıdan aldığımız bilgileri constructor a ekliyoruz

        System.out.println("İsim : "+name +
                "\nMaaş : " +maas+
                "\nÇalışma Saati : " + calışmaSaati +
                "\nİşe Başlama Tarihi : " + basYıl +
                "\nVergi : "+ employee1.taxCal() +
                "\nFazla Mesai : " + employee1.getWorkHours() +
                "\nMaaş Zammı : " + employee1.RaiseSalary() +
                "\nZamlardan Sonra Maaşız : "+(maas+ employee1.getWorkHours()+ employee1.RaiseSalary()- employee1.taxCal()));














    }//me

}//Ce
