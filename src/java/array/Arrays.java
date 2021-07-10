package array;

import java.util.*;

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

    private static int[] getNumOfDigits(int[] number) {
        int[] numOfDigits = new int[number.length];
        for (int i = 0; i < number.length; i++) {
            int var1 = number[i];
            while (var1 != 0) {
                numOfDigits[i]++;
            }
            System.out.println("A tömböm " + i + ". eleme " + numOfDigits[i] + " db karakterből áll.");
        }
        return numOfDigits;
    }

    private static Set<Integer> getSet(int number) {
        Set<Integer> digitsOfElement = new HashSet<>();
        while (number != 0) {
            digitsOfElement.add(number % 10);
            number /= 10;
        }
        return digitsOfElement;
    }

    private static int getNumOfDigit(int num) {
        int var1 = num;
        int result = 0;
        while (var1 != 0) {
            var1 = var1 / 10;
            result++;
            return result;
        }
        return var1;
    }

    public HashMap<Integer, ArrayList<Integer>> resultOfDigitsAndNums(int[] array) {
        HashMap<Integer, ArrayList<Integer>> hashMapOfDigitOfNums = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int digits = getNumOfDigit(array[i]);
            hashMapOfDigitOfNums.putIfAbsent(digits, new ArrayList<>());
            List<Integer> value = hashMapOfDigitOfNums.get(digits);
            value.add(array[i]);
            hashMapOfDigitOfNums.put(digits, (ArrayList<Integer>) value);
        }
        return hashMapOfDigitOfNums;
    }


    public HashMap<Integer, List<Integer>> resOfDigitNums(int[] array) {
        HashMap<Integer, List<Integer>> groupOfNumsByDigitsSelection = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int currentLength = String.valueOf(array[i]).length();
            if (groupOfNumsByDigitsSelection.containsKey(currentLength)) {
                groupOfNumsByDigitsSelection.get(currentLength).add(array[i]);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(array[i]);
                groupOfNumsByDigitsSelection.put(currentLength, list);
            }
        }
        return groupOfNumsByDigitsSelection;
    }
}
