package com.oguzhan.service;

import com.oguzhan.repository.MusteriRepository;
import com.oguzhan.repository.SatisRepository;
import com.oguzhan.repository.UrunRepository;
import com.oguzhan.repository.entity.Musteri;
import com.oguzhan.repository.entity.Satis;
import com.oguzhan.repository.entity.Urun;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class SatisService {

    public void satisYap(){
        Scanner scanner = new Scanner(System.in);
        SatisRepository satisRepository = new SatisRepository();
        /**
         *      Musteri musteri = musteriRepository.getMusteriList().get(5);
         *      System.out.println(musteri.getId());
         *      System.out.println(musteri.getAd());
         *      System.out.println(musteri.getSoyad());
         */
        System.out.println("*************************");
        System.out.println("***********SATIŞ*********");
        System.out.println("*************************");
        System.out.println();

        MusteriService musteriService = new MusteriService();
        Musteri secilenMusteri = musteriService.musteriSec();
        UrunService urunService = new UrunService();
        Urun secilenUrun = urunService.urunSec();

        System.out.println("Satılan adet: ");
        int adet = scanner.nextInt();
        /** burdan sonra
         * satış için gerekli alanları satıs nesnesi içine yerleştiriyoruz.
         */
        Satis satis = new Satis();
        satis.setMusteriId(secilenMusteri.getId());
        satis.setUrunId(secilenUrun.getId());
        satis.setBirimFiyat(secilenUrun.getSatisFiyat());
        satis.setAdet(adet);
        satis.setToplamFiyat(secilenUrun.getSatisFiyat()*adet);
        satis.setSatisTarihi(new Date());
        satis.setIslemTarihi(new Date());
        satisRepository.save(satis);

    }
}
