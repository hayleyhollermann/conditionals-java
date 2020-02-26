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

    }
}
