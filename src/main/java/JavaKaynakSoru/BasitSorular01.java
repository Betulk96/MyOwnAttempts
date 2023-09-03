package JavaKaynakSoru;

public class BasitSorular01 {
    public static void main(String[] args) {


        /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */

        int list []={2,5,6,7,9};

        int sum=0;
        for (int each:list) {
            sum=sum+(each*each);

        }
        System.out.println(sum);//195









    }
}
