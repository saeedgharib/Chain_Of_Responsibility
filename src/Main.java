//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger warningLogger = new DatabaseLogger(AbstractLogger.WARNING);
        AbstractLogger infoLogger = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        errorLogger.setNextLogger(warningLogger);
        warningLogger.setNextLogger(infoLogger);
        infoLogger.setNextLogger(fileLogger);
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        loggerChain.logMessage(AbstractLogger.WARNING, "This is a warning message.");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error message.");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an Debug message.");
    }

}







