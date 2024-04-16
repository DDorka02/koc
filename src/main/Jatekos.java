package main;

import java.util.Random;

public class Jatekos {
    //adattagok
    private Random rnd = new Random();
    private int tipp;
    
    //tagfüvvény
    public void tippel() {
       tipp = rnd.nextInt(10);
            System.out.println("tippelésem:"+tipp);         
    }
    public int getTipp(){
        
        return tipp;
    }
}
