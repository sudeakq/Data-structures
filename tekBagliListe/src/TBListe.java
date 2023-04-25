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

    // ODEV

    // listedeki eleman sayısını hesaplama
    public void listeElemanSayisi() {
        int sayac = 0;
        Dugum temp = this.ilk;
        // bos mu diye kontrol etmeye gerek yok ama yine de yazdım.
        if (temp == null) {
            System.out.println("liste boş");
            return;
        }
        while (temp != null) {
            sayac++;
            temp = temp.getSonraki();
        }
        System.out.println(sayac);
    }
    // ODEV BITIS

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

    // listede bir değeri arar ve bulduğunda o düğümü geri döndürür
    public Dugum elemanBul(int deger) {
        Dugum temp = this.ilk;
        Dugum bulunan = null;
        while (temp != null) {
            if (temp.getVeri() != deger) {
                temp = temp.getSonraki();
            } else {
                return temp;
            }
        }
        return bulunan;// aranan bulunsa da bulunmasa da bir deger dönmek zorunda dugum tipinde veya
                       // null olarak dönmeli

    }

    // degeri,listede herhangi bir indekse ekleyen fonk
    public void arayaEkle(int deger, int indis) {
        if (this.ilk == null || (indis == 1)) {
            this.basaEkle(deger);
            return;
        }
        Dugum yeni = new Dugum(deger);
        Dugum temp = this.ilk;
        int sayac = 1;
        while (temp.getSonraki() != null) {// eklenecek yerin bir önceki dugumune tempin konumlandırılması işlemi
            if (sayac + 1 == indis) {
                break;
            }
            sayac++;
            temp = temp.getSonraki();
        }
        yeni.setSonraki(temp.getSonraki());// yesil baglanti
        temp.setSonraki(yeni);// mavi baglanti

    }

    // odev:aranan degerden listede kac tane oldugunu geri donduren fonksiyonu kodla
    // elemansay()
    // odev2: araya ekle fonk sona ekle kullanılarak revize edilerek tekrar
    // yazılması
    // odev3: araya ekle fonk degerleri sayisal olarak sıralı ekleyecek sekilde
    // yazılacak (indis parametresi olmayan)
    // odev4:verilen değeri listeden silen fonk yaz (1+ varsa hepsini silmeli)
    // 1- liste bos olabilir
    // 2- listenin ilk elemanı silinirse liste basi silinecektir
    // 3- silinecek değer listede olmayabilir
    // 4- değer listede vardır ve silinir
    // silme işlemi başarılı ise fonk geriye 0 döndürsün
    // liste bos ise -1 döndürsün
    // eleman bulunamazsa yani silinemezse -2 döndürsün
    public int elemanSil(int deger) {
        if (this.ilk == null) {
            return -1;
        }
        if (this.ilk.getVeri() == deger)// listenin ilk elemanı silinecekse
        {
            this.ilk = this.ilk.getSonraki();
            return 0;
        }
        Dugum temp=this.ilk;
        while(){
            temp=temp.getSonraki();
        }
        // if (elemanBul(deger) == 0) { // tempin üzerinde konumlandığı için silinemez fonk kullanılamaz
        //     return -2;
        // }
    }
}
