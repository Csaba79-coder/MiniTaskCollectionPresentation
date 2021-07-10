package array;

import java.util.HashSet;
import java.util.Set;

public class Arrays {

    public Arrays() {
    }


    public boolean isElementDuplicated(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[i] == (arrays[j])) {
                    System.out.println(arrays[i]);
                    System.out.println(arrays[j]);
                    return true;
                }
            }
        }
        return false;
    }

    public void printIsElementDuplicated(boolean bool) {
        if (bool) { // if (bool == true)
            System.out.println("There is element duplication");
        } else {
            System.out.println("There is no element duplication");
        }
    }

 /*   public int countDigits(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            while (array[i] > 0) {
                count++;
                array[i] = (array[i] / 10);
            }
            System.out.println( (array[i] + 1)  + " has the following digits: " + count);
            return count;
        }
        return count;
    }*/

    public void getDigitHope(int[] array) {
        int[] digits = new int[array.length];
        int num;
        for (int i = 0; i < array.length; i++) {
            num = array[i];
            do {
                array[i] /= 10;
                digits[i]++;
            } while (array[i] != 0);
            System.out.println(num + " number has the following digit: " + digits[i]);
        }
    }

    public void checkUniqueDigits(int[] array) {
        Set<Integer> numOfUniqueDigits = new HashSet<>();
        int[] uniqueDigits = new int[array.length];

        for (int i = 0; i < uniqueDigits.length; i++) {
            numOfUniqueDigits.add(uniqueDigits[i]);
        }
        System.out.println();
    }

//    public int getDigits(int[] array) {
//        int digit = 0;
//        for (int i = 0; i < array.length; i++) {
//            do {
//                array[i] /= 10;
//                digit++;
//            } while (array[i] != 0);
//            return digit;
//        }
//        return digit;
//    }

/*    public void printDigits(int[] array) {
        int count = countDigits(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " has the following digits: " + count);
        }
    }*/
}
