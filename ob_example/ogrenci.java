package ob_example;

public class ogrenci {
    public int tc;
    public String isim;
    public String soyisim;

    // method overloading yapmak için ya parametreli parametresi ya da parametre sayıları farklı olacak.
    // paşa gönlün ne kadar isterse Yapıcı Metot(Constructor) kullanabilirsin.
    // öğrenci public classını kapatsan da yine çalışıyor haberin olsun.
    public ogrenci(int tc, String isim, String soyisim) {
        this.tc = tc;
        this.isim = isim;
        this.soyisim = soyisim;
        System.out.println("parametreli çalıştı koçum");
    }

    public ogrenci() {
        System.out.println("parametresiz çalıştı koçum");

    }
}
