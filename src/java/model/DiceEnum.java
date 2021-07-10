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


   /* public final String label;
    public final int num;

    MyEnum(String label, int num) {
        this.label = label;
        this.num = num;

    public MyEnum getEnumByNum(int num) {
        for (MyEnum myEnum : values()) {
            if (myEnum.num == num)
                return myEnum;
        }
        return null;
    }*/
}
