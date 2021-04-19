package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        int [] ints = new int[10];
//        int [] femTal = {1,2,3,4,5};

        int antal = Indput.getTal("angiv antal : ");

        Person [] people = new Person[antal];

        opretPersoner(people);
        udskrivAlle(people);

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
