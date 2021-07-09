package model;

public enum DiceEnum {

    MIN(1),
    MAX(6);

    int NUM;

    DiceEnum() {
    }

    DiceEnum(int NUM) {
        this.NUM = NUM;
    }

    public int getNUM() {
        return NUM;
    }

    public void setNUM(int NUM) {
        this.NUM = NUM;
    }
}
