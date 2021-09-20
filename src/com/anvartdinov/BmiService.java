package com.anvartdinov;

public class BmiService {

    public double calculate(int height, int weight) {
        double normalizedHeight = height / 100.0;
        double bmi = weight / (normalizedHeight * normalizedHeight);
        return bmi;
    }

}
