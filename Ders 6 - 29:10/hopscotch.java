// |= |= |= |=|=|=|=|=|=|

public class hopscotch{

    public static void main(String[] args) {
        int hops = 5;
        int count = hops*3;
        //bir fora ihtiyacim var hops kadar
        for(int i = 0; i < count ; i++){
            if ((i+1)%3==1) {
                System.out.println("  "+(i+1)+"  ");
            }
            if ((i+1)%3==2) {
                System.out.print((i+1)+"   ");
            }
            if ((i+1)%3==0) {
                System.out.println((i+1));
            }
        }
        System.out.println("  "+(count+1)+"  ");
        //bir de bittiginde en son sayiyi yazdirmak lazim

    }
}

// data = {3,3,0,0,6,9,0,-18}