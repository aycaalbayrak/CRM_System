package org.example;

public class Musteri {
    private String adi;
    private String sehir;
    private String talep;

    public Musteri(String adi, String sehir, String talep) {
        this.adi = adi;
        this.sehir = sehir;
        this.talep = talep;
    }

    public String getAdi() { return adi; }
    public String getSehir() { return sehir; }
    public String getTalep() { return talep; }
}