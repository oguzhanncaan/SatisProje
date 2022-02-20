package com.oguzhan.repository.entity;

import java.util.Date;

public class Satis {
    long id;
    long musteriId;
    long urunId;
    Date satisTarihi;
    Date islemTarihi;
    double birimFiyat;
    int adet;
    double toplamFiyat;

    public Satis(long id, long musteriId, long urunId,
                 Date satisTarihi, Date islemTarihi,
                 double birimFiyat, int adet, double toplamFiyat) {
        this.id = id;
        this.musteriId = musteriId;
        this.urunId = urunId;
        this.satisTarihi = satisTarihi;
        this.islemTarihi = islemTarihi;
        this.birimFiyat = birimFiyat;
        this.adet = adet;
        this.toplamFiyat = toplamFiyat;
    }

    public Satis() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(long musteriId) {
        this.musteriId = musteriId;
    }

    public long getUrunId() {
        return urunId;
    }

    public void setUrunId(long urunId) {
        this.urunId = urunId;
    }

    public Date getSatisTarihi() {
        return satisTarihi;
    }

    public void setSatisTarihi(Date satisTarihi) {
        this.satisTarihi = satisTarihi;
    }

    public Date getIslemTarihi() {
        return islemTarihi;
    }

    public void setIslemTarihi(Date islemTarihi) {
        this.islemTarihi = islemTarihi;
    }

    public double getBirimFiyat() {
        return birimFiyat;
    }

    public void setBirimFiyat(double birimFiyat) {
        this.birimFiyat = birimFiyat;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public double getToplamFiyat() {
        return toplamFiyat;
    }

    public void setToplamFiyat(double toplamFiyat) {
        this.toplamFiyat = toplamFiyat;
    }
}
