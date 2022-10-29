public class rec2sol {
    // 1)  Get two integer value from the user (a and b) and print the b'th power of a 
    
    // 2) Calculate the summation of two doubles taken by the user and print it out
    
    // 3) Given a list of integers, count the number of negative numbers and print it out
    
    // 4) Given a list of integers, if there is any number divisible by 3 print its order (not index, orders start from 1). If not print "No divisible by 3"
        public static void main(String[] args) {
            // 5) Given a list of integers, find the summation of even numbers that are divisible by 5
           
            int sum =0;
            //sayilari gez
            for(int i = 0; i < args.length; i++ ){
                //temp sayi olustur
                int temp = Integer.parseInt(args[i]);
                //eger kritere uyarsa
                if (temp % 2 == 0 && temp % 5 == 0) {
                    //sum sayisini arttir
                    sum+=temp;
                }
            }
            System.out.println("sum is: " + sum);
        // 6) Given a list of integers, find the minimum even number. If there are no even numbers in the set print out "There are no even numbers"
        int minNumber = Integer.MAX_VALUE;
        //20200000
        for(int i = 0; i < args.length; i++ ){
            //temp sayi olustur
            int temp = Integer.parseInt(args[i]);
            //eger kritere uyarsa
            if (temp % 2 == 0) {
               //elimizdeki sayinin kucujklugunu kontrol sagla 
               //temp = 2
               if (temp < minNumber) {
                minNumber = temp;//minNumber == 2
               }
            }
        }
        //if the value of minnumber hasnt changed
       if (minNumber == Integer.MAX_VALUE) {
        System.out.println("There are no even numbers");
       }else{
        System.out.println("Min even number is: "+minNumber);
       }
        // 
        }
    
    
    }
    