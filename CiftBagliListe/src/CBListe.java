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
        this.ilk.setOnceki(yeni);// 2. bağlantılar önce yapılmalı
        yeni.setSonraki(this.ilk);

        this.ilk = yeni;
    }

    public void sonaEkle(int deger, int indis) {
        if ((this.ilk == null) || (indis == 1)) {// liste bos ise
            this.basaEkle(deger);
            return;
        }
        Dugum yeni = new Dugum(deger);
        Dugum temp = this.ilk;
        int sayac = 1;
        // temp eklenecek pozisyonun bir önceki dugumune konumlandırılır
        while (temp.getSonraki() != null) {
            if (sayac + 1 == indis) {
                break;
            }
            sayac++;
            temp = temp.getSonraki();
        }
        temp.getSonraki().setOnceki(yeni);// yesil bag 1
        yeni.setSonraki(temp.getSonraki());// yesil bag 2

        temp.setSonraki(yeni);// mavi 1
        temp.setOnceki(temp);// mavi 2

    }

    public void listele() {
        Dugum temp = this.ilk;
        if (temp == null) {
            System.out.println("liste boş");
            return;
        }
        while (temp != null) {
            temp.yazdir();
            temp = temp.getSonraki();
        }
        System.out.println("---------------");
    }
}
