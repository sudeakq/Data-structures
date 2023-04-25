public class App {
    public static void main(String[] args) throws Exception {

        // Dugum d1 = new Dugum();
        // d1.yazdir();

        // Dugum d2 = new Dugum(5);
        // d2.yazdir();

        TBListe mylist = new TBListe();
        mylist.listele();
        mylist.basaEkle(10);
        mylist.basaEkle(20);
        mylist.basaEkle(5);
        mylist.sonaEkle(30);
        System.out.println("Lİste eleman sayisi:");
        mylist.listeElemanSayisi();

        Dugum d = new Dugum(50);
        mylist.basaEkle(d);

        Dugum dd = new Dugum(60);
        mylist.sonaEkle(dd);

        mylist.arayaEkle(70, 9);

        mylist.listele();

        int sil = 50;
        int sonuc = mylist.elemanSil(sil);
        if (sonuc == 0) {
            System.out.println(sil + "listeden silindi");
        } else if (sonuc == -1) {
            System.out.println("liste bos");
        } else if (sonuc == -2) {
            System.out.println(sil + "listede bulunamadi");
        }

    }
}
