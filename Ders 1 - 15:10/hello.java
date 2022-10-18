public class hello {    

   
    
    public static void main(String[] args) {
        System.out.println("Hello naz!");
        int sayi = 10;
        long sayilong = 1000000000;
        double sayi2=5.5;
        boolean dogruluk = true;
        boolean hata = false;
        String name = "kaan";
        
        // System.out.println(sayi+sayilong);
        // System.out.println(name + " selamlar");
        for (int i = 5; i < 0; i++) {
            //i=2;
            //bir sey tanimladiginiz parca
            //kontrol ettiginiz parca 2.prca
            //kod calistiktan sonra yapilmasi gereken degisiklik
            System.out.println(name + " selamlar" + i);
        }
        
        // if (5 > 4) {
        //     System.out.println("5 4ten büyüktür.");
        // }
        
        // if (sayi > sayi2) {
        //     System.out.println("sayi 1 büyüktür.");
        // }
        //boolean değeri
        // if (dogruluk) {
        //     System.out.println("true oldugu icin calisir");
        // }
        // dogruluk = false;

        // if (dogruluk) {
        //     System.out.println("dogruluk degeri true");
        // } else {
        //     System.out.println("dogruluk degeri false");
        // }
        sayi = 26;
        if (sayi>30) {
            System.out.println("sayi büyüktür 30");
        } else if(sayi>20){
            System.out.println("sayi büyüktür 20");
        }else if (sayi > 10){
            System.out.println("sayi büyüktür 10");
        }else if (sayi>0) {
            System.out.println("sayi büyüktür 0");
        }else{
            System.out.println("sayi negatif");
        }


        int deger = 50;

        while (deger < 100) {
            
            System.out.println("deger kucuk");
            deger = deger + 5;


        }

        

    }

   
}