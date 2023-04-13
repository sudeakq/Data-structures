public class App {
    public static void main(String[] args) throws Exception {
        dortgen d1 = new dortgen();
        d1.boyutGoster();
        d1.setGenislik(7);
        d1.boyutGoster();
        System.out.println("alan:" + d1.alanHesapla());
        System.out.println("cevre:" + d1.cevreHesapla());

        // d1.genislik = 7;// dogrudan erisim doğru değil
        // d1.boyutGoster();

        dortgen d2 = new dortgen(5);
        d2.boyutGoster();
        d2.setYukseklik(10);
        d2.boyutGoster();
        System.out.println("alan:" + d2.alanHesapla());
        System.out.println("cevre:" + d2.cevreHesapla());

        dortgen d3 = new dortgen(4, 16);
        d3.boyutGoster();
        System.out.println("alan:" + d3.alanHesapla());
        System.out.println("cevre:" + d3.cevreHesapla());

        System.out.println(d3.getYukseklik());

        // ogrenci o1; // tanımlama
        // // o1 = new ogrenci();
        // // bellekte nesnesi olusturuldu

        // o1 = new ogrenci(1234, "Sude", "Sude", 20);

        // System.out.println(o1.ogrAd);
        // System.out.println(o1.ogrSoyad);
        // System.out.println(o1.ogrNo);
        // System.out.println(o1.ogrYas);

        // o1.ogrNo = 1234;
        // o1.ogrAd = "Sude";
        // o1.ogrSoyad = "Sude";
        // o1.ogrYas = 20;
        // default olarak null gelir eğer tanım yapmadan ekrana bastırırsak

        // ogrenci o2;
        // o2 = new ogrenci();

        // o1.ogrNo = 1235;
        // o1.ogrAd = "Sudee";
        // o1.ogrSoyad = "Sudee";
        // o1.ogrYas = 21;

        // System.out.println(o2.ogrSoyad);

    }
}
