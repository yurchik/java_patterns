package ua.com.security4you.basepattern.creational.singletone;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("First log ...");
        ProgramLogger.getProgramLogger().addLogInfo("Second log ...");
        ProgramLogger.getProgramLogger().addLogInfo("Third log ...");

        ProgramLogger.getProgramLogger().showLogFile();
    }
}
