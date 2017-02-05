package ua.com.security4you.basepattern.creational.abstractFactory.banking;

import ua.com.security4you.basepattern.creational.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
