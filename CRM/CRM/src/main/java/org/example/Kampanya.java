package org.example;

public class Kampanya {
    private String adi;
    private double maliyet;
    private double getiri;
    private String kategori;

    public Kampanya(String adi, double maliyet, double getiri, String kategori) {
        this.adi = adi;
        this.maliyet = maliyet;
        this.getiri = getiri;
        this.kategori = kategori;
    }

    public String getAdi() { return adi; }
    public double getMaliyet() { return maliyet; }
    public double getGetiri() { return getiri; }
    public String getKategori() { return kategori; }
}
