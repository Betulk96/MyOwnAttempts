package ResourcesSoruCozumleri.MultiArray;

import java.lang.reflect.Array;

public class MultiDimensionalArrays01 {
    public static <i> void main(String[] args) {
 //{{1,2,3},{4,5,6}} tüm elemanlarının çarpımını ekrana yazdıran bir method yazdırın..

         int sayı [][]= {{1,2,3},{4,5,6}};
        System.out.println("sayı.length = " + sayı.length);
        int multiple=1;
         for (int i = 0; i < sayı.length ; i++) {
            for (int j = 0; j < sayı[i].length ; j++) {
               multiple*=sayı [i][j];
            }
        }

        System.out.println("Multiple: "+multiple);//720


//{{1,2,3},{4,5},{6}} iç araylardeki son elemanlarının çarpımını ekrana yazdırın.3*5*6=90 gibi

        int s1[][]={{1,2,3},{4,5},{6}};

        int carp=1;
        for (int i = 0; i < s1.length ; i++) {
            for (int j = s1[i].length-1; j == s1[i].length-1 ; j++) {
                carp*=s1[i][j];
            }
        }

        System.out.println("Çarp: "+carp);

//Aşağıdaki multidimensional arraylerin iç arraylerindeki aynı indexe sahip elemanların toplamını ekrana yazdıran bir program yazdırın

int arr1[][]={{1,2},{3,4,5},{6}};
int arr2[][]={{7,8,9},{10,11},{12}};


        // İki dizi içindeki aynı indekslere sahip olan iç array'leri topla ve ekrana yazdır.
        int sum = 0;
        for (int i = 0; i < Math.min(arr1.length, arr2.length); i++) {//en düşük olanın indexi çünkü en düşk olana kadar karşılaştırack.büyük olanı alsaydık.büyüğün karşılığı yokru.
            if (arr1[i].length == arr2[i].length) {
                for (int j = 0; j < arr1[i].length; j++) {//zaten eşit olursa bu kouşula gelecekihangisinin lengthi oludğu farketmez
                    sum += arr1[i][j] + arr2[i][j];//ikisinin o index içindeki değerlerinini toplama
                }
                System.out.println("iç array indexi : " + (i) + " Toplam " + sum);
            }
        }
        
    }
}
        


