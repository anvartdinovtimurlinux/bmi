package com.anvartdinov;

public class Main {

    public static void main(String[] args) {
        BmiService bmiCalculator = new BmiService();
        int weight = 95;  // В килограммах
        int height = 186;  // В сантиметрах

        double bmi = bmiCalculator.calculate(height, weight);
        System.out.println("Ваш индекс массы тела равен: " + bmi);
    }
}
