package set;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    Set<Integer> setOfNums = new HashSet<>();
    Set<Integer> setOfOddNums = new HashSet<>();
    Set<Integer> setOfEvenNums = new HashSet<>();

    public Sets() {
    }

    public Sets(Set<Integer> setOfNums) {
        this.setOfNums = setOfNums;
    }

    public Set<Integer> setSets(Integer[] numbers) {
        for (Integer number : numbers) {
            var add = setOfNums.add(number);
        }
        return setOfNums;
    }

    public void printSet(Set<Integer> arraysSet) {
        int i = 0;
        while (i < arraysSet.size()) {
            i++;
        }
        System.out.println(arraysSet);
    }

    public Set<Integer> setSetsOddNums(Integer[] numbers) {
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                var add = setOfOddNums.add(number);
            }
        }
        return setOfOddNums;
    }

    public Set<Integer> setSetEvenNums(Integer[] numbers) {
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                var add = setOfEvenNums.add(number);
            }
        }
        return setOfEvenNums;
    }
}