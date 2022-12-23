import java.util.Random;

public class Human {
    Random x=new Random(999);

    //attributes
    private String name;
    private int age;
    private boolean gender;
    private double height;
    private double weight;
    //constructor
    public Human(String name,int age,boolean gender,double height,double weight){
        if (age>=24 & age<=60) {
                this.age=age;
                this.name=name;
                this.gender=gender;
                this.height=height;
                this.weight=weight;
       }else{
        System.out.println("uncategorized");
       }

    }

    //behaviours
    public void ageHuman() {
        this.age+=x.nextInt(6)+1;//1 2 3 4 5 6
    }

    //getter
    public double getHeight(){
        return this.height;
    }
    //setter
    // public void setHeight(double x){
    //     this.height=x;
    // }

}