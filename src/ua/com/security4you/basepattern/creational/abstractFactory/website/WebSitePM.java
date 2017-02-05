package ua.com.security4you.basepattern.creational.abstractFactory.website;

import ua.com.security4you.basepattern.creational.abstractFactory.ProjectManager;

public class WebSitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages site project...");
    }
}
