package ua.com.security4you.basepattern.creational.abstractFactory.website;

import ua.com.security4you.basepattern.creational.abstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests php code...");
    }
}
