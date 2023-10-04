package com.lessons.org.lesson_1.homework_lesson_1.phone;

public class PhoneApp {
    public static void main(String[] args){

        Phone phone1 = new Phone(415233455, 0.2, "XC10");
        Phone phone2 = new Phone(166322411, 0.25, "P10 Pro");
        Phone phone3 = new Phone(213551232, 0.15, "M25");

        System.out.println(phone1.getNumber());
        System.out.println(phone1.getWeight());
        System.out.println(phone1.getModel());

        System.out.println(" ");

        System.out.println(phone2.getNumber());
        System.out.println(phone2.getWeight());
        System.out.println(phone2.getModel());

        System.out.println(" ");

        System.out.println(phone3.getNumber());
        System.out.println(phone3.getWeight());
        System.out.println(phone3.getModel());

        System.out.println(" ");

        phone1.receiveCall("Alex");
        System.out.println(phone1.getNumber());

        System.out.println(" ");

        phone2.receiveCall("Mike");
        System.out.println(phone2.getNumber());

        System.out.println(" ");

        phone3.receiveCall("Larry");
        System.out.println(phone3.getNumber());


    }
}
