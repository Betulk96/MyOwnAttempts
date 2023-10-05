package JavaKaynakSoru;

/*Encapsulation sorusu
   1- filedları(encapsulated) id, username, password, active (boolean), signedIn (boolean)
      olan User isimli bir class create ediniz.
   2- bütün fieldları parametre alan bir constructor tanımlayınız.
   4- UserMain isminde main için bir class create ediniz.
   5- Kullanicidan 2 adet user bilgisi isteyerek bir ArrayList e atayiniz.
      active ve signedIn default olarak true, false atayabilirsiniz.
      id yi sistemde otomatik aliniz.,
   6- eğer password 6 dan küçük olursa yeniden kullanici girisi isteyin.passwordun
      6 karakterden küçük olup olmadığını classın içinde kontrol ediniz.
      */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        List<User> userlist = new ArrayList<>();
        boolean isPWTrue = true;
        int count = 1;
        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Username "+count+":");
            String u1 = scanner.nextLine();
            System.out.println("Password:");
            String p1 = scanner.nextLine();

            do {
                boolean c1 = pwContol(p1);
                if (c1) {
                    System.out.println("işlem başarılı");
                    User user1 = new User(u1, p1, true, false);
                    userlist.add(user1);
                    count++;
                    break;
                } else {
                    System.out.println("hatalı şifre yeniden deneyiniz");
                    isPWTrue = false;
                }
            } while (isPWTrue);


        } while (count != 3);

    }

    public static boolean pwContol(String pw) {
        if (pw.length() > 6) return true;
        else return false;

    }
}
//System.out.println("Username:");
//String u2=scanner.nextLine();
//System.out.println("Password:");
//String p2=scanner.nextLine();
//   boolean c2=pwContol(p1);
//   if (c2==true){
//       System.out.println("işlem başarılı");
//       User user2=new User(u2,p2,true,false);
//       userlist.add(user2);
//       break;
//   }else{
//       System.out.println("hatalı şifre yeniden deneyiniz");
//       isPWTrue=false;

//   }
