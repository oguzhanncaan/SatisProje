package com.oguzhan.repository.entity;

public class Urun {
    /**
     * POJO --> Plain Old Java Object
     */
    long id; // benzersiz bir sıra numarası, kimlik veririz.
    String ad;
    String marka;
    String model;
    String birim;
    int stokMiktari;
    double alisFiyati;
    double satisFiyat;
    int kdv;

    public Urun(long id, String ad, String marka, String model,
                String birim, int stokMiktari, double alisFiyati,
                double satisFiyat, int kdv) {
        this.id = id;
        this.ad = ad;
        this.marka = marka;
        this.model = model;
        this.birim = birim;
        this.stokMiktari = stokMiktari;
        this.alisFiyati = alisFiyati;
        this.satisFiyat = satisFiyat;
        this.kdv = kdv;
    }

    public Urun() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public int getStokMiktari() {
        return stokMiktari;
    }

    public void setStokMiktari(int stokMiktari) {
        this.stokMiktari = stokMiktari;
    }

    public double getAlisFiyati() {
        return alisFiyati;
    }

    public void setAlisFiyati(double alisFiyati) {
        this.alisFiyati = alisFiyati;
    }

    public double getSatisFiyat() {
        return satisFiyat;
    }

    public void setSatisFiyat(double satisFiyat) {
        this.satisFiyat = satisFiyat;
    }

    public int getKdv() {
        return kdv;
    }

    public void setKdv(int kdv) {
        this.kdv = kdv;
    }
}
