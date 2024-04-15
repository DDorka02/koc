package main;

import java.util.Random;


public class Jatek {
    Random rnd = new Random();
    
    //konstruktor
    public Jatek() {
        start();
    }
    
    void start(){
        System.out.println("Gondoltam egy számra 0 és 9 között.");
        int szam = rnd.nextInt(10);
        System.out.println("a kitalálamdó szám:"+szam);
    }

}
