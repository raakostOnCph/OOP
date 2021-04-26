package com.company;

public class Konto
{

    private Person person;

    private int saldo;

    public Konto(Person person, int saldo)
    {
        this.person = person;
        this.saldo = saldo;
    }


    public Person getPerson()
    {
        return person;
    }

    public void setPerson(Person person)
    {
        this.person = person;
    }

    public int getSaldo()
    {
        return saldo;
    }

    public void setSaldo(int saldo)
    {
        this.saldo = saldo;
    }


}
