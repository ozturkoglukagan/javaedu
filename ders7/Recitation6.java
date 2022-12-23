import java.lang.reflect.Array;

public class Recitation6 {
// 1) Write a method that returns the number of even integers in a given array.
    public static int name(int[] arrayx) {
        int count = 0 ;
        //for donduruyorum 
        for (int i = 0; i < arrayx.length; i++) {
            //eger sayi ciftse
            if (arrayx[i]%2==0) {
                count++;
            }
        }

        return count;
    }
// 2) Write a method to compute the sum of the digits in an integer.
    //metod
    //sayinin mod 10 alip kalan sayiyi toplama

// 3) Write a method that prints the common elements between two integer arrays.
    // metod (parametre olarak 2 array)
    // for dondurucem
        //for icinde for
    //common element' bastir
    public static void name(int[] x,int[] y) {
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (y[i]==x[j]) {
                    System.out.println();
                }
            }
        }
    }


// 4) Write a method to check whether an year (integer) is a leap year or not.
// To be a leap year, the year number must be divisible by four – except for 
// end-of-century years, which must be divisible by 400. This means that the year
// 2000 was a leap year, although 1900 was not. 2020, 2024 and 2028 are all leap years.

//metod
// sayiyi mod 100 alicam , kalan sifirsa centurydir ve 400e bolcem
// sifir degilse eger 4e bolcem
        public static boolean leapYear(int year) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true; 
                }else{
                    return false;
                }
            }else{
                if (year % 4 == 0) {
                    return true; 
                }else{
                    return false;
                }
            }
        }

        public int mathematk(int x ) {
            return (int) Math.pow(x, 15)*30+123982;
        }


// 5) Clump is defined as a series of 2 or more adjacent elements of the same value. 
//   Write a method that returns the number of clumps in a given array.
  
    public static int clump(int[] x) {
        //count
        int count = 0;
        //for dondur
        for (int i = 0; i < x.length-1; i++) {
            while (x[i]==x[i+1]) {
                i++;
            }
            count++;
        }
           return count;
    }

// 6) Given an array, write a method that returns true if there is a place to split
//  the array so that the sum of the numbers on one side is equal to the sum of the 
//  remaining numbers on the other side.
    public static void main(String[] args) {
        int[] arr={4,4,4,6,2,7,8};//12(bulundugum indexin sayisi) =   41(toplam sayi) - 12(bulundugum index sayisi) == 29
        int[] arrx={4,1,1,1,1};//true
        int[] arrz={4,1,5};//true
        int[] arry={44,14,4,6,20};//88 - 44 = 44
       //false
        System.out.println( splitter(arr));
        System.out.println( splitter(arrx));
        System.out.println( splitter(arry));

        
    }

    public static boolean splitter(int[] x){
        //bulundugum konuma kadar sayilari topla
            int arraySum=0;
            int currentSum=0;
            //foreach döndür = b]t]n sayilarin toplamini ogren
            for(int i : x){
                arraySum+=i;
            }
            //bulundugum konumla kalan sayiyi kiyasla
            for (int a : x) {
                //bir adet if ile kontrol etmem lazim
                currentSum+=a;
                if (arraySum == 2*currentSum) {
                    return true;
                }
            }

        return false;
    }


}
