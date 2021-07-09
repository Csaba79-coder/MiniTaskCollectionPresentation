package model;

public class Dice {

    public DiceEnum MIN;
    public DiceEnum MAX;

    public Dice() {
    }

    public Dice(DiceEnum MIN, DiceEnum MAX) {
        this.MIN = MIN;
        this.MAX = MAX;
    }
}
