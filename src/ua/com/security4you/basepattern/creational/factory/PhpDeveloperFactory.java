package ua.com.security4you.basepattern.creational.factory;

/**
 * Created by yurchik on 2/1/17.
 */
public class PhpDeveloperFactory implements DeveloperFActory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
