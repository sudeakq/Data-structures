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
}
