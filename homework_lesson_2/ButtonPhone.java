package com.lessons.org.lesson_2.homework_lesson_2;

public class ButtonPhone extends Phone{
    private long ownNumber;

    public long getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(long ownNumber) {
        this.ownNumber = ownNumber;
    }

    @Override
    public void call(long number1) {
        super.call(number1);
    }

    @Override
    public void receiveCall(long number2) {
        super.receiveCall(number2);
    }
}
