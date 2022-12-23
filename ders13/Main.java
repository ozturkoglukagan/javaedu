import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

// [3:40 PM, 12/5/2022] Kaan Ozturkoglu: tamamdır ana başlıklarımız 
// - Döngüler for, foreach, while
// - OOP Class, Attribute, Constructor, Behaviour
// [3:41 PM, 12/5/2022] Kaan Ozturkoglu: - Data Toplama Array, Arraylist, Hashmap
// [3:41 PM, 12/5/2022] Kaan Ozturkoglu: - Random Random class, seed
// [3:42 PM, 12/5/2022] Kaan Ozturkoglu: getter setter

class Lesson{
    private double minute;
    String name;
    Lecturer teacher;

    public Lesson(Lecturer l, String n, double m){
        this.teacher=l;
        this.name=n;
        this.minute=m;
    }

    public double getMinute(){
        return this.minute;
    }
}

class Lecturer{
    String branch;
    String name;

    public Lecturer(String b, String n){
        this.branch=b;
        this.name=n;
    }
}

public class Main{
    public static void main(String[] args) {
        Lecturer erhun = new Lecturer("Erhun", "Indust Eng");
        Lesson IE246 = new Lesson(erhun, "IE246", 150); // 6
        Lesson IE232 = new Lesson(erhun, "IE232", 190); // 4
        Lesson IE343 = new Lesson(erhun, "IE343", 100); // 2

        //hashmap ile dersler ve kredilerini tutalim 
        HashMap<Lesson,Integer> credits = new HashMap<Lesson,Integer>();


        credits.put(IE343, 2);
        credits.put(IE232, 4);
        credits.put(IE246, 6);

        //hashmapin icindeki derslerin dklarini konsola yazdir
        for (Lesson x :credits.keySet()) {
            System.out.println(x.getMinute());
        }
        ArrayList<Lesson> lessons = new ArrayList<Lesson>();
        Random x = new Random(10000);
        //50 tane ders olusturma
            for (int i = 0; i < 50; i++) {
                Lesson temp = new Lesson(erhun, "Ders "+i , x.nextInt(100)+100);
                lessons.add(temp);
                credits.put(temp, (2+ x.nextInt(7)));// 0 = 6 , 2=8
            }
        

        // for (Lesson a :lessons) {
        //     System.out.println(a.name + " " + a.getMinute());
        // }    

        for (Lesson lesson : credits.keySet()) {
            System.out.println(lesson.name+ " credit number is" + credits.get(lesson));
        }

        for (int i : credits.values()) {
            System.out.println(i);
        }

    }
}