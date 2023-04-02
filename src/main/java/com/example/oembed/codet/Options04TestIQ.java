package com.example.oembed.codet;

public class Options04TestIQ {
    public String test(String numbers) {
        int oddNumberPosition = 0;
        int evenNumberPosition = 0;
        int oddCount = 0;
        int evenCount = 0;

        String[] numberArray = numbers.split(" ");

        for (int i = 0; i < numberArray.length; i++) {
            int number = Integer.parseInt(numberArray[i]);
            if ((number % 2) == 0) {
                evenNumberPosition = i;
                evenCount++;
                continue;
            }

            oddNumberPosition = i;
            oddCount++;
        }

        if (oddCount > evenCount) {
            return (evenNumberPosition + 1) + " # " +numberArray[evenNumberPosition]+"만 짝수";
        }

        return (oddNumberPosition + 1) + " # " +numberArray[oddNumberPosition]+"만 홀수";
    }
}
