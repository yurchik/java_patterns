package ua.com.security4you.basepattern.creational.abstractFactory;

import ua.com.security4you.basepattern.creational.abstractFactory.banking.BankingTeamFactory;

public class SuperBankProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjektManager();

        System.out.println("Start super bank project...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
