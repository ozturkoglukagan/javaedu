// Question 7: Find the perfect numbers in range 1-100
// (both inclusive) and print them Hint: A number is a perfect number 
// if the summation of its divisors except for itself is equal
//  to the number itself. E.g. 6 is a perfect number --> (1 + 2 + 3 = 6)
public class recitation {
    //100e kadar bisey don 
        //sayinin divisorlarini bul ve topla
        //sum = divisorlari topla

    
    public static void main(String[] args) {
        // int x = 50;
        // int sum = 0;
        // for (int i = 1; i < x; i++) {
        //     if (x % i ==0) {
        //         sum+=i;
        //     }
        // }
        // System.out.println(sum);//1 2 5 10 25 

        //ilk 100 sayi
        for (int number = 1; number <= 100; number++) {
            //divisor toplami bulma
            int tempSum=0;
            for (int i = 1; i < number; i++) {
                if (number % i ==0) {
                    tempSum+=i;
                }
            }

            if (tempSum==number) {
                System.out.println("Perfect Number!: "+number);
            }
        }
    }

    
}
