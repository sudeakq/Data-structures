public class ogrenci {

    public int ogrNo;
    public String ogrAd;
    public String ogrSoyad;
    public int ogrYas;

    public ogrenci() {
        this.ogrNo = 0;
        this.ogrAd = null;
        this.ogrSoyad = null;
        this.ogrYas = 0;
    }

    public ogrenci(int n, String a, String s, int y) {
        this.ogrNo = n;
        this.ogrAd = a;
        this.ogrSoyad = s;
        this.ogrYas = y;
    }

    // yapılandırıcı fonksiyon (constructor)
    /*
     * Sınıftan nesne türetirken otomatik çalışan fonksiyondur.
     * Yapıcı fonksiyonun adı (yapıcı metod) class adıyla birebir aynı olmalıdır.
     * (class içerisinde yapıcı metod kodlanmamış ise derleyici default olarak
     * parametre almayan bir yapıcı metodu ekler)
     * publicogrenci(){
     * 
     * }
     * yapıcı metodda geri dönüş tipi boş bırakılır yani geri değer döndürmez hiçbir
     * koşulda.
     * yapıcı metod kesinlikle public yayınlanmalı aksi takdirde bu sınıftan nesne
     * türetilemez.
     * parametre alabilir/almayabilir.
     * Bir sınıf içerisinde birden fazla yapıcı metod kullanılabilir.
     * Sınıftan nesne türetilirken yapılmasını istediğimiz ön işlemleri yapıcı metod
     * içine yazmalıyız.
     * Bir sınıfa yapıcı metod yazıldığında derleyici içi boş yapıcı metodu eklemez.
     */

}