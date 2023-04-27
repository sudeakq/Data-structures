import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

        // CBListe cbl = new CBListe();

        // cbl.listele();
        // cbl.basaEkle(20);
        // cbl.arayaEkle(10, 1);
        // cbl.sonaEkle(30);

        // cbl.listele();

        LinkedList<String> liste = new LinkedList<>();
        liste.add("veri");
        liste.addFirst("yapilari");
        System.out.println("eleman sayısı:" + liste.size());
    }
}
