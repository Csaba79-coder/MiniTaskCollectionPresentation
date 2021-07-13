package controller;

import model.Dice;
import utils.Random;

import java.util.HashMap;

public class DiceController {

    int throwing = 0;
    public HashMap<Integer, Integer> throwingWithDices = new HashMap<>();
    Random random = new Random();
    Dice dice = new Dice();
    int counterOne;
    int counterTwo;
    int counterThree;
    int counterFour;
    int counterFive;
    int counterSix;


    public HashMap<Integer, Integer> throwWithDice(int throwing) {
        for (int i = 0; i < throwing; i++) {
            int numThrownWithDice = random.getRandomNumberForDice(dice.MIN, dice.MAX);
            var put = throwingWithDices.put((this.throwing + 1), numThrownWithDice);
            this.throwing++;
            if (numThrownWithDice == 1) {
                counterOne++;
            } else if (numThrownWithDice == 2) {
                counterTwo++;
            } else if (numThrownWithDice == 3) {
                counterThree++;
            } else if (numThrownWithDice == 4) {
                counterFour++;
            } else if (numThrownWithDice == 5) {
                counterFive++;
            } else {
                counterSix++;
            }
        }
        return throwingWithDices;
    }

    public void printThrowWithDice(HashMap<Integer, Integer> map) {
        System.out.println(map);
    }

    public void printThrownWithDice() {
        System.out.println("One: " + counterOne);
        System.out.println("Two: " + counterTwo);
        System.out.println("Three: " + counterThree);
        System.out.println("Four: " + counterFour);
        System.out.println("Five: " + counterFive);
        System.out.println("Six: " + counterSix);
        System.out.println("Altogether: " + (counterOne + counterTwo + counterThree + counterFour + counterFive + counterSix));
    }
}

