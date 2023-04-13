public class dortgen {
    private double genislik;
    private double yukseklik;// degiskenler icin private ya da protected tanımlanmalı

    public dortgen() {
        this.genislik = 0;
        this.yukseklik = 0;
    }

    public dortgen(double w) {
        this.genislik = w;
        this.yukseklik = w;
    }

    public dortgen(double w, double h) {
        this.genislik = w;
        this.yukseklik = h;
    }

    public void boyutGoster() {
        System.out.println("G:" + this.genislik + "Y:" + this.yukseklik);
    }

    // her bir degisken icin get set fonksiyonları yazilir(duruma göre bazıları
    // yazılmayabilir)
    // get ile başlayanlar değer öğrenmek için yazılır (geri değer döndürür)
    // set ile başlayanlar değişken değerini değiştirmek için yazılır

    public double getGenislik() {
        return this.genislik;
    }

    public double getYukseklik() {
        return this.getYukseklik();
    }

    public void setGenislik(double w) {
        this.genislik = w;
    }

    public double alanHesapla() {
        return this.genislik * this.yukseklik;
    }

    public double cevreHesapla() {
        return (this.genislik + this.yukseklik) * 2;
    }

    public void setYukseklik(double w) {
        this.yukseklik = w;
    }
}
