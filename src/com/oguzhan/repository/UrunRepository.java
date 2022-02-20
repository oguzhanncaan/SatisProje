package com.oguzhan.repository;

import com.oguzhan.repository.entity.Urun;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UrunRepository {

    private List<Urun> urunListesi = new ArrayList<>();
    Random random = new Random();
    public void RastgeleUrunOlustur(){
        for(long i = 1; i < 25; i++){
            Urun urun = new Urun(i,"Ürün-"+i,
                    "A markası",
                    "C Model",
                    "adet",
                    random.nextInt(100),
                    2800,
                    3680,
                    18);
            urunListesi.add(urun);
        }

    }

    public List<Urun> getUrunListesi() {
        return urunListesi;
    }

    public void setUrunListesi(List<Urun> urunListesi) {
        this.urunListesi = urunListesi;
    }
}

