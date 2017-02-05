package ua.com.security4you.basepattern.creational.factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFActory developerFActory = createDeveloperBySpeciality("python");
        Developer developer = developerFActory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFActory createDeveloperBySpeciality(String speciality) {
        if (speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(speciality + " is unknown speciality.");
        }
    }
}

