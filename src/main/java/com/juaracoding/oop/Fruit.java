package com.juaracoding.oop;

public class Fruit {

    //state
    int grams;
    int calsPerGram;
    //modifier Public : Lintas Package
    //protected : hanya bisa diakses di class yg sama
    //tanpa modifier bisa namun dalam satu package
    //private :

    //behavior
    int totalCalories(){
        return grams*calsPerGram;
    }

}
