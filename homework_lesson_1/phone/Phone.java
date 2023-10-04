package com.lessons.org.lesson_1.homework_lesson_1.phone;

public class Phone {
    int number;
    double weight;
    String model;
    String name;

    public Phone(int number, double weight, String model) {
        this.number = number;
        this.weight = weight;
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public double getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }




    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }


}
