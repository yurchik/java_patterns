package ua.com.security4you.basepattern.creational.abstractFactory;

import ua.com.security4you.basepattern.creational.abstractFactory.website.WebsiteTeamFactory;

public class AuctionWebsiteProject {

    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjektManager();

        System.out.println("Start Auction project...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }

}
