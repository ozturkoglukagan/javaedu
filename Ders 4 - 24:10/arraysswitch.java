public class arraysswitch{

    // compile etmek için: javac 

    public static void main(String[] args) {
        // System.out.println("deneme");
        //Array
            // Array = boyutu belirlenmis obje (degisken) tutan 
            // arraylist = boyutu belirtilmeyen sonsuz büyüklükte eleman depolayabilen yapı
            // hashmap = bilgi tutan 
            
        // int, double, boolean, string
        // int arrayi olusturma
        int[] intArray = new int[10]; 
        // intArray =  {0,0,0,0,0,0,0,0,0,0}; //10
        int[] otherArray = {0,1,2,3,4,5,6,7,8,9}; //10
        int[] normalArray = {1,2,3,4,5,6,7,8,9,10}; //10

        double[] doubleArray = {10,123,2324,2334,23445,5,5632,5723,58235,3595}; //10
        //                      0  1   2    3    4     5 6    7    8     9
        boolean[] booleanArray = {true,false,false};
        // System.out.println(otherArray[6]);
        // System.out.println(doubleArray[4]);
        //declare etmek =
        // String isim = "kaan";
        // System.out.println(isim);
        // isim = "naz";
        // System.out.println(isim);
        // int deger = 10;
        // System.out.println(deger);
        // deger = 600;
        // System.out.println(deger);
        // System.out.println( doubleArray[2]);
        // //doubleArray arrayinin 2. indexindeki sayiyi (2324) 999 olarak guncelleyelim
        doubleArray[2] = 999;
        // // 10,123,999,2334,23445,5,5632,5723,58235,3595
        // System.out.println( doubleArray[2]);
        //arrayin icindeki bilgileri yazdirmak
        // for (int i = 0; i < doubleArray.length ; i++) {
        //     System.out.println(doubleArray[i]);
        // }
        //kac tane kemal yazisi gorurum
        //for each
        int count = 0;
        for (double x : doubleArray) {// 10,123,999,2334,23445,5,5632,5723,58235,3595
            //x=10;
            // for (int y : otherArray) {//0,1,2,3,4,5,6,7,8,9
                //y=0;
                System.out.println(count);
                //count = 40
                count++;
            // }
        }

        // for (int x : otherArray) {
        //     System.out.println(x);
        // }
    }


}