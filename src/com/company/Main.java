package com.company;

public class Main {

    public static void main(String[] args) {

	    boolean isAlien = false;
	    if (isAlien) {
            System.out.println("IT IS AN ALIEN");
        } else if(!isAlien) {
            System.out.println("it is not an alien!");
        }

	    int topScore = 80;
	    int maxScore = 100;
	    if (topScore == maxScore){
            System.out.println("YOU WIN");
        } else if (topScore >= 50 && topScore < maxScore){
            System.out.println("SO CLOSE");
        } else {
            System.out.println("Try harder next time!");
        }

        int minRange = -10;
	    int maxRange = 10;
	    int testNumber = 50;
	    if (testNumber > maxRange || testNumber < minRange) {
            System.out.println("outside of range");
        }

	    boolean isCar = true;

	    boolean wasCar = isCar ? true : false;
	    if (wasCar){
            System.out.println("IT'S A CAR!!");
        }

	    int ageOfClient = 10;
	    boolean isEighteenOrOver = ageOfClient > 18 ? true : false;

	    if (isEighteenOrOver){
            System.out.println("he's over 18!");
        }

	    // CHALLENGE
        // 1. Create a double variable w/ val 20.00
        double numOne = 20.00d;

        // 2. Create a double variable w/ val 80.00
        double numTwo = 80.00d;

        // 3. Add both together and multiply by 100.00
        double result = (20.00d + 80.00d) * 100.00d;

        // 4. Use remainder operator to find remainder of #3 answer and 40.00
        double remainder = result % 40.00d;

        // 5. Create a boolean that assigns value true if #4 is 0 or false if not 0
        boolean hasRemainder = (remainder != 0) ? true : false;

        // 6. Output boolean value
        System.out.println(hasRemainder);

        // 7. write if-then that displays a message if there is a remainder
        if (hasRemainder){
            System.out.println("There is a remainder");
        }

    }
}
