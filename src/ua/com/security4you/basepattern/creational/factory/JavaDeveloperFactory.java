package ua.com.security4you.basepattern.creational.factory;

public class JavaDeveloperFactory implements DeveloperFActory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
