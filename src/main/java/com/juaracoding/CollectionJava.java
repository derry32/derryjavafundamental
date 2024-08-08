package com.juaracoding;

import java.util.ArrayList;

public class CollectionJava {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<>();

        //create
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.size());

        //read
        for (String car : cars){
            System.out.println(car);
        }
        for (int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }
        //read/get all data
        System.out.println(cars.get(2));

        //update
        System.out.println("======Update=====");
        cars.set(2,"Toyota");
        System.out.println(cars.get(2));

        //delete
        System.out.println("======Delete=====");
        cars.remove(2);
        for (String car : cars){
            System.out.println(car);
        }

        //menu crud switch case, looping, collection java

    }
}
