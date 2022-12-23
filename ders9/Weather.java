import java.util.HashMap;
import java.util.Random;

public class Weather {
    
   

// Q1) Create a Weather class that generates the day's weather 
// (Sunny, Cloudy, or Rainy) based on probability. 
    //attributes
    String type;
    Random rand = new Random(567);
    //HashMap weathers
    // ("Sunny", 35)
    // ("Cloudy", 15)
    // ("Rainy", 50)


// While creating the weather object, 


// if you are given a HashMap that represents the probabilities of each weather type, 
// you should generate the weather according to these probabilities. 

        //constructor 1
    public Weather(HashMap<String,Double> x){

        double perc1 = x.get("Cloudy");
        double perc2 = perc1+ x.get("Rainy");


        double randValue = rand.nextDouble();// 0.67
            if(perc1>randValue){
                //type assign
                this.type="Cloudy";
            }else if(perc2>randValue){
                this.type="Rainy";
            }else{
                this.type="Sunny";
            }
    }

//  If not, you should
//  assume that the season is summer and the probabilities are 80% sunny, 10% rainy, 
//  and 10% cloudy.
        //constructor 2
        public Weather(){
            double randValue = rand.nextDouble();// 0.67
            if(0.1>randValue){
                //type assign
                this.type="Cloudy";
            }else if(0.2>randValue){
                this.type="Rainy";
            }else{
                this.type="Sunny";
            }
        }
}
