public class rec3sol {
// Question 1: What is the output of the following code block?

// public static void main(String[] args) {
//     for (int i = 1; i <= 10; ++i) {
//       if (i > 4 && i < 9) {
//         continue;
//       }
//       System.out.println(i);
//     }
//  }

// Output :
// 1
// 2
// 3
// 4
// 9
// 10


// Question 2: What is the output of the following code block?

// public static void main(String[] args) {
//     int i = 1, j = 1;
//     // outer loop
//     while (i <= 3) {
//       System.out.println("Outer Loop: " + i);
//       // inner loop
//       while(j <= 3) {
//         if(j == 2) {
//           j++;
//           continue;
//         }
//         System.out.println("Inner Loop: " + j);
//         j++;
//       }
//       i++;
//     }
//   }

// Output :
// Outer Loop: 1
// Inner Loop: 1
// Inner Loop: 3
// Outer Loop: 2
// Outer Loop: 3

// Question 3: Draw the circumference of the given rectangle, where top and bottom borders are - as many as length, 
//and sides for each row are | (as many as width minus 2) with space in between (as many as length minus 2). 
//Examples for smaller values are below (10,5):
// ----------
// |        |
// |        |
// |        |
// ----------
//  //Solution
//     public static void main(String[] args) {
//      int width = Integer.parseInt(args[0]);
//      int height = Integer.parseInt(args[1]); 

//      drawRectangle(width,height);
     
//     }

//     public static void drawRectangle(int width, int height) {
//         // yukari icin cizgi atan bir kod
//         for (int i = 0; i < width; i++) {
//             System.out.print("-");
//         }
//         //yeni bir satira gec
//         System.out.println();
//         //for
//         for (int i = 0; i < height-2; i++) {
//               //aradaki parcalar icin bir kod (kac tane olacagini dondurmek icin bir for)
//                 //bi tane dik cizgi
//                 System.out.print("|");
//                 //boslugu yazdir
//                     for (int j = 0; j < width-2; j++) {
//                         System.out.print(" ");
//                     }
//                 //bi tane daha dik cizgi
//                 System.out.print("|");
//                 //yeni satira gec
//                 System.out.println();
//         }
        
          
//         // asagi icin cizgi atan bir kod
//         for (int i = 0; i < width; i++) {
//             System.out.print("-");
//         }
//     }






// Question 4: Draw a triangle using *. Take number of rows as an input from the user.

// Question 5: Use switch case in a program that will provide the associated letter grade for a point grade.
//With java call, two midterm scores that weight 30% each and a final grade that weight 40% is provided by the user. 
//Calculate the overall grade and print A if it is in [90-100], C in [40,50), D in [20,30) etc.

 public static void main(String[] args) {
   int mt1 = Integer.parseInt(args[0]);
   int mt2= Integer.parseInt(args[1]);
   int finalExam = Integer.parseInt(args[2]);
    gradeCalculator(mt1,mt2,finalExam);
 }

private static void gradeCalculator(int mt1, int mt2, int finalExam) {
    double overall = mt1*0.3 + mt2*0.3 + finalExam*0.4;
    int intValue = (int) overall/10;

    switch (intValue) {
        case 10:
            System.out.println("Grade is A+!");
            break;
        case 9:
            System.out.println("Grade is A!");
            break;
        case 8:
            System.out.println("Grade is B+");
            break;
        case 7:
            System.out.println("Grade is B!");
            break;
        case 6:
            System.out.println("Grade is B-!");
            break;
        case 5:
            System.out.println("Grade is C+!");
            break;
        case 4:
            System.out.println("Grade is C!");
            break;
        case 3:
            System.out.println("Grade is C-!");
            break;
        case 2:
            System.out.println("Grade is D!");
            break;
        default:
            System.out.println("Grade is F, you failed.");
            break;
    }
}

// Question 6: Write a code that reports the average of the even numbers (including both) between the two inputs (arguments) you provide. The numbers are given with the java call. Let the name of the program be averageEven so we should be able to call it using the command. P.S. Second value should be greater than first value. 

// Question 7: Write a code that takes integer value and returns the reverse of that.
}
