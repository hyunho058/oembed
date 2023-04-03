package com.example.oembed.codet;

public class Required01QuarterCalculate {

    public static final int QUARTER = 3;
    public int quarterCalculate(int month) {
        int result = month / QUARTER;

        if (month % QUARTER != 0){
            result ++;
        }

        return result;
    }

}
