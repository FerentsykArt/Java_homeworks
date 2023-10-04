package com.lessons.org.lesson_1.homework_lesson_1.person;

public class PersonApp {
    public static void main(String[] args){

        Person person = new Person();
        person.setName("Maxim");
        person.setFullName("Maxim Maximov");
        person.setAge(30);

        Person person2 = new Person("Artem", "Ferencik Artem", 34);

        person.move();
        person.talk();

        person2.move();
        person2.talk();



    }
}
