package com.lessons.org.lesson_2.homework_lesson_2;

public class Phone {
    private String phoneName;

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public void call(long number1) {
        System.out.println(" try to make a call to number " + number1);
    }

    public void receiveCall(long number2) {
        System.out.println(" try to receive a call from number " + number2);
    }

}
