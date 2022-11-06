package com.company.ObserverPattern.Observer;


import com.company.ObserverPattern.Observable.IObservable;

public abstract class User implements IObserver
{
    private final String name;
    private final String surname;
    private boolean isMember;

    public User(String name, String surname, IObservable observable)
    {
        this.name = name;
        this.surname = surname;
        observable.add(this);

    }

    public User(String name, String surname, boolean isMember, IObservable observable)
    {
        this.name = name;
        this.surname = surname;
        this.isMember = isMember;
        observable.add(this);

    }

    public void setMember(boolean member) {
        isMember = member;
    }

    public String getFullName()
    {
        return getName() + " " + getSurname();
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public boolean isMember() {
        return isMember;
    }
}
