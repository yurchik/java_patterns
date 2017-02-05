package ua.com.security4you.basepattern.creational.abstractFactory.website;

import ua.com.security4you.basepattern.creational.abstractFactory.Developer;
import ua.com.security4you.basepattern.creational.abstractFactory.ProjectManager;
import ua.com.security4you.basepattern.creational.abstractFactory.ProjectTeamFactory;
import ua.com.security4you.basepattern.creational.abstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjektManager() {
        return new WebSitePM();
    }
}
