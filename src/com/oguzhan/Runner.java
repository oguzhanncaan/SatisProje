package com.oguzhan;

import com.oguzhan.service.SatisService;

public class Runner {
    public static void main(String[] args) {
        /**
         * Presentation Layer --> Sunum Katmanı - Garson
         * Services Layer --> Aşçı
         * Data Access Layer --> Veri Katmanı - Ürünlerin Temin Edildiği Depo vs.
         */
        SatisService satisService = new SatisService();
        satisService.satisYap();



    }
}
