package org.example;

import java.util.ArrayList;
import java.util.List;

public class Temsilci {
    private String adi;
    private String sehir;
    private int kapasite;
    private double butce;
    private List<Musteri> atanmisMusteriler = new ArrayList<>();

    public Temsilci(String adi, String sehir, int kapasite, double butce) {
        this.adi = adi;
        this.sehir = sehir;
        this.kapasite = kapasite;
        this.butce = butce;
    }

    public List<Musteri> getAtanmisMusteriler() {
        return atanmisMusteriler;
    }

    private List<Kampanya> secilenKampanyalar = new ArrayList<>();

    public List<Kampanya> getSecilenKampanyalar() {
        return secilenKampanyalar;
    }

    public void kampanyaEkle(Kampanya kampanya) {
        secilenKampanyalar.add(kampanya);
    }

    public void musteriEkle(Musteri musteri) {
        atanmisMusteriler.add(musteri);
    }

    public double getButce() {
        return butce;
    }

    public void setButce(double butce) {
        this.butce = butce;
    }

    public String getAdi() {
        return adi;
    }

    public String getSehir() {
        return sehir;
    }

    public int getKapasite() {
        return kapasite;
    }
}