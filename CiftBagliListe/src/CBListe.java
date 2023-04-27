public class CBListe {
    private Dugum ilk;

    public CBListe() {
        this.ilk = null;
    }

    public void basaEkle(int deger) {
        Dugum yeni = new Dugum(deger);

        if (this.ilk == null) {
            this.ilk = yeni;
            return;
        }

        this.ilk.setOnceki(yeni); // listenin başındakinden önceki eleman yeni değişkeni olur
        yeni.setSonraki(this.ilk);

        this.ilk = yeni;
    }

    public void sonaEkle(int deger) {
        Dugum yeni = new Dugum(deger);
        if (this.ilk == null) {
            this.ilk = yeni;
            return;
        }
        Dugum temp = this.ilk;
        // temp in en son düğüme konumlandırılması
        while (temp.getSonraki() != null) {
            temp = temp.getSonraki();
        }
        temp.setSonraki(yeni);
        yeni.setOnceki(temp);

    }

    public void arayaEkle(int deger, int indis) {
        if ((this.ilk == null) || (indis == 1)) { // liste boş ise
            this.basaEkle(deger);
            return;
        }
        Dugum yeni = new Dugum(deger);
        Dugum temp = this.ilk;
        int sayac = 1;

        // temp eklenecek pozisyonun bir önceki düğümüne konumlandırılır
        while (temp.getSonraki() != null) { // eklenecek yerin bir önceki düğümüne tempin konumlandırılması
            if (sayac + 1 == indis) {
                break;
            }
            sayac++;
            temp = temp.getSonraki();
        }

        temp.getSonraki().setOnceki(yeni); // yeşil bağ 1
        yeni.setSonraki(temp.getSonraki()); // yeşil bağ 2

        temp.setSonraki(yeni); // mavi bağlantı 1
        yeni.setOnceki(temp); // mavi bağ 2
    }

    // listedeki tüm elemanların değerlerini ekrana yazma
    public void listele() {
        Dugum temp = this.ilk;
        if (temp == null) {
            System.out.println("Liste boş");
            return;
        }
        while (temp != null) {
            temp.yazdir();
            // temp=temp.sonraki;
            temp = temp.getSonraki();
        }
        System.out.println("-----------------");
    }

    // eleman sayısının hesaplanması
    // sıralı eleman ekleme
    // eleman bulma

    // verilen değeri listeden silen fonk (birden fazla var ise ilk bulduğunu siler)
    // 1. liste boş olabilir
    // 2. listenin ilk elemanı silinirse liste başı değişecektir
    // 3. silinecek değer listede yoktur, silme işlemi gerçekleşmez
    // 4. deger listede vardır ve silinir
    // silme işlemi başarılı ise fonksiyon geriye 0 döndürsün
    // liste boş ise -1 döndürsün
    // eleman bulunamazsa (dolayısı ile silinemezse) -2 döndürsün
    public int elemanSil(int deger) {
        if (this.ilk == null) { // liste boş ise
            return -1;
        }
        if (this.ilk.getVeri() == deger) { // listenin ilk elamanı silinecek ise
            this.ilk = this.ilk.getSonraki();
            this.ilk.setOnceki(null);
            return 0;
        }
        Dugum temp = this.ilk;
        while (temp.getVeri() != deger) {
            if (temp.getSonraki() == null) { // liste sonuna kadar arama yapıldı, listede eleman yoktur silinemez
                return -2;
            }
            temp = temp.getSonraki();
        }
        // eleman silme işlemi ile ilgili kod

        if (temp.getSonraki() != null) {
            temp.getSonraki().setOnceki(temp.getOnceki());
            temp.getOnceki().setSonraki(temp.getSonraki());
        } else {
            temp.getOnceki().setSonraki(null);
        }
        return 0;
    }

}
