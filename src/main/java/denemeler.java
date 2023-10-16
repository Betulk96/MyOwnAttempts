import java.util.PriorityQueue;

public class denemeler {
    public static void main(String[] args) {
        String[] ad = {"A", "Z", "S", "B"};
        PriorityQueue<String> liste = new PriorityQueue<String>();
        for (String s : ad) {
            liste.offer(s);
            System.out.print(liste);


        }
    }
}
