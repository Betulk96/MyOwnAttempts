package KodlamaVakti;
 /*

Bu alıştırmada şunları yazacaksınız:
Employee adlı bir class ve EmpDriver adlı bir sınıfın içinde bir method.
Bu sınıf 4 instance data ve 5 yöntem içerir.
    Örnek verileri:
        1- İsim
        2- Maaş
        3- Çalışma saatleri
        4- İşe Alma Yılı(HireYear)

Bu sınıfın yöntemleri şunlardır:
    1- Employee Constructor, adı, maaşı, çalışma saatlerini ve işe alınma yılını başlatan 4 parametreyi kabul eder.

    2- Tax Methodu maaşa uygulanan vergiyi hesaplar:
        1000 TL ve altındaki maaşlara vergi yok
•       1000 doların üzerindeki maaşlardan %3 vergi

    3- Bonus Methodu, çalışanın ikramiyesini ek çalışma saatlerine göre hesaplar. Öyle ki fazladan bir saat için 30 TL alıyor.

    4- RaiseSalary Methodu çalışanın maaşına yapılan zamları hesaplar (gerçek yılın 2023 olduğunu düşünün):
        10 yıldan az çalışmışsa maaş zammı %5 olacak
        20 yıldan az ve 9 yıldan fazla çalışmışsa maaşına yüzde 10 zam yapılacak
        19 yıldan fazla çalışmışsa maaşına yüzde 15 zam yapılacak

    5. toString methodu, çalışan hakkında bir bilgi döndürür:

        Örnek:
         İsim: kemal
         Maaş: 2000.0
         Çalışma Saatleri: 45
         İşe Alınma Tarihi: 1993


Main Method aşağıdakiler için ifadeler içerir:
         1- Çalışanın (kullanıcıdan) adının, maaşının, çalışma saatlerinin ve işe alım tarihinin okunması
         2- Önceki değerleri kullanarak Çalışanın objesini oluşturmak
         3- Çalışanın toplam maaşının vergi ve ikramiye dikkate alınarak hesaplanması.
         4- Maaş artışından sonra çalışanın toplam maaşının hesaplanması (vergi ve ikramiyeyi dikkate almayın).
         5- Çalışana ait bilgilerin Çıktısı.
 Örnek:
         İsim: kemal
         Maaş: 2000.0
         Çalışma Saatleri: 45
         İşe Alınma Tarihi: 1993
         Tax: 60,0
         Bonus: 150.0
         Maaş Artışı(RaiseSalary): 300.0



      */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
  //1.)Variableları oluşturuyoruz.private yapıyoruz çünkü zaten bu class içinde cons. ile kullanıcaz.
    public String name;
    public double salary;
    public int workHours;

    public int hireYear ;
//Employee Cons. oluşturma
    Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;



    }
//2- Tax Methodu maaşa uygulanan vergiyi hesaplar:
//    1000 TL ve altındaki maaşlara vergi yok
//    1000 doların üzerindeki maaşlardan %3 vergi


public double taxCal(){
        if (this.salary>=1000)
            return salary*0.03;  //eğer 1000den büyükse %3ünü al vergi olarak geri döndür


        return 0.0;//eğer 1000den küçükse vergi 0'dır,bu şekilde döndür.else olarak da yazabilirdik.
}

// 3- Bonus Methodu, çalışanın ikramiyesini ek çalışma saatlerine göre hesaplar. Öyle ki fazladan bir saat için 30 TL alıyor.


    public double getWorkHours() {
        if (this.workHours>40)
            return (workHours-40)*30;//eğer 45den fazla çalışma saati varsa bunu hesapla 30 ile çarp


        return 0;//yoksa 0 döndür.else
    }

/* 4- RaiseSalary Methodu çalışanın maaşına yapılan zamları hesaplar (gerçek yılın 2023 olduğunu düşünün):
        10 yıldan az çalışmışsa maaş zammı %5 olacak
        20 yıldan az ve 9 yıldan fazla çalışmışsa maaşına yüzde 10 zam yapılacak
        19 yıldan fazla çalışmışsa maaşına yüzde 15 zam yapılacak */

    public double RaiseSalary() {

        LocalDate year = LocalDate.now();///güncel yılı ele almak için
        int güncelYıl=year.getYear(); //sadece yılı yazdırması için yani =  2023

        int aralık=güncelYıl-hireYear;//iş de kaç yıl çalıştığını olduğunu öğrenmek için=2023-1995=18 gibi
        int raise=0;

        if (aralık<10)   raise+=salary*0.05;

         else if (aralık>=10 && aralık<20) raise+=salary*0.1;

            else  raise+=salary*0.15;



        return raise;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }
}