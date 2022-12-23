import java.util.ArrayList;
import java.util.HashMap;



public class Main{
    public static void main(String[] args) {
        returnAllPlayers(null);
        // Player Kemal = new Player();
        // Player Birlik = new Player();
        // Player Trevor = new Player();
        // Player [] players = {Kemal,Birlik,Trevor};
        // players[0].playerName;
    }

    //turkie ligi 
        //galatasaray = 189101
            //10 = mesut ozul
        //ffenerbahce = 89103
            //15 = alex
    //avrupa ligi
        //real madrid
    //amerika ligi
        //ny warriors
    
    public static ArrayList<Player> returnAllPlayers(League[] leagues) {
        ArrayList<Player> tempPlayers = new ArrayList<Player>();
        //ligleri dön --> ligi sec
        for(League tempLeague : leagues){
        //ligin takimlarini don => takim sec
            for (Team tempTeam : tempLeague.teamsDictionary.values()) {
                 //takimin playerlerini don => ve onlari arrayliste ekle
                 for (Player x : tempTeam.players) {
                    //buldugum oyunculari arraylisste ekle
                    tempPlayers.add(x);
                 }
            }
       
        }
        
        return tempPlayers;
    }

    public static void questionTwo(League[] leagues) {
        //sadece vollayball iceren ligleri topla
        ArrayList<League> justVolley = new ArrayList<League>();
        //leagues arrayini don
        for(League tempLeague : leagues){
            //eger benim ligim volleybol oyunundaysa 
            if (tempLeague.getSportsType() == SportsType.Volleyball) {
                //justvolley arrayine kaydegt
                justVolley.add(tempLeague);
            }
        }
        
        //diger metodu kullanarak butun oyunculari cekelim
        HashMap<Integer,Player> playerMap = new HashMap<Integer,Player>();
        
        for(League tempLeague : justVolley){
            //ligin takimlarini don => takim sec
                for (Team tempTeam : tempLeague.teamsDictionary.values()) {
                     //takimin playerlerini don => ve onlari arrayliste ekle
                     for (Player x : tempTeam.players) {
                        //buldugum oyunculari hashmape ekle
                        //<jersey,player>
                        playerMap.put(x.getJN(),x);

                     }
                }
           
            }
            
        //hashmapteki player isimlerini ve numaralarini bas
        for(int a : playerMap.keySet()){
            System.out.println("Jersey Number: "+ a +"Player Position: "+ playerMap.get(a) );
        }
    }
    

}

class League {
public String leagueName; // name of the league
private SportsType sportsType; // type of sports
public String country; // country of the league
public HashMap<String, Team> teamsDictionary; 
// key: name of the team, value: team object defined below
public SportsType getSportsType(){
    return sportsType;
}
}
enum SportsType
{
Soccer, Basketball, Volleyball;}

class Team {
private String teamName; // name of the team
public Player[] players; // players in the team
public ArrayList<GameStatistic>gameStatistics;
// every game is added in that list one by one in chronological order
private int teamRating; // rating of the team
}
class Player {
public String playerName;
private int jerseyNumber; // jersey number of the player
public String position; // position of the player
private int annualSalary; // annual salary of the player
public double playerRating; // rating of the player
public int getJN(){
    return jerseyNumber;
}
}
class GameStatistic{
public HashMap<Player, Integer> points; // points scored by each player
public HashMap<Player, Double> time; // time each player played in minutes
public Player mvp; // shows the Most Valuable Player (MVP) of the game
private Team homeTeam; // home team
private Team awayTeam; // away team
}

// Again, besides the OOP basics I test in this question (classes, methods, enhanced for loops, 
// some data structures such as ArrayList and HashMaps), make sure you can use Random objects
//  well for this exam. You should be able to randomly pick among a set of alternatives, 
//  represent any probability mass function, calculate the long-term fraction of occurrence 
//  of some event, and the expected time until the occurrence of some event.