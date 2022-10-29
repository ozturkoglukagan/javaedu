public class questions {
//Question 0: Print and concat examples
// Compile and run
// compile etmek icin: javac questions.java
// calistirmak icin: java questions 
// inputla calistirmak icin: java questions input1 input2 input3 input4 x

    public static void main(String[] args) {
        //String[] strarray= {"input1","input2","input3","input4","x"};
       //                       0       1        2         3     4
    //array = bilgi & obje & sayı string boolean 
    //arraylist , hashmap , array
        int[] inttutanarray = new int[10]; //{0,0,0,0,0,0,0,0,0,0}
        int[] intarray = {10,234,35,345,315,475,234,904,787,899};
        //                 0  1  2   3   4   5   6   7   8   9 
        //System.out.println(intarray[3]);

        //argumanlarin oldugu bir string array olusturur
        
        //args[] = {input1,input2,input3};
        
        
        System.out.println(args[1]);
        //System.out.println("hello");
        // Question 1: Calculate the sum of even numbers from 13 to 57

            int sum1 =0;
            int sum2 =0;
        // Question 2: Playing with loops (condition, integer definition out)
            // for(int i = 13; i < 57 ; i++){
            //     if (i % 2 == 0) {
            //         sum1+=i;
            //     }
            // }

            // for(int i = 14; i < 57 ; i+=2){
            //     sum2+=i;
            // }

            // System.out.println("first sum = "+sum1);
            // System.out.println("second sum = "+sum2);
        // Question 3: Write a Java code that prints all the numbers between 0 and 500 that are divisible by 8 but not by 5.
            // for (int i = 0; i < 500; i++) {
            //     if (i % 8 == 0 && i % 5 != 0 ) {
            //         System.out.println(i);
            //     }
            // }
        
        // Question 4: Find the prime numbers in range 1-100 (both inclusive) and print them
            //primeNumbers();

        //method = kod blogu



        // Question 5: Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57.
            //lastDigit();
        
        // Question 6: The children spend most of the day playing. 
        //In particular, they play if the temperature is between 20 and 30 (inclusive). 
        //Unless it is summer, then the upper limit is 35 instead of 30. Given an int temperature and a boolean isSummer, 
        //print out if the children will play or not.
            //Stringi inte cevirmek icin PARSEINT
            int temperature = Integer.parseInt(args[0]);
            //Stringi booleana cevirmek icin PARSEBOOLEAN
            boolean isSummer = Boolean.parseBoolean(args[1]);
            isPlaying(temperature,isSummer);

        // Question 7: Find the perfect numbers in range 1-100 (both inclusive) and print them Hint: A number is a perfect number if the summation of its divisors except for itself is equal to the number itself. E.g. 6 is a perfect number --> (1 + 2 + 3 = 6)
    }

    //scope = degiskenlerin tanimli olduklari aralik {}

    public static void isPlaying(int x, boolean y) {
        int temp = x;
        boolean isSummer = y;
        if (isSummer) {
            if (temp >=20 && temp <=37) {
                System.out.println("Children are playing.");
            }else{
                System.out.println("Children are not playing.");     
            }
        }else{
            if (temp >=20 && temp <=30) {
                System.out.println("Children are playing.");
            }else{
                System.out.println("Children are not playing.");     
            }
        }


    }

    

    public static void lastDigit() {
        int num1 = 27;
        int num2 = 56;
        if (num1 % 10 == num2 % 10) {
            System.out.println("true");
        }
    }

    //public = diğer dosyalardan erişilebilmesi için
    //static = main methodda çağıracağınız metodların isminde statik olmalı
    //void = return tipi ()2

    public static void primeNumbers() {
        boolean isPrime = false;
        // iterate along the numbers 0 from 100 
        for (int i = 2; i <= 100; i++) {
            // think of every number as prime
            isPrime=true;
            // to control number 2 
            if (i==2) {
                System.out.println(i+ " is a prime number");            
            }else{
                //checking if a number is prime
                for (int j = 2; j < i; j++) {
                    //ve eğer sayı bölünüyorsa prime değil olarak işaretliyorum
                    if (i % j == 0) {
                    isPrime = false;
                    }
                 }
                 // eğer sayı prime ise bastır
                 if (isPrime) {
                    System.out.println(i+ " is a prime number");
                }
            }
  
        }
    }

    //array = bilgi & obje & sayı string boolean 
    //arraylist , hashmap , array



}
