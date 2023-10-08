package com.lessons.org.lesson_2.homework_lesson_2;

public class PhoneApp {
    public static void main(String[] args){

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.setPhoneName("Motorola");
        smartPhone.setOwnNumber(1533266654);

        System.out.println("The phone " + smartPhone.getPhoneName() + " " + smartPhone.getOwnNumber() );
        smartPhone.call(1200333564);

        System.out.println("The phone " + smartPhone.getPhoneName() + " " + smartPhone.getOwnNumber() );
        smartPhone.receiveCall(1200333564);

        RadioPhone radioPhone = new RadioPhone();
        radioPhone.setPhoneName("Pixel");
        radioPhone.setOwnNumber(1633322156);

        System.out.println("The phone " + radioPhone.getPhoneName() + " " + radioPhone.getOwnNumber() );
        radioPhone.call(1200333564);

        System.out.println("The phone " + radioPhone.getPhoneName() + " " + radioPhone.getOwnNumber() );
        radioPhone.receiveCall(1200333564);

        ButtonPhone buttonPhone = new ButtonPhone();
        buttonPhone.setPhoneName("iPhone");
        buttonPhone.setOwnNumber(1386655481);

        System.out.println("The phone " + buttonPhone.getPhoneName() + " " + buttonPhone.getOwnNumber() );
        buttonPhone.call(1200333564);

        System.out.println("The phone " + buttonPhone.getPhoneName() + " " + buttonPhone.getOwnNumber() );
        buttonPhone.receiveCall(1200333564);
    }
}
