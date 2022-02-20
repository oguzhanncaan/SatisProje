package com.oguzhan.repository;

import com.oguzhan.repository.entity.Satis;

import java.util.ArrayList;
import java.util.List;

public class SatisRepository {

    List<Satis> satisListesi = new ArrayList<>();

    public List<Satis> getSatisListesi() {
        return satisListesi;
    }

    public void setSatisListesi(List<Satis> satisListesi) {
        this.satisListesi = satisListesi;
    }

    public void save(Satis satis){
        satisListesi.add(satis);
    }
}
