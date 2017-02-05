package ua.com.security4you.basepattern.creational.abstractFactory.banking;

import ua.com.security4you.basepattern.creational.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer write Java code!");
    }
}
