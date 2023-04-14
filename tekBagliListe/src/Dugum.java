public class Dugum {
    private int veri;
    private Dugum sonraki;

    public Dugum() {
        this.veri = 0;
        this.sonraki = null;
    }

    public Dugum(int deger) {
        this.veri = deger;
        this.sonraki = null;
    }
    // constructor yazarken hangi işlemler otomatik gerçekleştirilsin bunu düşünerek
    // yazılır. Yapılandırıcı fonksiyonu olmayan class yok.

    public void yazdir() {
        System.out.println(" " + this.veri);
    }

    public int getVeri() {
        return this.veri;
    }

    public void setVeri(int deger) {
        this.veri = deger;
    }

    public Dugum getSonraki() {
        return this.sonraki;
    }

    public void setSonraki(Dugum ref) {
        this.sonraki = ref;
    }

}
