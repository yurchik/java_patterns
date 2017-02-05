package ua.com.security4you.basepattern.creational.factory;

public class CppDeveloperFactory implements DeveloperFActory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
