package com.juaracoding.oop;

public class MainConcept {

    public static void  main(String[] args) {


        //Encapsulation
        User admin = new User();
        admin.setUsername("admin");
        admin.setPassword("password");
        System.out.println(admin.getUsername());
        System.out.println(admin.getPassword());

        User staff = new User();
        staff.setUsername("staff");
        staff.setPassword("p4ssw0rd");
        System.out.println(staff.getUsername());
        System.out.println(staff.getPassword());


        staff.setCurrentPassword("p4ssw0rd");
        staff.setNewPassword("0822344");
        staff.setConfirmPassword("08223445");
        staff.changePassword(staff.getCurrentPassword(), staff.getNewPassword(), staff.getConfirmPassword());

        //Polymorphism Overloading contoh Search
        Calculator calculator = new Calculator();
        calculator.sum(2, 3);
        calculator.sum(2.5, 3.5);

        //Polymorphism Overridding contoh Payment Method
        BidangDatar bidangDatar = new BidangDatar();
        bidangDatar.draw();
        BidangDatar segitiga = new Segitiga();
        segitiga.draw();

        //Inheritance selagi satu package bisa pakai Modifier Protected asalkan Extends
        //kalau beda Package pakai Modifier Public
        Manager manager1 = new Manager();
        manager1.nama = "Nama";
        manager1.departemen = "QA";
        System.out.println(manager1.nama);
        System.out.println(manager1.departemen);

    }
}
