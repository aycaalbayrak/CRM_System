package org.example;
import java.util.*;

public class CRMSistemi {
    public static void main(String[] args) {
        List<Temsilci> temsilciler = Arrays.asList(
                new Temsilci("Fatih", "İstanbul", 3, 1000),
                new Temsilci("Elif", "Ankara", 2, 800),
                new Temsilci("Can", "İzmir", 2, 1200),
                new Temsilci("Merve", "Antalya", 2, 500)
        );

        List<Musteri> musteriler = Arrays.asList(
                new Musteri("Ahmet", "İstanbul", "Teknik Destek"),
                new Musteri("Ayşe", "Ankara", "Fatura Sorunu"),
                new Musteri("Mehmet", "İzmir", "Yeni Ürün Bilgisi"),
                new Musteri("Zeynep", "İstanbul", "Abonelik İptali"),
                new Musteri("Ali", "Ankara", "Hizmet Şikayeti"),
                new Musteri("Fatma", "İzmir", "Ödeme Sorunu"),
                new Musteri("Burak", "Antalya", "Yeni Ürün Bilgisi")
        );

        List<Kampanya> kampanyalar = Arrays.asList(
                new Kampanya("Google Ads", 500, 1500, "Genel Reklam"),
                new Kampanya("Facebook Reklam", 300, 800, "İndirim/Kampanya"),
                new Kampanya("Instagram Reklam", 250, 700, "Yeni Ürün Tanıtımı"),
                new Kampanya("YouTube Reklam", 400, 1200, "Eğitici Videolar"),
                new Kampanya("LinkedIn Reklam", 350, 900, "İş Dünyası İlişkileri"),
                new Kampanya("TikTok Reklam", 200, 600, "Genç Kitleye Yönelik")
        );

        TemsilciYonlendirme.musteriAtamaDP(musteriler, temsilciler);

        for (Temsilci temsilci : temsilciler) {
            List<Kampanya> secilenKampanyalar = KampanyaSecim.enIyiKampanyalariBul(kampanyalar, temsilci.getButce());
            double toplamMaliyet = toplamMaliyet(secilenKampanyalar);

            for (Kampanya kampanya : secilenKampanyalar) {
                temsilci.kampanyaEkle(kampanya);
            }

            if (temsilci.getButce() >= toplamMaliyet) {
                temsilci.setButce(temsilci.getButce() - toplamMaliyet);
            } else {
                System.out.println("⚠️ " + temsilci.getAdi() + " için bütçe yetersiz, kampanya seçilemedi.");
                secilenKampanyalar.clear();
            }
        }

        yazdirAtamalar(temsilciler);
    }

    private static double toplamMaliyet(List<Kampanya> kampanyalar) {
        return kampanyalar.stream().mapToDouble(Kampanya::getMaliyet).sum();
    }

    private static void yazdirAtamalar(List<Temsilci> temsilciler) {
        for (Temsilci temsilci : temsilciler) {
            System.out.println("🧑‍💼 Temsilci: " + temsilci.getAdi() + " (" + temsilci.getSehir() + ")");
            System.out.println("   📌 Atanan Müşteriler:");
            for (Musteri musteri : temsilci.getAtanmisMusteriler()) {
                System.out.println("      - " + musteri.getAdi() + " (" + musteri.getTalep() + ")");
            }

            System.out.println("   🎯 Seçilen Kampanyalar:");
            for (Kampanya kampanya : temsilci.getSecilenKampanyalar()) {
                System.out.println("      - " + kampanya.getAdi() + " (Maliyet: " + kampanya.getMaliyet() + "₺, Getiri: " + kampanya.getGetiri() + "₺)");
            }
            System.out.println();
        }
    }
}

//O(n*(m*n+n*w))