package com.oguzhan.service;

import com.oguzhan.repository.UrunRepository;
import com.oguzhan.repository.entity.Urun;

import java.util.List;
import java.util.Scanner;

public class UrunService {

    public Urun urunSec(){
        Scanner scanner = new Scanner(System.in);
        UrunRepository urunRepository = new UrunRepository();
        urunRepository.RastgeleUrunOlustur();
        List<Urun> uList = urunRepository.getUrunListesi();
        System.out.println("****Ürün Seç****");
        for (int i = 0; i < uList.size(); i++) {
            Urun urun = uList.get(i);
            System.out.printf("SNo: "+(i+1));
            System.out.printf("Adı: "+urun.getAd());
            System.out.printf("Marka: "+urun.getMarka());
            System.out.printf("Model: "+urun.getModel());
            System.out.println();
        }
        System.out.printf("Ürün seç:");
        int secilenUrunSıraNo = scanner.nextInt();
        Urun secilenUrun = uList.get(secilenUrunSıraNo);
        System.out.println("Seçilen Ürün: " +secilenUrun.getAd());
        return secilenUrun;
    }
}
