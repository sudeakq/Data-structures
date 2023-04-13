public class TBListe {
    private Dugum ilk;

    public TBListe() {
        this.ilk = null;
    }

    // liste basina eleman ekleme
    public void basaEkle(int deger) {
        Dugum yeni = new Dugum(deger);
        // Dugum yeni=new Dugum(); -> 10. satirin uzun hali
        // yeni.setVeri(deger);
        yeni.setSonraki(this.ilk);// yesil bağlantı
        this.ilk = yeni;// mavi bağlantı
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

    // listedeki eleman sayısını hesaplama

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

    }
}
