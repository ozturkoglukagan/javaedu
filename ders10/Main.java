import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Human kaan = new Human("kaan", 28, true, 200, 100);
        //Create a main class and create 5 different humans.(from each category)(4p)
        Human kiraz = new Human("kiraz", 26, false, 180, 60);
        //Create a loop which runs until there is 25 people at 25
        // years old created and report the count to the console. (the loop should create human objects) (10p)
        int tfHumanCount=0;
        int totalcount=0;
        Random age = new Random(1033);
        while (tfHumanCount != 25) {
            int randomAge = age.nextInt(37)+24;//24 - 60
            Human temp = new Human("human"+totalcount,randomAge, false, 100, 100);
            totalcount++;
            if (randomAge == 25) {
                tfHumanCount++;
            }
        }
        //System.out.println(totalcount);

        //hashmap
        //(key,value)
        HashMap<Integer,String> gamers = new HashMap<Integer,String> ();
        //deger ekleme
        gamers.put(23,"miley cyrus");
        gamers.put(17, "kaan");
        gamers.put(29, "beste");
        gamers.put(37, "simal");
        gamers.put(99, "naz");
        //bunlari cagirma
        System.out.println(gamers.size());

        System.out.println(gamers.get(17));
        //hepsini cagirma
        for (int x : gamers.keySet() ) {
                System.out.println(x);
        }
       
        gamers.values();



    }   
}
