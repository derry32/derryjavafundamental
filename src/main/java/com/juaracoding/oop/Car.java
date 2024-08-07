package com.juaracoding.oop;

public class Car {
    String BahanBakar;
    int TahunPembuatan = 2000;

    Car(String BahanBakar){
        this.BahanBakar = BahanBakar;
    }

    void warna(){
        System.out.println("berwarna merah");
    }

    void mesin(){
        System.out.println("bermesin 1000 cc");
    }

    int getTahunPembuatan(){
        return TahunPembuatan;
    }
    String getBahanBakar(){
        return BahanBakar;
    }

}
