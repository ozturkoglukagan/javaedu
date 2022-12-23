import java.util.Random; // for generating random results

public class SlotMachine { // class SlotMachine

public static void main(String[] args) { // main method

long initialAmount = 100; // initial amount
long remainingAmount = initialAmount; // for storing remaining amounts
long bet = 5; // initial bet
int round = 0; // for counting rounds
int tripled = 0; // for counting triples
int doubled = 0; // for counting doubles
int lost = 0; // for counting losses

String[] slot1 = {"Tree", "Apple", "Star", "Ball", "Flower", "Cat"}; // slot 1
String[] slot2 = {"Tree", "Apple", "Star", "Ball", "Flower", "Cat"}; // slot 2
String[] slot3 = {"Tree", "Apple", "Star", "Ball", "Flower", "Cat"}; // slot 3

while(round < 200) { // run loop for 200 rounds
Random random = new Random(); // object of random class

// generating 3 random numbers between 0 - 5 (inclusive)
int forSlot1 = random.nextInt(6);
int forSlot2 = random.nextInt(6);
int forSlot3 = random.nextInt(6);

boolean one_two = slot1[forSlot1].equals(slot2[forSlot2]); // checking if slot 1 and 2 are equal
boolean two_three = slot2[forSlot2].equals(slot3[forSlot3]); // checking if slot 2 and 3 are equal
boolean one_three = slot1[forSlot1].equals(slot3[forSlot3]); // checking if slot 1 and 3 are equal

if(one_two && two_three) { // if all three have same outcomes

remainingAmount += bet * 3; // add three times bet value in remaining amount
bet *= 2; // double the bet value
tripled++; // increase tripled by 1
}
else if(one_two || two_three || one_three) { // if any two of slots have same output
remainingAmount += bet * 2; // add two times bet value in remaining amount
bet *= 2; // double the bet value
doubled++; // increase doubled by 1
}

else { // if all have different outcomes
remainingAmount -= bet; // subtract bet value from the remaining amount

if(bet > remainingAmount) // if bet value is greater than remaining amount value
bet = remainingAmount; // bet value will equal to remaining amount value
lost++; // increase lost by 1
}
round++; // increase round by 1

if(bet == 0) // if value of bet is equal to 0
break; // break the loop
}
System.out.println("Initial Amount: " + initialAmount); // print initial amount on first line

// printing required game details on the screen
System.out.println("The slot machine was played " + round + " rounds.The bet was tripled " + tripled +
" times, doubled " + doubled + " times, and lost " + lost + " times. The final money you have " +
"is " + remainingAmount + ".");
}
}