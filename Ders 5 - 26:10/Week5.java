public class Week5 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int t=9;
        for(int i=1;i<10;i++){
            System.out.println(i+1);
            t=t+3;
            if(t==15)
                break;
        }
        System.out.println(t);

        int[] myFirstIntArray = new int[3];
        myFirstIntArray[0]=5;
        myFirstIntArray[1]=6;

        int newA=5, b=3; // let's refactor a and call it newA
        newA=b; //a=3
        b=b+1; //b=4;

        int[] aArr = new int[1];
        int[] bArr = new int[1];

        System.out.println(aArr.length); // prints 1

        aArr[0]=5;
        bArr[0]=3;

        aArr=bArr; // aArr -> bArr
        bArr[0]=bArr[0]+1; // bArr=[4]<-aArr
        aArr[0]=55;

        aArr=new int[4];

        double[] dArr = {3,4,5.5};



    }
}
