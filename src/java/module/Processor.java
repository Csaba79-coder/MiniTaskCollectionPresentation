package module;

import array.Arrays;
import controller.DiceController;
import set.Sets;
import utils.FileHandler;

public class Processor {


    public static void run() {
        Integer[] numbers = {1, 2, 7, 2, 3, 4, 10, 8, 9, 11, 5, 4, 3, 6, 5, 6, 5, 1, 8, 10, 9, 15};
        int num = 1000;


        Sets sets = new Sets();
        sets.printSet(sets.setSets(numbers));
        sets.printSet(sets.setSetsOddNums(numbers));
        sets.printSet(sets.setSetEvenNums(numbers));

        DiceController diceController = new DiceController();
        diceController.throwingWithDices = diceController.throwWithDice(num);
        // diceController.printThrowWithDice(diceController.throwingWithDices);
        diceController.printThrownWithDice();

        int[] numbers2 = {34808, 422, 334, 12014, 412617, 292389, 342260, 32244, 334534, 497721, 3775, 544, 433, 55340,
                257952, 1496173, 539141, 3355, 305720, 3677429, 114047, 5656};
        // int[] numbers3 = {1, 10, 2, 100, 2};
        // int[] numbers4 = {0, 1, 2, 3, 4};

        Arrays arrays = new Arrays();
        arrays.printIsElementDuplicated(arrays.isElementDuplicated(numbers2));
        // arrays.printIsElementDuplicated(arrays.isElementDuplicated(numbers3));
        // arrays.printIsElementDuplicated(arrays.isElementDuplicated(numbers4));
        arrays.getDigitHope(numbers2);

        FileHandler fileHandler = new FileHandler();
        fileHandler.readFile("Class.txt");
    }
}
