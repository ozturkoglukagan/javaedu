import java.util.ArrayList;
import java.util.Random;

public class rec78 {
    public static void main(String[] args) {
         Random x = new Random();
        // Random y = new Random(200);
        // Team team1 = new Team(x);
        // Team team2 = new Team(y);
        ArrayList<Team> teams = new ArrayList<Team>();
        for (int i = 0; i < 200; i++) {
            Team temp = new Team(x);
            teams.add(temp);

        }

        

       
    }
}

// Q2) Write a Java code that simulates a single-elimination tournament. 
// Pick two teams randomly and generate random doubles between 0-1. 
// Decide on a winner by looking at the random values: higher is better. 
// Report the winner's opponents.
class Team{
    //takimin random degeri
    double value;

    public Team(Random x){
        this.value = x.nextDouble();
    }

}



class Rectangle{
    //attributes
    int height;
    int width;
    int area;
    //constructor
    public Rectangle(int h,int w){
       if (w>h) {
        this.height=w;
        this.width=h;
       }else{
        this.height=h;
        this.width=w;
       }
    }

    public void draw(){
        //height
        for (int i = 0; i < height; i++) {
            //width
            for (int j = 0; j <width; j++) {
                System.out.print("X");
            }
        }
     
       
    }

    public int area(int a){
        //elimdeki objenin height ve witdh ini carpip sonra carpanla carpacam
        return this.height*this.width*a;
    }



    //behaviour
}
// Draw the circumference of the given rectangle object, where top and bottom borders are - as many as length, and sides for each row are | (as many as width minus 2) with space in between (as many as length minus 2). Examples for smaller values are below.
// Compute the area multiplied by a given number. 
// So we should be able to do the following:
// Rectangle rectangle = new Rectangle(5,10); // even if we wrote new Rectangle(10,5), it should create the same object and provide the "exact same" outputs!
// rectangle.draw();
// ----------
// |        |
// |        |
// |        |
// ----------
// int fourAreas=rectangle.area(4); // four times the area so fourAreas becomes 200.
// Rectangle rectangle2 = new Rectangle(2,3);
// rectangle2.draw();
// ---
// ---
// Rectangle rectangle3 = new Rectangle(5,1);
// rectangle3.draw();
// -----
// int fiveAreas=rectangle3.area(5); // five times the area so fiveAreas becomes 25.
// Rectangle rectangle4 = new Rectangle(4,3);
// rectangle4.draw();
// ----
// |  |
// ----
// int fiveAreas=rectangle4.area(5); // five times the area so fiveAreas becomes 60.





// Q1 a) Write a method that generates a weather forecast for a 
// given number of days and returns the weather of these days in a list.
//  Report the ratio of the occurrence of each weather type.

// // Q1 b) Write a method that finds the expected number of days
//  before we observe a Sunny day occur after a Rainy day.


// (From last week)

// Q1 Bonus) Create a ContactBook class that stores the name of the 
// owner and a list of contacts. You can add contacts to and remove contacts
// from this list. Also, add a method that states the contact book owner's name and contacts' information.

// Q1 Bonus2) While creating random phone numbers, instead of 0, 
// assume that the fourth digit of the phone number cannot be 6 
// (Your phone number cannot be 0506 123 45 67). How would you update your code?




