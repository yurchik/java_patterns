package ua.com.security4you.basepattern.creational.abstractFactory.banking;

import ua.com.security4you.basepattern.creational.abstractFactory.Tester;

public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA Tester tests java code...");
    }
}
