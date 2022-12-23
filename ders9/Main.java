import java.util.Random;

// arrayl'stler
//randomlar
//classalr
public class Main{

    public static void main(String[] args) {
        //Randomlar = math.random
        double randValue = Math.random();
        if (randValue<0.7) {
            System.out.println(randValue);
            System.out.println("the req is set");
        }
        Random x = new Random(9999);
        int hello = 50;
        x.setSeed(0001);
        //seed 4567890098765467890 = 0.67
        //seed 00987654 = 0.23445
        
        x.nextInt(67);// 0 1 2 3 4 5 6 7 8 9
        x.nextDouble();//0.6767890 = math.random()
        //25 37 = 12 arasinda bir rastgele
        hello=40;
        int number = 25 + x.nextInt(12);
        System.out.println(number);
        //        System.out.println(x.ints(25,37));

    }
}