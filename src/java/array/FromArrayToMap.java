package array;

import java.util.HashMap;

public class FromArrayToMap {

    public HashMap<Integer, Integer> digitOfNums = new HashMap<>();

    public FromArrayToMap() {
    }

    public FromArrayToMap(HashMap<Integer, Integer> digitOfNums) {
        this.digitOfNums = digitOfNums;
    }

    public HashMap<Integer, Integer> getDigitOfNums(int[] array) {
        int num;
        int digit = 0;
        for (int i = 0; i < array.length; i++) {
            num = array[i];
            for (int j = 0; j < array[i]; j++) {
                do {
                    array[i] /= 10;
                    digit++;
                } while (array[i] != 0);
                digitOfNums.put(num, digit);
            }
        }
        return digitOfNums;
    }
}
