public class Dugum {
    private int veri;
    private Dugum onceki;
    private Dugum sonraki;

    public Dugum() {
        this.veri = 0;
        this.onceki = null;
        this.sonraki = null;
    }

    public Dugum(int deger) {
        this.veri = deger;
        this.onceki = null;
        this.sonraki = null;
    }

    public void yazdir() {
        System.out.println("" + this.veri);
    }

    public void setVeri(int veri) {
        this.veri = veri;
    }

    public void setOnceki(Dugum onceki) {
        this.onceki = onceki;
    }

    public void setSonraki(Dugum sonraki) {
        this.sonraki = sonraki;
    }

    public int getVeri() {
        return veri;
    }

    public Dugum getOnceki() {
        return onceki;
    }

    public Dugum getSonraki() {
        return sonraki;
    }

}
