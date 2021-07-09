package utils;

import model.DiceEnum;

public class Random {


    public Random() {
    }

//    public int getRandomNumber(int min, int max) {
//        return (int) ((Math.random() * ((max+1) - min)) + min);
//    }

    // for random generator! needs max +1 value for using dice correctly!

    public int getRandomNumber(DiceEnum MIN, DiceEnum MAX) {
        return (int) ((Math.random() * ((DiceEnum.MAX.getNUM() + 1) - DiceEnum.MIN.getNUM())) + DiceEnum.MIN.getNUM());
    }
}
