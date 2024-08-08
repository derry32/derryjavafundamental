package com.juaracoding.oop;

//Polymorphism Overriding
public class Segitiga extends BidangDatar{
    @Override
    void draw() {
       for (int i = 0; i < 5; i++){
           for (int j = 0; j <= i; j++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
}
