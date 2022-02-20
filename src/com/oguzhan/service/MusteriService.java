package com.oguzhan.service;

import com.oguzhan.repository.MusteriRepository;
import com.oguzhan.repository.entity.Musteri;

import java.util.List;
import java.util.Scanner;

public class MusteriService {

    public Musteri musteriSec(){

        MusteriRepository musteriRepository = new MusteriRepository();
        musteriRepository.RastGeleMusteriListesiOlustur();
        List<Musteri> mList = musteriRepository.getMusteriList();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Müşteri Listesi");
        /**
         * Müşteri listesi kadar dönecek bir for döngüsü oluşturup müşteri listesini yazdırıyoruz.
         */
        for (int i = 0; i < musteriRepository.getMusteriList().size(); i++) {
            /**
             * DİKKAT!
             * Her seferinde müşteri listesinden veri çekmek yerine bir defa çekerek işlem yapınız.
             */
            Musteri mst = mList.get(i);
            System.out.print("SNo: "+(i+1));
            System.out.print(", Ad: "+mst.getAd());
            System.out.print(", Soyad: "+mst.getSoyad());
            System.out.print(", Telefon: "+mst.getTelefon());
            System.out.println();
        }
        System.out.print("Müşteri seç: ");
        int musteriSiraNo = scanner.nextInt() - 1;
        Musteri secilenMusteri = mList.get(musteriSiraNo);
        System.out.println("Seçilen müşteri: " + secilenMusteri.getAd());
        return secilenMusteri;
    }

}
