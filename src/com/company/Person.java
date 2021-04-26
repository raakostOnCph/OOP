package com.company;

public class Person
{

   private String navn;
    private int alder;


    // det her er constructoren


    public Person(String navn, int alder)
    {
        this.navn = navn;
        this.alder = alder;
    }

    public String getNavn()
    {
        return navn;
    }

    public int getAlder()
    {
        return alder;
    }

    public void setNavn(String navn)
    {
        this.navn = navn;
    }

    public void setAlder(int alder)
    {
        if(alder < 125 && alder > 0 ) {

            this.alder = alder;
        }
    }

    public void udskrivData() {

        System.out.println("navn : " + navn );
        System.out.println("alder : " + alder );


    }


}
