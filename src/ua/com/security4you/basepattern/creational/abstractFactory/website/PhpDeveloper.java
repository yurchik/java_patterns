package ua.com.security4you.basepattern.creational.abstractFactory.website;

import ua.com.security4you.basepattern.creational.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
