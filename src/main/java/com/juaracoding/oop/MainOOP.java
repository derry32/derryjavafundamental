package com.juaracoding.oop;

import java.util.Date;

public class MainOOP {

    public static void main(String[] args) {

        Date date = new Date(1722774422000L);
        System.out.println(date);
        System.out.println(date.getDay());

    Fruit apple = new Fruit();
    apple.grams = 60;
    apple.calsPerGram = 15;
    System.out.println(apple.totalCalories());
    System.out.println(apple);//alamat memori

        Fruit avocado = new Fruit();
        avocado.grams = 220;
        avocado.calsPerGram = 354;
        System.out.println(avocado.totalCalories());
        System.out.println(avocado);//alamat memori

        Car mobil = new Car ("Pertalite");
        mobil.warna();
        mobil.mesin();
        System.out.println("bahannya :" + mobil.getBahanBakar());
        System.out.println("tahunpembuatan : " + mobil.getTahunPembuatan());


        Product product1 = new Product ("SSD1", "Vizta SSD", 200000, "Kecepatan 50 Gbz", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pricebook.co.id%2Farticle%2Fmarket_issue%2F8555%2Fssd-terbaik-dan-termurah&psig=AOvVaw3Gp1PK3a8VR71cAkXzkl-c&ust=1723085346102000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCNjU46Lv4YcDFQAAAAAdAAAAABAE");
        product1.detailProduct();
        product1.addToCart();


        Product product2 = new Product("SSD2", "Sandisk SSD", 500000, "258 GB Fast","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.amazon.com%2FSanDisk-Ultra-NAND-500GB-Internal%2Fdp%2FB072R78B6Q&psig=AOvVaw3Gp1PK3a8VR71cAkXzkl-c&ust=1723085346102000&source=images&cd=vfe&opi=89978449&ved=0CBQQjhxqFwoTCNjU46Lv4YcDFQAAAAAdAAAAABAJ");
        product2.detailProduct();
        product2.addToCart();


    }




}







