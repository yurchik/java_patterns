package ua.com.security4you.basepattern.creational.prototype;

public class VersionControllRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "SuperProject", "SourceCode sourceCode = new SourseCode()");

        System.out.println(master);

        ProjectFactory projectFactory = new ProjectFactory(master);
        Project cloneProject = projectFactory.cloneProject();
        System.out.println("\n======================================\n");
        System.out.println(cloneProject);
    }
}
