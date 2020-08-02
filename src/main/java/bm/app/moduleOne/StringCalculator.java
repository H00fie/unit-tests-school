package bm.app.moduleOne;

import lombok.var;

public class StringCalculator {


    public int add(String input) {
        if (input.isEmpty()) {
            return 0;
        }
        var finalNumber = 0;
        String[] numbers = input.split(",");
        if (numbers.length == 1) {
            finalNumber = getIntFrom(numbers[0]);
        } else {
            for (int i = 0; i < numbers.length; i++) {
                finalNumber += getIntFrom(numbers[i]);
            }
        }
        return finalNumber;
    }

    private int getIntFrom(String number) {
        return Integer.parseInt(number);
    }
}
