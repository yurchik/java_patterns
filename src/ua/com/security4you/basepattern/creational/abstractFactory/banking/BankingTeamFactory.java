package ua.com.security4you.basepattern.creational.abstractFactory.banking;

import ua.com.security4you.basepattern.creational.abstractFactory.Developer;
import ua.com.security4you.basepattern.creational.abstractFactory.ProjectManager;
import ua.com.security4you.basepattern.creational.abstractFactory.ProjectTeamFactory;
import ua.com.security4you.basepattern.creational.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjektManager() {
        return new BankingPM();
    }
}
