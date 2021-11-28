package com.BMICalculator;

public class BMI {
    private int height;
    private double weight;
    private double bmi = weight / height / height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBmi() {
        return bmi;
    }

    public double getResult() {
        double result = (this.weight * 10000) / (this.height * this.height);
        return result;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

}
