public class Largest {
    public static void main(String[] args) {
        // n sayisini ilk inputa esitliyor
        int n = Integer.parseInt(args[0]);
        // yeni bir array declare ediyor
        int[] numbers = new int[args.length-1];

       // int n = 10;
       // n = 15;
       //args[0]= 15;
        //args = {"2","4","5","2","3"}; 5
        //numbers = {4,5,2,3}; 4

        // args arrayinde kalan sayilari gezmek icin, 
        for(int i=0;i<numbers.length;i++)
        {
            //arrayi kopyalıyorum
            numbers[i] = Integer.parseInt(args[i+1]);
        }


        //args = {"2","4","5","2","3"};
        //numbers = {4,5,2,3};
        //flags = {false,false,false,false};
        boolean[] flags = new boolean[numbers.length];
        //yeni bir integer olusturmus 
        int bestValue=0;
        //kacinci en buyuk sayiya ulasmak istiyorsam o kadar donduruyorum
        for(int i=1;i<=n;i++)
        {
            //Integer.MAX_VALUE = olabilecek en buyuk integer 
            bestValue = -Integer.MAX_VALUE;
            // location tutmak amaciyla yapilmis
            int loc = 0;
            //numbers lengthi dön
            for(int j=0;j<numbers.length;j++)
            {
                //args = {"2","4","5","2","3"};
                //numbers = {4,5,2,3};
                //flags = {false,true,false,false};
                //j = 3;
                //bestvalue = 5
                //loc = 1
                if(numbers[j]>bestValue && flags[j]==false)
                {
                    //bestvalue degerini guncelle
                    bestValue=numbers[j];
                    loc=j;
                }

            }
            flags[loc]=true;
        }


        System.out.println(bestValue);

        //Alternatively the following can be used
        /*for(int i=1;i<args.length;i++)
        {
            numbers[i-1]=Integer.parseInt(args[i]);
        }*/



    }
}