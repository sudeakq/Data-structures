public class TBListe {
    private Dugum ilk; // listenin başlangıcını tutan değişkendir.

    public TBListe() {
        this.ilk = null; // liste boş olarak oluşturulur.
    }

    // liste basina eleman ekleme
    public void basaEkle(int deger) {
        Dugum yeni = new Dugum(deger);
        // Dugum yeni=new Dugum(); -> 10. satirin uzun hali
        // yeni.setVeri(deger);
        yeni.setSonraki(this.ilk);// yesil bağlantı
        this.ilk = yeni;// mavi bağlantı
    }

    public void basaEkle(Dugum yeni) {
        yeni.setSonraki(this.ilk);
        this.ilk = yeni;
    }

    // liste sonuna eleman ekleme
    public void sonaEkle(int deger) {
        Dugum yeni = new Dugum();
        if (this.ilk == null) {
            this.ilk = yeni;
            return;
        }
        Dugum temp = this.ilk;
        while (temp.getSonraki() != null) {
            temp = temp.getSonraki(); // döngü çıkışında en son düğüm üzerine konumlanmıştır.

        }
        temp.setSonraki(yeni);

    }

    public void sonaEkle(Dugum yeni) {
        // dugum olusturma isi haric gerisi aynı
        if (this.ilk == null) {
            this.ilk = yeni;
            return;
        }
        Dugum temp = this.ilk;
        while (temp.getSonraki() != null) {
            temp = temp.getSonraki();

        }
        temp.setSonraki(yeni);
    }

    // listedeki eleman sayısını hesaplama
    // public void elemanSayisi(int a) {
    // Dugum temp = this.ilk;
    // if (temp == null) {
    // System.out.println("liste boş");
    // return;
    // }
    // while (temp != null) {
    // a+1;
    // temp.setSonraki(temp);
    // }
    // System.out.println(a);

    // }

    // listedeki tüm elemanların değerlerini ekrana yazma
    public void listele() {
        Dugum temp = this.ilk;
        if (temp == null) {
            System.out.println("liste boş");
            return;// fonkdan çık.
        }
        while (temp != null) {
            temp.yazdir();
            // temp=temp.sonraki;
            temp.setSonraki(temp);
        }
        System.out.println("----------");
    }
}
