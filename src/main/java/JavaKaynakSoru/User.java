package JavaKaynakSoru;
/*
*Encapsulation sorusu
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

public class User {
    public static int counter=10;
    protected int id;
    protected String username;
    protected String pw;
    protected boolean active;
    protected boolean signedIg;

    public User( String username, String pw, boolean active, boolean signedIg) {

        this.id = counter++;
        this.username = username;
        this.pw = pw;
        this.active = active;
        this.signedIg = signedIg;
    }

    public User() {
    }
}
