import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


class Knapsack{
    String color;
    double capacity;
    public Knapsack(String c,double cap){
        this.color=c;
        this.capacity=cap;
    }
}

class Item{
    String ID;
    public Double value;
    double price;
    double volume;
    public Item(double v, double vol, String id){
        this.price=v;
        this.volume=vol;
        //calculate value
        this.value= price/volume;
        this.ID = id;
    }
}
public class KnapsackProblem{
    public static void main(String[] args) {
        //to hold the items
        ArrayList<Item> items = new ArrayList<Item>();
        items = createItems(20);
        //creating the knapsack
        Knapsack knapOne = new Knapsack("Color", 200);
        SolveGreedy(knapOne, items);
    }
    //to create items
    //create a method
    //which creates item objects which its price changes between 10 to 60
    //and volume which varies between 25 to 70 both included 
    //then it returns an arraylist with the objects created.
    public static ArrayList<Item> createItems(int count) {
        Random x = new Random(100);
        ArrayList<Item> temp = new ArrayList<Item>();
        //20 adet item olusmali
        for (int i = 0; i < count; i++) {
            //item olusturcam sonra bunlari bir arrayliste koyucam
            //yeni item olustur, sonra bunu koy
            Item tempItem = new Item((x.nextDouble()*50)+10 , (x.nextDouble()*45)+25,"Item "+(i+1));
            temp.add(tempItem);
        }
        return temp;
    }



    public static void SolveGreedy(Knapsack k, ArrayList<Item> itemsArraylist) {
        //to solve greedy I need to calculate the values of items
        // elimte itemler var ve bunlarin value
        //maximize edip bunları bir şeye koymak istiyorum
        // simal = metod olustur bi tane hashmap 
        HashMap <Double,Item> itemsValues = new HashMap<Double,Item> ();
        //hashmapi dolduralim
        //elimdeki item sayisi kadar donmeli 
        for (int j = 0; j < itemsArraylist.size(); j++) {
            //arraylistteki itemin degeri
            //arraylistteki item
            itemsValues.put(itemsArraylist.get(j).value,itemsArraylist.get(j));
                            //{11,item1}
                            //{2,item2}
                            //{5,item3}
                            //{6,item4}
                            //{8,item5}
                            //{9,item6}
        }
        //en iyi value olan itemi bulalim
       
        //while knapsack.capacity>0
        double currentSize = k.capacity;
        //create a knapsack arraylist
        ArrayList <Item> knapsackItems = new ArrayList <Item> ();
        while (currentSize>0) {
            // for ile en buyuk degeri bul
            double tempValue = 0;
            Item biggestItem = null;
            for (Item item : itemsArraylist) {
               if (item.value>tempValue) {
                tempValue=item.value;
                biggestItem = item;
               }
            }
            try {
            // degeri knapsacke ekle (eger yer varsa)
            if (currentSize>=biggestItem.volume) {
                knapsackItems.add(biggestItem);
                //kanpsack kapaciteyi azalt
                currentSize-=biggestItem.volume;
            }
                
          
            //ve itemi items arraylistinden cikar
            itemsArraylist.remove(biggestItem);

            } catch (Exception e) {
                break;
            }
            
        }
        System.out.println("Problem Solved!");
        System.out.println("there is " + knapsackItems.size()+" items in this knapsack. Which are: ");
        double sumValue=0;
        for (Item item : knapsackItems) {
            System.out.println(item.value);
            sumValue+=item.value;
        }
        System.out.println("Total Value: " + sumValue);
        //knapsacke koydugum elimdeki itemlerin degerleri var
        // bu item degerlerinden hashmapten itemleri bulun ve isimlerini yazdirin.
            //hashmap keylerini dön 
            for (Double x: itemsValues.keySet()) {
                // sendeki value ile ayni key degerdeki itemi bul
                for (Item item : knapsackItems) {
                    if (x==item.value) {
                         //syso item.id
                         System.out.println(item.ID);
                    }
                }
            }
                
        
    }       
        


    public static void SolveOptimal() {
        
    }   
    

}