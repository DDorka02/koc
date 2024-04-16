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
        
        Jatekos tipp = new Jatekos();
        tipp.getTipp();
        
        while(szam != tipp.getTipp()){
        Jatekos elso = new Jatekos();
        elso.tippel();
        Jatekos masodik = new Jatekos();
        masodik.tippel();
        Jatekos harmadik = new Jatekos();
        harmadik.tippel();

        System.out.println("1. játékos tippje: "+ elso.getTipp());
        System.out.println("2. játékos tippje: "+ masodik.getTipp());
        System.out.println("3. játékos tippje: "+ harmadik.getTipp());
        
        boolean joTipp1= elso.getTipp()== szam;
        boolean joTipp2= masodik.getTipp()== szam;
        boolean joTipp3= harmadik.getTipp()== szam;
        if(joTipp1 || joTipp2|| joTipp3){
            System.out.println("Van nyertes");
        }
        else{
            System.out.println("A játékosok úrja probálkozak");
            System.out.println("a kitalálamdó szám:"+szam);
        }
         
        }        
            System.out.println("Játék vége");    
            
            
        
    }
    

        
   
}
