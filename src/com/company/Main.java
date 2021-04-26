package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        int [] ints = new int[10];
//        int [] femTal = {1,2,3,4,5};

//        int antal = Indput.getTal("angiv antal : ");
//
//        Person [] people = new Person[antal];
//
//        opretPersoner(people);
//        udskrivAlle(people);

//        Person person = new Person("nik", 49);
//
//        System.out.println(person.getNavn());
//
//        System.out.println(person.hashCode());
//
//        System.out.println(person.toString());



     //   System.out.println(person.getNavn());

        List<String> stringList = new ArrayList<>();

        stringList.add("hej");
        stringList.add("med");
        stringList.add("dig");
        stringList.add("nu");
        stringList.add("er");
        stringList.add("det");
        stringList.add("snart");
        stringList.add("sommer");


        for (String s : stringList) {

        }

        List<Person> personList = new ArrayList<>();

        Person person1 = new Person("peter", 55);
        Person person2 = new Person("Charlotte", 52);
        Person person3 = new Person("Andreas", 35);
        Person person4 = new Person("Andreas", 30);
        Person person5 = new Person("Daniel", 34);

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);

        for (Person p : personList) {

            System.out.println(p.getNavn());
            System.out.println(p.getAlder());
        }


        Konto konto = new Konto(person1, 120);

        Konto konto1 = new Konto(new Person("nik", 49) , -12);

        System.out.println(konto.getPerson().getNavn() + konto.getPerson().getAlder() + konto.getSaldo());




    }    // her slutter min main.







    public static void opretPersoner (Person [] people) {

        for (int i = 0; i < people.length ; i++) {

            Person person = new Person(Indput.getTekst("skriv navn : "), Indput.getTal("angiv alder : "));

            people[i] = person;
        }

    }

    public static void udskrivAlle(Person [] people  ) {




        for (int i = 0; i < people.length; i++) {

//            System.out.println("navn :" + dataPars[i].navn);
//            System.out.println("alder :" + dataPars[i].alder);

            people[i].udskrivData();

        }



    }


}
