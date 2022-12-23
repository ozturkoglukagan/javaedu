public class Recitation7 {
// 0) Given an array, write a method that returns true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the remaining numbers on the other side.*/

// 1) Create an "Account" class that represents a bank account of a person.
//  All accounts must hold the information of an account number, account holder's 
//  name, currency, and initial deposit amount.


// If the account holder's name is not given,
//   by default, it should be "Jane Doe". Also, if the initial deposit is not supplied, 
//   the balance should be 0. 

// Within this account, you should be able to deposit any amount,
//    withdraw as much as your balance, and close the account, which resets the balance amount to 0, 
//    and does not allow any deposit or withdrawal actions.

//Also, write a method that shows 
//    the current account information.

// 2) Create a Rectangle class that has the length and width attributes. From the main method, we should be able to 

// Draw the circumference of the given rectangle object, where top and bottom borders are - as many as length, and sides for each row are | (as many as width minus 2) with space in between (as many as length minus 2). Examples for smaller values are below.
// Compute the area multiplied by a given number. 
// So we should be able to do the following:
// Rectangle rectangle = new Rectangle(5,10); // even if we wrote new Rectangle(10,5), it should create the same object and provide the "exact same" outputs!
// rectangle.draw();
// ----------
// |        |
// |        |
// |        |
// ----------
// int fourAreas=rectangle.area(4); // four times the area so fourAreas becomes 200.
// Rectangle rectangle2 = new Rectangle(2,3);
// rectangle2.draw();
// ---
// ---
// Rectangle rectangle3 = new Rectangle(5,1);
// rectangle3.draw();
// -----
// int fiveAreas=rectangle3.area(5); // five times the area so fiveAreas becomes 25.
// Rectangle rectangle4 = new Rectangle(4,3);
// rectangle4.draw();
// ----
// |  |
// ----
// int fiveAreas=rectangle4.area(5); // five times the area so fiveAreas becomes 60.
}
